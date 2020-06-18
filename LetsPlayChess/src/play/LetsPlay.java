package play;

import chessboard.ChessPiece;
import exception.ChessBoardException;
import factory.ChessPieceFactory;

/*
 * EntryPoint to chess board application
 * Provide input with Chess Piece Name and Current Position
 * eg java LetsPlay King D5
 * It will print list of possible movement for the piece provided
 * in input
 */
public class LetsPlay {

	public static void main(String[] args) {

		try {
			ChessPiece chessPiece = ChessPieceFactory.getChessPiece(args[0]);
			String possibleMoves = chessPiece.possibleMovesAvailable(args[1]);
			System.out.println(
					"Possible moves for" + args[0] + " with current position" + args[1] + "are: " + possibleMoves);
		} catch (ChessBoardException e) {
			System.out.println("Invalid input provided, please provide proper input");
		}

	}

}
