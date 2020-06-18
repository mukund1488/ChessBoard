package factory;

import chessboard.Bishop;
import chessboard.ChessPieces;
import chessboard.Horse;
import chessboard.King;
import chessboard.Pawn;
import chessboard.Queen;
import chessboard.Rook;
import exception.ChessBoardException;

public class ChessPieceFactory {

	public static ChessPieces getChessPiece(String pieceName) throws ChessBoardException {
		switch (pieceName.toLowerCase()) {
		case "king":
			return new King();
		case "queen":
			return new Queen();
		case "horse":
			return new Horse();
		case "rook":
			return new Rook();
		case "bishop":
			return new Bishop();
		case "pawn":
			return new Pawn();
		default:
			throw new ChessBoardException("Invalid Chess Piece Type");

		}
	}

}
