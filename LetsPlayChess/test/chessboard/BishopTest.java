package chessboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.ChessBoardException;

public class BishopTest {

	private Bishop bishop = new Bishop();

	@Test
	public void testPossibleMovesForBishopForProperInput() throws ChessBoardException {
		String possibleMoves = bishop.possibleMovesAvailable("D5");
		assertEquals("C4,C6,B3,B7,A2,A8,E4,E6,F3,F7,G2,G8,H1", possibleMoves);

	}

	@Test
	public void testPossibleMovesForBishopForBorderConditionOfRow() throws ChessBoardException {
		String possibleMoves = bishop.possibleMovesAvailable("A1");
		assertEquals("B2,C3,D4,E5,F6,G7,H8", possibleMoves);

	}
}
