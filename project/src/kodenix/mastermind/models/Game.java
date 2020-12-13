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
		return attempts.get(this.getAttemptsSize()-1).isWinner();
    }
	
	private boolean isLastAttempt() {
		return this.getAttemptsSize() == this.MAX_ATTEMPTS;
	}
	
	public boolean isFinished() {
        return this.isLastAttempt() || this.hasWinner();
    }

    public int getAttemptsSize() {
        return this.attempts.size();
    }

    /*public String[] getAttemptList() {
        String[] attemptsList = new String[this.getAttemptsSize()]; 
        for (int i=0; i < this.getAttemptsSize(); i++) {
            attemptsList[i] = this.attempts.get(i).toString();
        }
        return attemptsList;
    }*/
    
    public ArrayList<Attempt> getAttemptList() {
        return this.attempts;
    }

    public void addNewAttempt(ProposedCombination proposedCombination) {
        this.attempts.add(new Attempt(this.secretCombination, proposedCombination));
    }

}
