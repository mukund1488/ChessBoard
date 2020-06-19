package chessboard;

import chessboard.movement.BishopMovement;
import exception.ChessBoardException;

public class Bishop extends ChessPiece implements BishopMovement {

	@Override
	public String possibleMovesAvailable(String currentPosition) throws ChessBoardException {
		try {
			int inputColPosition = retrieveColPositionFromInput(currentPosition);
			int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
			return possibleMovesForBishop(chessBoard, inputRowPosition, inputColPosition);
		} catch (ChessBoardException ex) {
			throw ex;
		}
	}

}
