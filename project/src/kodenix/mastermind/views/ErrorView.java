package kodenix.mastermind.views;

import kodenix.mastermind.models.Error;
import kodenix.utils.Console;

class ErrorView {
	
	private Error error;
	private final String[] textErrors = {
		"Wrong proposed combination length",
	    "Wrong colors, they must be: rbygop",
	    "Repeated colors"
	};

	public ErrorView(Error error) {
		this.error = error;
	}
	
	void write() {
		Console.getInstance().write(this.textErrors[this.error.ordinal()]);
	}

}
