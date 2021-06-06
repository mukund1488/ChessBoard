package chessboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.ChessBoardException;

public class HorseTest {

	private Horse horse = new Horse();

	@Test
	public void testPossibleMovesForHorseForProperInput() throws ChessBoardException {
		String possibleMoves = horse.possibleMovesAvailable("E3");
		assertEquals("D1,F1,F5,D5,C2,C4,G2,G4", possibleMoves);
	}

	@Test
	public void testPossibleMovesForHorseForBorderScenarioOfRow() throws ChessBoardException {
		String possibleMoves = horse.possibleMovesAvailable("A1");
		assertEquals("B3,C2", possibleMoves);
	}

	@Test
	public void testPossibleMovesForHorseForBorderScenario() throws ChessBoardException {
		String possibleMoves = horse.possibleMovesAvailable("H1");
		assertEquals("G3,F2", possibleMoves);
	}

}
