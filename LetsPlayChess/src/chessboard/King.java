package chessboard;

import java.util.StringJoiner;

import exception.ChessBoardException;

public class King extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) throws ChessBoardException {
		try {
			int inputColPosition = retrieveColPositionFromInput(currentPosition);
			int inputRowPosition = retrieveRowPositionFromInput(currentPosition);

			int startingPositionForRow = extractStartingPosition(inputRowPosition);
			int endingPositionForRow = extractEndingPosition(inputRowPosition);
			int startingPositionForCol = extractStartingPosition(inputColPosition);
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

	private int extractEndingPosition(int currentPosition) {
		return (currentPosition != 7) ? currentPosition + 1 : currentPosition;
	}

	private int extractStartingPosition(int currentPosition) {
		return (currentPosition != 0) ? currentPosition - 1 : 0;
	}
}
