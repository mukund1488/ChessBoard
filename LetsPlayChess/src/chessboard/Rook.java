package chessboard;

import chessboard.movement.RookMovement;
import exception.ChessBoardException;

public class Rook extends ChessPiece implements RookMovement {

	@Override
	public String possibleMovesAvailable(String currentPosition) throws ChessBoardException {
		try {
			int inputColPosition = retrieveColPositionFromInput(currentPosition);
			int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
			return possibleMovesForRook(chessBoard, inputRowPosition, inputColPosition);
		} catch (ChessBoardException ex) {
			throw ex;
		}

	}

}
