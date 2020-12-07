package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;

public class PlayView {

	GameView gameView;

	public PlayView(Game game) {
		this.gameView = new GameView(game);
	}

	void init() {

		do {
			this.gameView.interact();

		} while (
			2 !=4
			//is not winner
			// game not finished
		);
	}

}
