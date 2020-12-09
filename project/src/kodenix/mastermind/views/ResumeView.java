package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;
import kodenix.utils.Console;

public class ResumeView {

    private Game game;
    private boolean isResumed = false;

    ResumeView(Game game) {
        this.game = game;
    }

    boolean isResumed() {
        this.interact();
        return this.isResumed;
    }

    private void interact() {
        Console console = new Console();
        String response = "";
        
        do {
            response = console.read(Message.RESUME_QUESTION.toString());
        } while (!(response.equals(Message.RESPONSE_YES.toString()) || response.equals(Message.RESPONSE_NO.toString())));

        this.isResumed = response.equals("y");
        
        if (this.isResumed==true) {
            this.game.reset();
        }
    }

}
