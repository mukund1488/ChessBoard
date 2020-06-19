package chessboard;

import java.util.StringJoiner;

import exception.ChessBoardException;

public class Bishop extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) throws ChessBoardException {
		try {
			int inputColPosition = retrieveColPositionFromInput(currentPosition);
			int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
			StringJoiner possibleMoves = new StringJoiner(",");
			int counter = 1;
			int currentRowPointer = inputRowPosition;
			int currentColPointer = inputColPosition;
			// For Top Half get all the possible steps diagonally to the left and right
			while (currentRowPointer - counter >= 0) {
				// For the Left
				if (currentColPointer - counter >= 0) {
					possibleMoves.add(chessBoard[currentRowPointer - counter][currentColPointer - counter]);
				}
				// For the right
				if (currentColPointer + counter <= 7) {
					possibleMoves.add(chessBoard[currentRowPointer - counter][currentColPointer + counter]);
				}
				counter += 1;
			}
			// For Bottom Half
			counter = 1;
			while (currentRowPointer + counter <= 7) {
				// For the Left
				if (currentColPointer - counter >= 0) {
					possibleMoves.add(chessBoard[currentRowPointer + counter][currentColPointer - counter]);
				}
				// For the right
				if (currentColPointer + counter <= 7) {
					possibleMoves.add(chessBoard[currentRowPointer + counter][currentColPointer + counter]);
				}
				counter += 1;
			}

			return possibleMoves.toString();
		} catch (ChessBoardException ex) {
			throw ex;
		}
	}

}
