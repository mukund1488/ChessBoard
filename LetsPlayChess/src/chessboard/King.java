package chessboard;

import java.util.StringJoiner;

public class King extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) {

		int inputColPosition = Integer.valueOf(currentPosition.substring(1)) - 1;
		int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
		new StringBuilder();
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

	}

	private int extractEndingPosition(int startPosition) {
		return (startPosition != 7) ? startPosition + 1 : startPosition;
	}

	private int retrieveStartingPosition(int endingPosition) {
		return (endingPosition != 0) ? endingPosition - 1 : 0;
	}
}
