package play;

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
	String[][] chessBoard;

	public static void main(String[] args) {

		try {
			ChessPieceFactory.getChessPiece(args[0]);
		} catch (ChessBoardException e) {
			System.out.println("Invalid input provided, please provide proper input");
		}

	}

}
