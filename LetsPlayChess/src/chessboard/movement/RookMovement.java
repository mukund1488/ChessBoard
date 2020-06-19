package chessboard.movement;

import java.util.StringJoiner;

public interface RookMovement {

	public default String possibleMovesForRook(String[][] chessBoard, Integer startingRowPosition,
			Integer startingColPosition) {
		StringJoiner possibleMoves = new StringJoiner(",");
		for (int i = 0; i < 8; i++) {
			if (i == startingRowPosition) {
				for (int j = 0; j < 8; j++) {
					possibleMoves.add(chessBoard[i][j]);
				}
			} else {
				possibleMoves.add(chessBoard[i][startingColPosition]);
			}
		}
		return possibleMoves.toString();

	}
}
