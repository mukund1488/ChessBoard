package chessboard;

import java.util.StringJoiner;

import exception.ChessBoardException;

public class Horse extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) throws ChessBoardException {
		try {
			int inputColPosition = retrieveColPositionFromInput(currentPosition);
			int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
			StringJoiner possibleMoves = new StringJoiner(",");

			if (inputColPosition - 2 >= 0) {
				possibleMoves.add(moveLeft(inputRowPosition, inputColPosition));
			}
			if (inputColPosition + 2 <= 7) {
				possibleMoves.add(moveRight(inputRowPosition, inputColPosition));
			}
			if (inputRowPosition - 2 >= 0) {
				possibleMoves.add(moveUp(inputRowPosition, inputColPosition));
			}
			if (inputRowPosition + 2 <= 7) {
				possibleMoves.add(moveDown(inputRowPosition, inputColPosition));
			}

			return possibleMoves.toString();
		} catch (ChessBoardException ex) {
			throw ex;
		}
	}

	private String moveLeft(int rowPosition, int colPosition) {
		// Can move only 2 steps left and then down
		if (rowPosition == 0) {
			return chessBoard[rowPosition - 1][colPosition - 2];
		}
		if (rowPosition == 7) {
			// Can move only 2 steps left and then up
			return chessBoard[rowPosition - 1][colPosition - 2];
		}

		// 2 steps left and one step Up and Down both are allowed
		return chessBoard[rowPosition - 1][colPosition - 2] + "," + chessBoard[rowPosition + 1][colPosition - 2];

	}

	private String moveRight(int rowPosition, int colPosition) {
		// Can move only 2 steps right and then down
		if (rowPosition == 0) {
			return chessBoard[rowPosition + 1][colPosition + 2];
		}
		if (rowPosition == 7) {
			// Can move only 2 steps right and then up
			return chessBoard[rowPosition - 1][colPosition + 2];
		}
		// 2 steps Right and one step Up and Down both are allowed
		return chessBoard[rowPosition + 1][colPosition + 2] + "," + chessBoard[rowPosition - 1][colPosition + 2];
	}

	private String moveUp(int rowPosition, int colPosition) {

		if (colPosition != 0 && colPosition != 7) {
			// 2 steps up and 1 step right and left both are allowed
			return chessBoard[rowPosition - 2][colPosition - 1] + "," + chessBoard[rowPosition - 2][colPosition + 1];
		} else {
			if (colPosition == 0) {
				// 2 steps up and 1 step right is allowed
				return chessBoard[rowPosition - 2][colPosition + 1];
			} else {
				// 2 steps up and 1 step left is allowed
				return chessBoard[rowPosition - 2][colPosition - 1];
			}
		}

	}

	private String moveDown(int rowPosition, int colPosition) {

		if (colPosition != 0 && colPosition != 7) {
			// 2 steps down and 1 step right and left both are allowed
			return chessBoard[rowPosition + 2][colPosition - 1] + "," + chessBoard[rowPosition + 2][colPosition + 1];
		} else {
			if (colPosition == 0) {
				// 2 steps down and 1 step right is allowed
				return chessBoard[rowPosition + 2][colPosition + 1];
			} else {
				// 2 steps down and 1 step left is allowed
				return chessBoard[rowPosition + 2][colPosition - 1];
			}
		}

	}

}
