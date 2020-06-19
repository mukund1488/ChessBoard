package play;

import java.util.Arrays;
import java.util.List;

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

	public String letsPlay(String[] args) throws ChessBoardException {
		try {
			validateInput(args);
			ChessPiece chessPiece = ChessPieceFactory.getChessPiece(args[0]);
			String possibleMoves = chessPiece.possibleMovesAvailable(args[1]);
			System.out.println(
					"Possible moves for " + args[0] + " with current position " + args[1] + " are: " + possibleMoves);
			return possibleMoves;
		} catch (ChessBoardException e) {
			throw e;
		}
	}

	private void validateInput(String[] args) throws ChessBoardException {
		if (args.length != 2) {
			throw new ChessBoardException("Please enter proper input");
		}
		List<String> allowedValuesForChessPieces = Arrays.asList("horse", "king", "queen", "pawn", "rook", "bishop");
		if (!allowedValuesForChessPieces.contains(args[0].toLowerCase())) {
			throw new ChessBoardException(
					"Invalid Chess Piece Provided, please provide one of Horse,Queen,Bishop,King,rook,Pawn to proceed");
		}
		if (!args[1].toLowerCase().matches("[a-h][1-8]")) {
			throw new ChessBoardException("Please enter a valid chess board position");
		}

	}

	public static void main(String[] args) {
		LetsPlay play = new LetsPlay();
		try {
			play.letsPlay(args);
		} catch (ChessBoardException ex) {
			System.out.println("Oops, please check error message for more information:" + ex);
		}

	}

}
