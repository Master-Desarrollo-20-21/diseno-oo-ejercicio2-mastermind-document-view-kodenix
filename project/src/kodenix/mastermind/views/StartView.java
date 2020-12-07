package kodenix.mastermind.views;

import kodenix.utils.Console;

public class StartView {

	void show() {
        Console console = new Console();
		console.write(Message.TITLE.toString());
	}
    
}
