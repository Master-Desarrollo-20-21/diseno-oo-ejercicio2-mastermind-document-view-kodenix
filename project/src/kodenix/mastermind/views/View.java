package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;

public class View extends AbstractView {
	
    private StartView startView;
    private GameView gameView;
    private ResumeView resumeView;
	private WinnerLosserView winnerLosserView;
    
    public View(Game game) {
        this.startView = new StartView();
        this.gameView = new GameView(game);
        this.resumeView = new ResumeView(game);
        this.winnerLosserView = new WinnerLosserView(game);
    }
    
    @Override
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
