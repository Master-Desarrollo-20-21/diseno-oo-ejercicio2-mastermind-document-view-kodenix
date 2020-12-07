package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;

public class View {
    Game game;
    StartView startView;
    PlayView playView;
    ResumeView resumeView;
    
    public View(Game game) {
        this.game = game;
        this.startView = new StartView();
        this.playView = new PlayView(game);
        this.resumeView = new ResumeView();
    }
    
    public void init() {
        
        do {
            this.startView.show();
            this.playView.init();
        } while (this.resumeView.needResume());
        
    }

}
