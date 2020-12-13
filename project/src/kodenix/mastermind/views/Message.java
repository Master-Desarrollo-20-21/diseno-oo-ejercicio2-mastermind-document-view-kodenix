package kodenix.mastermind.views;

enum Message {
    TITLE("-------MASTERMIND--------"),
    RESUME_QUESTION("Resume? (y/n)"),
    RESPONSE_YES("y"),
    RESPONSE_NO("n"), 
    PROPOSE_COMBINATION("Propose a combination: "), 
    WINNER("You've won!!! ;-)"), 
    LOSSER("You've lost!!! :("), 
    ARROW("-->"), WHITE_SPACE(" "),
    ATTEMPT("#proposed --> #blacks blacks and #whites whites");

    private String message;

    private Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
