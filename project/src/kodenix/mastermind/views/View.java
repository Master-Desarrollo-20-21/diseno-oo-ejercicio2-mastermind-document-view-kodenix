package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;
import kodenix.utils.Console;

public class View {
	private Game game;
    private StartView startView;
    private GameView gameView;
    private ResumeView resumeView;
	private WinnerLosserView winnerLosserView;
    
    public View(Game game) {
        this.game = game;
        this.startView = new StartView();
        this.gameView = new GameView(game);
        this.resumeView = new ResumeView(game);
        this.winnerLosserView = new WinnerLosserView(game);
    }
    
    public void interact() {
        
        do {
        	this.startView.interact();
            do {
                this.gameView.interact();			
            } while (!this.winnerLosserView.isFinishedGame());
            this.winnerLosserView.interact();
            this.resumeView.interact();
        } while (this.resumeView.isResumed());
        
    }

}
