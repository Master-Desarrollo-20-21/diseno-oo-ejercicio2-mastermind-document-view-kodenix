package kodenix.mastermind.views;

import jdk.jshell.execution.Util;
import kodenix.mastermind.models.Game;
import kodenix.utils.Console;

public class GameView {

    private Game game;
    //private AttemptView attemptView;

    public GameView(Game game) {
        this.game = game;
        // this.attemptView = new AttemptView();
	}

	void interact() {
            int attemptsLenght = this.game.getAttempts();
            new Console().write(attemptsLenght + " attempts(s):");

        // imprimir X attempts(s):
        // imprimir xxxx (SecretCombinationView)
        // Imprimir listado de Attempts rybo --> 1 blacks and 1 whites
        // Propose a combination: loqueescriba el usuario y errores abajo
	}

}
