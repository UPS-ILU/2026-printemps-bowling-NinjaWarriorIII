package tdd;

public class Game {
	private int score = 0;
	private int[] last_2_rolls = {0, 0};

	public void roll(int nbQuilles) {
		if (last_2_rolls[0] + last_2_rolls[1] == 10) {
			score += nbQuilles;
		}
		last_2_rolls[1] = last_2_rolls[0];
		last_2_rolls[0] = nbQuilles;
		score += nbQuilles;
	}
	
	public int score() {
		return score;
	}

}
