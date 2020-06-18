package chessboard;

import java.util.StringJoiner;

public class Rook extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) {
		int inputColPosition = Integer.valueOf(currentPosition.substring(1)) - 1;
		int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
		StringJoiner possibleMoves = new StringJoiner(",");
		for (int i = 0; i < 8; i++) {
			if (i == inputRowPosition) {
				for (int j = 0; j < 8; j++) {
					possibleMoves.add(chessBoard[i][j]);
				}
			} else {
				possibleMoves.add(chessBoard[i][inputColPosition]);
			}
		}
		return possibleMoves.toString();

	}

}
