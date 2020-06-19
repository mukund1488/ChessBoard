package chessboard;

import chessboard.movement.BishopMovement;
import chessboard.movement.RookMovement;
import exception.ChessBoardException;

public class Queen extends ChessPiece implements RookMovement, BishopMovement {

	@Override
	public String possibleMovesAvailable(String currentPosition) throws ChessBoardException {
		try {

			int inputColPosition = retrieveColPositionFromInput(currentPosition);
			int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
			return (possibleMovesForBishop(chessBoard, inputRowPosition, inputColPosition) + ","
					+ possibleMovesForRook(chessBoard, inputRowPosition, inputColPosition));
		} catch (ChessBoardException ex) {
			throw ex;
		}

	}

}
