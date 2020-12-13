package kodenix.mastermind.models;

import java.util.ArrayList;

public class Game {
    private ArrayList<Attempt> attempts;
    private SecretCombination secretCombination;
	private final int MAX_ATTEMPTS = 10;
    
    public Game() {
        this.reset();
    }
    
    public void reset() {
        this.attempts = new ArrayList<Attempt>();
        this.secretCombination = new SecretCombination();
	}
    
    public String getSecretCombination() {
		return this.secretCombination.toString();
	}

	public boolean hasWinner() {
		if (this.getAttemptSize() == 0) return false;
		return this.attempts.get(this.getAttemptSize()-1).isWinner();
    }
	
	public boolean isFinished() {
        return this.isLastAttempt() || this.hasWinner();
    }

    public int getAttemptSize() {
        return this.attempts.size();
    }
    
    public ProposedCombination getProposedCombination(int index) {
    	assert(index > 0);
    	return this.attempts.get(index).getProposedCombination();
    }

    public void createNewAttempt(ProposedCombination proposedCombination) {
        this.attempts.add(new Attempt(this.secretCombination, proposedCombination));
    }
    
    private boolean isLastAttempt() {
		return this.getAttemptSize() == this.MAX_ATTEMPTS;
	}

	public Result getResult(int index) {
		return this.attempts.get(index).getResult();
	}

}
