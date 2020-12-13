package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;
import kodenix.utils.Console;

class WinnerLosserView {

	private Game game;

	public WinnerLosserView(Game game) {
		this.game = game;
	}
	
	public void interact() {
		if (this.isFinishedGame()) {
			
			if (this.game.hasWinner()) {
				Console.getInstance().write(Message.WINNER.toString());
			} else {
				Console.getInstance().write(Message.LOSSER.toString());
			}
		} 
	}
	
	public boolean isFinishedGame() {
		return this.game.isFinished();
	}

}
