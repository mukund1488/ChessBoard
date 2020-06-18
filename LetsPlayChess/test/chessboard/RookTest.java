package chessboard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class RookTest {

	private Rook rook = new Rook();

	@Test
	public void testPossibleMovesForKingForProperInput() {
		String possibleMoves = rook.possibleMovesAvailable("D5");
		assertEquals("A5,B5,C5,D1,D2,D3,D4,D5,D6,D7,D8,E5,F5,G5,H5", possibleMoves);

	}

	/*
	 * @Test public void testPossibleMovesForKingForBorderConditionOfRow() { String
	 * possibleMoves = rook.possibleMovesAvailable("H5");
	 * assertEquals("No Possible Move Left for Pawn", possibleMoves);
	 *
	 * }
	 */

}
