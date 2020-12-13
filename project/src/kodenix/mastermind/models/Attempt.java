package kodenix.mastermind.models;

public class Attempt {
	private ProposedCombination proposedCombination;
	private Result result;

	public Attempt(SecretCombination secretCombination, ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
		this.result = secretCombination.evalueCombination(this.proposedCombination);
	}

	public boolean isWinner() {
		if (this.result.getBlacks() == 4) {
			return true;
		}
		return false;
	}

	public String getPrintedProposedCombination() {
		return this.proposedCombination.toString();
	}
	
	public int getBlacks() {
		return this.result.getBlacks();
	}
	
	public int getWhites() {
		return this.result.getWhites();
	}
	
}