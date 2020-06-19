package chessboard;

import java.util.StringJoiner;

import exception.ChessBoardException;

public class King extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) throws ChessBoardException {
		try {
			int inputColPosition = retrieveColPositionFromInput(currentPosition);
			int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
			int startingPositionForRow = retrieveStartingPosition(inputRowPosition);
			int endingPositionForRow = extractEndingPosition(inputRowPosition);
			int startingPositionForCol = retrieveStartingPosition(inputColPosition);
			int endingPositionForCol = extractEndingPosition(inputColPosition);
			StringJoiner possibleMoves = new StringJoiner(",");
			for (int i = startingPositionForRow; i <= endingPositionForRow; i++) {
				for (int j = startingPositionForCol; j <= endingPositionForCol; j++) {
					if (i == inputRowPosition && j == inputColPosition) {
						continue;
					}
					possibleMoves.add(chessBoard[i][j]);
				}
			}

			return possibleMoves.toString();
		} catch (ChessBoardException ex) {
			throw ex;
		}

	}

	private int extractEndingPosition(int startPosition) {
		return (startPosition != 7) ? startPosition + 1 : startPosition;
	}

	private int retrieveStartingPosition(int endingPosition) {
		return (endingPosition != 0) ? endingPosition - 1 : 0;
	}
}
