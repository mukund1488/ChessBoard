package chessboard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class KingTest {

	private King king = new King();

	@Test
	public void testPossibleMovesForKingForProperInput() {
		String possibleMoves = king.possibleMovesAvailable("D5");
		assertEquals("C4,C5,C6,D4,D6,E4,E5,E6", possibleMoves);

	}

	@Test
	public void testPossibleMovesForKingForBorderConditionOfRow() {
		String possibleMoves = king.possibleMovesAvailable("A1");
		assertEquals("A2,B1,B2", possibleMoves);

	}

	@Test
	public void testPossibleMovesForKingForBorderConditionOfColumn() {
		String possibleMoves = king.possibleMovesAvailable("H8");
		assertEquals("G7,G8,H7", possibleMoves);

	}

}
