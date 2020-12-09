package kodenix.mastermind.views;
import kodenix.mastermind.models.Game;
import kodenix.utils.Console;

public class GameView {

    private Game game;
    private AttemptView attemptView;

    public GameView(Game game) {
        this.game = game;
        this.attemptView = new AttemptView(game);
    }
	
	void interact() {
        this.attemptView.interact();
                
        
        // Imprimir listado de Attempts rybo --> 1 blacks and 1 whites
        // Propose a combination: loqueescriba el usuario y errores abajo
        }

}
