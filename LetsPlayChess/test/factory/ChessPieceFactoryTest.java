package factory;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import chessboard.Bishop;
import chessboard.King;
import chessboard.Pawn;
import chessboard.Queen;
import chessboard.Rook;
import exception.ChessBoardException;
import factory.ChessPieceFactory;

public class ChessPieceFactoryTest {

	@Test
	public void shouldReturnInstanceOfKingWhenInputIsKing() {
		try {
			assertTrue(ChessPieceFactory.getChessPiece("king") instanceof King);
		} catch (ChessBoardException e) {
			fail();
		}
	}

	@Test
	public void shouldReturnInstanceOfQueenWhenInputIsQueen() {
		try {
			assertTrue(ChessPieceFactory.getChessPiece("queen") instanceof Queen);
		} catch (ChessBoardException e) {
			fail();
		}
	}

	@Test
	public void shouldReturnInstanceOfPawnWhenInputIsPawn() {
		try {
			assertTrue(ChessPieceFactory.getChessPiece("pawn") instanceof Pawn);
		} catch (ChessBoardException e) {
			fail();
		}
	}

	@Test
	public void shouldReturnInstanceOfBishopWhenInputIsBishop() {
		try {
			assertTrue(ChessPieceFactory.getChessPiece("bishOp") instanceof Bishop);
		} catch (ChessBoardException e) {
			fail();
		}
	}

	@Test
	public void shouldReturnInstanceOfRookgWhenInputIsRook() {
		try {
			assertTrue(ChessPieceFactory.getChessPiece("Rook") instanceof Rook);
		} catch (ChessBoardException e) {
			fail();
		}
	}

	@Test(expected = ChessBoardException.class)
	public void shouldThrowExceptionWhenInputIsInvalid() throws ChessBoardException {
		ChessPieceFactory.getChessPiece("dummy");
	}

}
