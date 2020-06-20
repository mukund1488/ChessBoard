package chessboard;

import java.util.HashMap;
import java.util.Map;

import exception.ChessBoardException;

/**
 * Parent class for all Chess Pieces Includes chessBoard array of 8*8 with rows
 * from A..H and cols from 1...8
 *
 * @author Mukund1488
 *
 */
public abstract class ChessPiece {

	String[][] chessBoard = new String[8][8];

	/**
	 * Map to maintain the chars A..H to row position 0..8
	 */
	static Map<Integer, String> rowMappingMap;
	static {

		rowMappingMap = new HashMap<>();
		rowMappingMap.put(0, "A");
		rowMappingMap.put(1, "B");
		rowMappingMap.put(2, "C");
		rowMappingMap.put(3, "D");
		rowMappingMap.put(4, "E");
		rowMappingMap.put(5, "F");
		rowMappingMap.put(6, "G");
		rowMappingMap.put(7, "H");
	}

	ChessPiece() {
		// populate the chessboard Array with a cell number
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				chessBoard[i][j] = rowMappingMap.get(i) + (j + 1);
			}
		}
	}

	/**
	 * Returns number of moves available for a chess piece
	 *
	 * @param currentPosition
	 * @throws ChessBoardException in case of invalid input
	 * @return String of possible cell position separated by "," e.g A5,B5
	 */
	public abstract String possibleMovesAvailable(String currentPosition) throws ChessBoardException;

	/**
	 * Returns the row position from first character of input Uses the row mapping
	 * map to retrieve the row position corresponding to alphabets A-H
	 *
	 * @param input value such as D5,E6 etc
	 * @return row position e.g. A is 1 , B is 2...H is 8
	 * @throws ChessBoardException
	 */
	public Integer retrieveRowPositionFromInput(String input) throws ChessBoardException {
		if (input == null || !input.substring(0, 1).toLowerCase().matches("[a-h]")) {
			throw new ChessBoardException("Please provide a valid row position between a-h");
		}
		String rowPosition = input.substring(0, 1);
		return rowMappingMap.entrySet().stream().filter(entry -> entry.getValue().equals(rowPosition))
				.map(Map.Entry::getKey).findFirst().get();
	}

	/**
	 * Returns the column position from second character of input
	 *
	 * @param input value such as D5,E6 etc
	 * @return column position eg. 4 if input is D5, 3 if input is B4
	 * @throws ChessBoardException in case of invalid input
	 */
	public Integer retrieveColPositionFromInput(String input) throws ChessBoardException {
		if (input == null || !input.substring(1).matches("[1-8]")) {
			throw new ChessBoardException("Please provide a valid col position between 1-8");
		}
		return Integer.valueOf(input.substring(1)) - 1;
	}

}
