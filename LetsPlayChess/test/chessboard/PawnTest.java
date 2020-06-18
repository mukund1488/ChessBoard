package chessboard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PawnTest {

	private Pawn pawn = new Pawn();

	@Test
	public void testPossibleMovesForKingForProperInput() {
		String possibleMoves = pawn.possibleMovesAvailable("D5");
		assertEquals("E5", possibleMoves);

	}

	@Test
	public void testPossibleMovesForKingForBorderConditionOfRow() {
		String possibleMoves = pawn.possibleMovesAvailable("H5");
		assertEquals("No Possible Move Left for Pawn", possibleMoves);

	}

}
