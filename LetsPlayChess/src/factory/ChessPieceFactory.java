package factory;

import chessboard.Bishop;
import chessboard.ChessPiece;
import chessboard.Horse;
import chessboard.King;
import chessboard.Pawn;
import chessboard.Queen;
import chessboard.Rook;
import exception.ChessBoardException;

/**
 * Factory class to generate Chess tpe based on input
 *
 * @author Mukund1488
 *
 */
public class ChessPieceFactory {

	/**
	 * Method to retrieve Chess Piece Type
	 * 
	 * @param pieceName
	 * @return ChessPiece as per the input
	 * @throws ChessBoardException incase of invalid input
	 */
	public static ChessPiece getChessPiece(String pieceName) throws ChessBoardException {
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
