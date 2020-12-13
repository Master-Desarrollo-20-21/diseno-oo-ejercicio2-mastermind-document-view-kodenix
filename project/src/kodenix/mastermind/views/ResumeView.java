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
        return this.isResumed;
    }

    void interact() {
        String response = "";
        
        do {
            response = Console.getInstance().read(Message.RESUME_QUESTION.toString());
        } while (!(response.equals(Message.RESPONSE_YES.toString()) || response.equals(Message.RESPONSE_NO.toString())));
        
        this.isResumed = response.equals(Message.RESPONSE_YES.toString());        
        
        if (this.isResumed==true) {
            this.resetGame();
        }
    }
    
    private void resetGame() {
    	this.game.reset();
    }

}
