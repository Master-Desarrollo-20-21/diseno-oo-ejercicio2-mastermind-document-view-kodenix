package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;
import kodenix.utils.Console;

class SecretCombinationView {

	private Game game ;

	public SecretCombinationView(Game game) {
		this.game = game;
	}

	void writeln() {
		Console.getInstance().writeln(this.game.getSecretCombination());
	}

}
