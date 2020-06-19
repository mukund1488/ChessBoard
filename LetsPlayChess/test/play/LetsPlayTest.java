package play;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import exception.ChessBoardException;

public class LetsPlayTest {

	LetsPlay play = new LetsPlay();

	@Test
	public void shouldGivePossiblePositionsWhenInputIsProperForPawn() throws ChessBoardException {
		assertEquals("C1", play.letsPlay(new String[] { "Pawn", "B1" }));
	}

	@Test
	public void shouldGivePossiblePositionsWhenInputIsProperForKing() throws ChessBoardException {
		assertEquals("A1,A2,B2,C1,C2", play.letsPlay(new String[] { "King", "B1" }));
	}

	@Test(expected = ChessBoardException.class)
	public void shouldThrowExceptionWhenInputChessPieceIsInvalid() throws ChessBoardException {
		play.letsPlay(new String[] { "Pawn11", "B1" });
	}

	@Test(expected = ChessBoardException.class)
	public void shouldThrowExceptionWhenInputChessPositionIsInvalid() throws ChessBoardException {
		play.letsPlay(new String[] { "Pawn1", "B19" });
	}
}
