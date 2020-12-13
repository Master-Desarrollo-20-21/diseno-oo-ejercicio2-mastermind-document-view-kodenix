package kodenix.mastermind.views;

import kodenix.mastermind.models.Result;
import kodenix.utils.Console;

public class ResultView {

	private Result result;

	public ResultView(Result result) {
		this.result = result;
	}

	public void writeln() {
		String text = Message.RESULT.toString()
				.replaceFirst("#blacks", Integer.toString(this.result.getBlacks()))
				.replaceFirst("#whites", Integer.toString(this.result.getWhites()));
		Console.getInstance().writeln(text);
	}

}
