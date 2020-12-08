package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;
import kodenix.utils.Console;

public class AttemptView {

    private Game game;

    public AttemptView(Game game) {
        this.game = game;
	}

	void showAttemptsInfo() {
        Console console=new Console();
        console.write(this.game.getAttempts() + " attempts(s):");
        console.write(this.game.getPrintedSecretCombination());
    }

}
