package kodenix.mastermind.views;

import kodenix.utils.Console;

public class StartView extends AbstractView {

	@Override
	void interact() {
		Console.getInstance().writeln(Message.TITLE.toString());
	}
    
}
