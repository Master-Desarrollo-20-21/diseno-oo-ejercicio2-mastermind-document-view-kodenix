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

	public String getProposedCombinationString() {
		return this.proposedCombination.toString();
	}
	
	public ProposedCombination getProposedCombination() {
		return this.proposedCombination;
	}
	
	public Result getResult() {
		return this.result;
	}
	
}