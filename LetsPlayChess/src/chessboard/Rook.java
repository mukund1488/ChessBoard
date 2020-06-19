package chessboard;

import java.util.StringJoiner;

import exception.ChessBoardException;

public class Rook extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) throws ChessBoardException {
		try {
			int inputColPosition = retrieveColPositionFromInput(currentPosition);
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
		} catch (ChessBoardException ex) {
			throw ex;
		}

	}

}
