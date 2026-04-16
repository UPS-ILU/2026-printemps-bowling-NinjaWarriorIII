package tdd;

public class Game {
	private int score = 0;
	private int current_frame = 0;
	private int last_roll = 0;
	private int double_bonus = 0;

	private void next_frame() {
		current_frame = (current_frame + 1) % 2;
	}
	
	public void roll(int nbQuilles) {
		if(double_bonus > 0) {
			score += nbQuilles;
			double_bonus--;
		}
		if(current_frame == 0) {
			if(nbQuilles == 10) {
				double_bonus = 2;
				next_frame();
			}
		} else{
			if(last_roll + nbQuilles == 10) {
				double_bonus = 1;
			}
		}
		next_frame();
		score += nbQuilles;
		last_roll = nbQuilles;
	}
	
	public int score() {
		return score;
	}

}
