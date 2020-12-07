package kodenix.mastermind.views;

enum Message {
    TITLE("-------MASTERMIND--------"),
    RESUME("Resume? (y/n)");

    private String message;

    private Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
