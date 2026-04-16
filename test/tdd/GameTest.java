package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
	
	Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}
	
	@Test
	void test_vide() {
		assertEquals(0, game.score());
	}
	
	@Test
	void test_aucune_quille() {
		for(int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(0, game.score());
	}
	
	@Test
	void test_1quille() {
		for(int i = 0; i < 1; i++) {
			game.roll(20);
		}
		assertEquals(20, game.score());
	}
	
	@Test
	void test_30quilles() {
		game.roll(10);
		game.roll(20);
		assertEquals(30, game.score());
	}
}
