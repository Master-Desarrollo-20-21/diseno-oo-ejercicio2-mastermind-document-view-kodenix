package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;

public class PlayView {

	GameView gameView;

	public PlayView(Game game) {
		this.gameView = new GameView(game);
	}

	void init() {

		int i = 0;

		do {
			this.gameView.interact();
			i++;
		} while (
			i<1
			//is not winner
			// game not finished
		);
	}

}
