package kodenix.mastermind.models;

import java.util.ArrayList;

public class Game {
    private ArrayList<Attempt> attempts;
    private SecretCombination secretCombination;
	private final int MAX_ATTEMPTS = 10;
    
    public Game() {
        this.reset();
    }
    
    public String getSecretCombination() {
		return this.secretCombination.toString();
	}

	public void reset() {
        this.attempts = new ArrayList<Attempt>();
        this.secretCombination = new SecretCombination();
	}

	public boolean hasWinner() {
		return attempts.get(attempts.size()-1).isWinner();
    }

    public int getAttemptsSize() {
        return this.attempts.size();
    }

    public boolean hasLosser() {
        return this.getAttemptsSize() <= this.MAX_ATTEMPTS;
    }

    public String[] getAttemptList() {
        String[] attemptsList = new String[this.getAttemptsSize()]; 
        for (int i=0; i < this.getAttemptsSize(); i++) {
            attemptsList[i] = this.attempts.get(i).toString();
        }
        return attemptsList;
    }

    public void addNewAttempt(ProposedCombination proposedCombination) {
        this.attempts.add(new Attempt(this.secretCombination, proposedCombination));
    }

}
