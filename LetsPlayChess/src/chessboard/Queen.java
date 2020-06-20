package chessboard;

import chessboard.movement.MovementUtil;
import exception.ChessBoardException;

public class Queen extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) throws ChessBoardException {
		try {

			int inputColPosition = retrieveColPositionFromInput(currentPosition);
			int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
			return (MovementUtil.possibleMovesDiagonally(chessBoard, inputRowPosition, inputColPosition) + ","
					+ MovementUtil.possibleMovesHorizontalAndVertical(chessBoard, inputRowPosition, inputColPosition));
		} catch (ChessBoardException ex) {
			throw ex;
		}

	}

}
