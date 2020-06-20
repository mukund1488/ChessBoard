package chessboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.ChessBoardException;

public class RookTest {

	private Rook rook = new Rook();

	@Test
	public void testPossibleMovesForRookForProperInput() throws ChessBoardException {
		String possibleMoves = rook.possibleMovesAvailable("D5");
		assertEquals("A5,B5,C5,D1,D2,D3,D4,D6,D7,D8,E5,F5,G5,H5", possibleMoves);

	}

	@Test(expected = ChessBoardException.class)
	public void testPossibleMovesForExceptionWhenInputColumnIsInvalid() throws ChessBoardException {
		rook.possibleMovesAvailable("H9");

	}

	@Test(expected = ChessBoardException.class)
	public void testPossibleMovesForExceptionWhenInputRowIsInvalid() throws ChessBoardException {
		rook.possibleMovesAvailable("I6");

	}

}
