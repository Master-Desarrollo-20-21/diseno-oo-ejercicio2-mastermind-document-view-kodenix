package kodenix.mastermind;

import kodenix.mastermind.models.Game;
import kodenix.mastermind.views.View;

public class Mastermind {

    Game game; 
    View view;

    Mastermind() {
        this.game = new Game();
        this.view = new View(game);
    }
        
    public void play() {
        this.view.interact();
    }

    public static void main(String[] args) {	
    	new Mastermind().play();
    }
    
}
