package kodenix.mastermind.models;

import java.util.ArrayList;

public class Game {
    private ArrayList<Attempt> attempts = new ArrayList<Attempt>();
    private SecretCombination secretCombination;
	private final int NUM_ATTEMPS = 10;
    
    public Game() {
        secretCombination = new SecretCombination();
    }

	public int getAttempts() {
		return this.attempts.size();
	}
}
