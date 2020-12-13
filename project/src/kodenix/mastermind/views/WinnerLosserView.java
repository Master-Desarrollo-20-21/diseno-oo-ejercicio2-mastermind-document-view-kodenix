package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;
import kodenix.utils.Console;

class WinnerLosserView extends AbstractView {

	private Game game;

	public WinnerLosserView(Game game) {
		this.game = game;
	}
	
	@Override
	public void interact() {
		if (this.isFinishedGame()) {
			String message = Message.WINNER.toString();
			if (!this.game.hasWinner()) {
				message = Message.LOSSER.toString();
			}
			Console.getInstance().writeln(message);
		} 
	}
	
	public boolean isFinishedGame() {
		return this.game.isFinished();
	}

}
