package kodenix.mastermind.views;
import kodenix.utils.Console;
import kodenix.mastermind.models.Game;

public class AttemptView {

    private Game game;

    public AttemptView(Game game) {
    	this.game = game;
	}

	public void writeln() {
		String text = Message.ATTEMPTS_TOTAL.toString()
				.replaceFirst("#total", Integer.toString(this.game.getAttemptSize()));
		Console.getInstance().writeln(text);
	}

}
