package kodenix.mastermind.views;

import kodenix.mastermind.models.Game;
import kodenix.mastermind.models.ProposedCombination;
import kodenix.utils.Console;

public class AttemptView {

    private Game game;

    public AttemptView(Game game) {
        this.game = game;
	}

	void interact() {
        this.showAttemptInfo();
        this.showListAttempts();
        this.readCombination();
    }

    private void showAttemptInfo() {
        this.showNumberAttempt();
        this.showSecretCombination();
    }

    private void showNumberAttempt() {
        Console console=new Console();
        console.write(this.game.getAttemptsSize() + " attempts(s):");
    }

    private void showSecretCombination() {
        new Console().write(this.game.getSecretCombination());
    }

    private void showListAttempts() {
        for (String attempt : this.game.getAttemptList()) {
            new Console().write(attempt);
        }
    }

    private void readCombination() {
        
        String proposedString=new Console().read(Message.PROPOSE_COMBINATION.toString());
        ProposedCombination proposedCombination=new ProposedCombination(proposedString);
        
        while(!proposedCombination.isValid()) {
            new Console().write("Combinacion con error");
            proposedString=new Console().read(Message.PROPOSE_COMBINATION.toString());
            proposedCombination=new ProposedCombination(proposedString);
        };

        this.game.addNewAttempt(proposedCombination);
    }

}
