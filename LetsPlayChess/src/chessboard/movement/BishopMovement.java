package chessboard.movement;

import java.util.StringJoiner;

public interface BishopMovement {

	public default String possibleMovesForBishop(String[][] chessBoard, Integer startingRowPosition,
			Integer startingColPosition) {
		StringJoiner possibleMoves = new StringJoiner(",");
		int counter = 1;
		int currentRowPointer = startingRowPosition;
		int currentColPointer = startingColPosition;
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

	}

}
