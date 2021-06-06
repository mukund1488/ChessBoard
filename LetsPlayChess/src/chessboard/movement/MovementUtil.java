package chessboard.movement;

import java.util.StringJoiner;

/**
 * Util class to provide methods common across 2 or more chess piece provides
 * api to calculate diagonal and straight line movements across the board
 *
 * @author Mukund1488
 *
 */
public class MovementUtil {

	/**
	 * Method to calculate all possible cell position(s) diagonally across board
	 * from current position
	 *
	 * @param chessBoard
	 * @param startingRowPosition
	 * @param startingColPosition
	 * @return String of possible cell position separated by "," e.g A5,B5
	 */
	public static String possibleMovesDiagonally(String[][] chessBoard, Integer startingRowPosition,
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

	/**
	 * Method to calculate all possible cell position(s) vertical and horizontal
	 * across board from current positions
	 *
	 * @param chessBoard
	 * @param startingRowPosition
	 * @param startingColPosition
	 * @return String of possible cell position separated by "," e.g A5,B5
	 */
	public static String possibleMovesHorizontalAndVertical(String[][] chessBoard, Integer startingRowPosition,
			Integer startingColPosition) {
		StringJoiner possibleMoves = new StringJoiner(",");
		for (int i = 0; i < 8; i++) {
			if (i == startingRowPosition) {
				for (int j = 0; j < 8; j++) {
					if (j != startingColPosition) {
						possibleMoves.add(chessBoard[i][j]);
					}
				}
			} else {
				possibleMoves.add(chessBoard[i][startingColPosition]);
			}
		}
		return possibleMoves.toString();

	}

}
