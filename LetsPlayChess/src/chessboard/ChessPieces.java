package chessboard;

import java.util.HashMap;
import java.util.Map;

public abstract class ChessPieces {

	String[][] chessBoard = new String[8][8];
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

	ChessPieces() {
		// populate the chessboard Array with a cell number
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				chessBoard[i][j] = ChessPieces.rowMappingMap.get(i) + (j + 1);
			}
		}
	}

	public abstract String move(String currentPosition);

}
