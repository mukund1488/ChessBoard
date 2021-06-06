package chessboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.ChessBoardException;

public class PawnTest {

	private Pawn pawn = new Pawn();

	@Test
	public void testPossibleMovesForPawnForProperInput() throws ChessBoardException {
		String possibleMoves = pawn.possibleMovesAvailable("D5");
		assertEquals("E5", possibleMoves);

	}

	@Test
	public void testPossibleMovesForPawnForBorderConditionOfRow() throws ChessBoardException {
		String possibleMoves = pawn.possibleMovesAvailable("H5");
		assertEquals("No Possible Move Left for Pawn", possibleMoves);

	}

	@Test(expected = ChessBoardException.class)
	public void testPossibleMovesForExceptionWhenInputColumnIsInvalid() throws ChessBoardException {
		pawn.possibleMovesAvailable("H9");

	}

	@Test(expected = ChessBoardException.class)
	public void testPossibleMovesForExceptionWhenInputRowIsInvalid() throws ChessBoardException {
		pawn.possibleMovesAvailable("I6");

	}

}
