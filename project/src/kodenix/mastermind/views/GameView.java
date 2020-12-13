package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;

public class GameView extends AbstractView {

	private Game game;

    public GameView(Game game) {
    	this.game = game;
    }
	
    @Override
	void interact() {
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView();
		new AttemptView(this.game).writeln();
		new SecretCombinationView(this.game).writeln();
		
		for (int i=0; i < this.game.getAttemptSize(); i++) {
			proposedCombinationView.write(this.game.getProposedCombination(i));
			new ResultView(this.game.getResult(i)).writeln();
        }
		
        this.game.createNewAttempt(proposedCombinationView.read());
    }

}
