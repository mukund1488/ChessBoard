package chessboard;

public class Pawn extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) {
		int inputColPosition = Integer.valueOf(currentPosition.substring(1)) - 1;
		int inputRowPosition = retrieveRowPositionFromInput(currentPosition);
		if (inputRowPosition != 7) {
			return chessBoard[inputRowPosition + 1][inputColPosition];
		} else
			return "No Possible Move Left for Pawn";

	}

}
