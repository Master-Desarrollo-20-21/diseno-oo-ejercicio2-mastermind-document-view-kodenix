package kodenix.mastermind.views;

enum Message {
    TITLE("-------MASTERMIND--------"),
    RESUME_QUESTION("Resume? (y/n)"),
    RESPONSE_YES("y"),
    RESPONSE_NO("n"), 
    PROPOSE_COMBINATION_QUESTION("Propose a combination: "), 
    WINNER("You've won!!! ;-)"), 
    LOSSER("You've lost!!! :("),
    PROPOSED_COMBINATION_RESULT("#proposed"),
	RESULT(" --> #blacks blacks and #whites whites"),
	ATTEMPTS_TOTAL("#total attempts(s):");
	
    private String message;

    private Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
