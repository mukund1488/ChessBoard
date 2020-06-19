package chessboard;

import exception.ChessBoardException;

public class Pawn extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) throws ChessBoardException {
		try {
			int inputColPosition = retrieveColPositionFromInput(currentPosition);
			int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
			if (inputRowPosition != 7) {
				return chessBoard[inputRowPosition + 1][inputColPosition];
			} else
				return "No Possible Move Left for Pawn";

		} catch (ChessBoardException ex) {
			throw ex;
		}
	}

}
