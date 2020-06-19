package chessboard;

public class Horse extends ChessPiece {

	@Override
	public String possibleMovesAvailable(String currentPosition) {
		return currentPosition;
	}
}
