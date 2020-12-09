package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;

public class View {
    Game game;
    StartView startView;
    GameView gameView;
    ResumeView resumeView;
    
    public View(Game game) {
        this.game = game;
        this.startView = new StartView();
        this.gameView = new GameView(game);
        this.resumeView = new ResumeView(game);
    }
    
    public void init() {
        
        do {
            this.startView.show();
            do {
                this.gameView.interact();			
            } while (this.game.hasWinner() || this.game.hasLosser());
        } while (this.resumeView.isResumed());
        
    }

}
