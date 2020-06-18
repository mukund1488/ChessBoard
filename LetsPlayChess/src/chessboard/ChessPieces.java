package chessboard;

import java.util.Map;

public abstract class ChessPieces {

	String[][] chessBoard;
	Map<Integer, String> rowMappingMap;

	public abstract String move(String currentPosition);

}
