package chessboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.ChessBoardException;

public class QueenTest {

	private Queen queen = new Queen();

	@Test
	public void testPossibleMovesForQueenForProperInput() throws ChessBoardException {
		String possibleMoves = queen.possibleMovesAvailable("D5");
		assertEquals("C4,C6,B3,B7,A2,A8,E4,E6,F3,F7,G2,G8,H1,A5,B5,C5,D1,D2,D3,D4,D5,D6,D7,D8,E5,F5,G5,H5",
				possibleMoves);

	}

	@Test
	public void testPossibleMovesForQueenForBorderConditionOfRow() throws ChessBoardException {
		String possibleMoves = queen.possibleMovesAvailable("A1");
		assertEquals("B2,C3,D4,E5,F6,G7,H8,A1,A2,A3,A4,A5,A6,A7,A8,B1,C1,D1,E1,F1,G1,H1", possibleMoves);

	}

}
