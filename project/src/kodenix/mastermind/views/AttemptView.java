package kodenix.mastermind.views;
import kodenix.utils.Console;
import kodenix.mastermind.models.Attempt;
import kodenix.mastermind.models.Game;
import kodenix.mastermind.models.ProposedCombination;


public class AttemptView {

    private Game game;
    private Console console;

    public AttemptView(Game game) {
        this.game = game;
        this.console = Console.getInstance();
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
    	this.console.write(this.game.getAttemptsSize() + " attempts(s):");
    }

    private void showSecretCombination() {
    	this.console.write(this.game.getSecretCombination());
    }

    private void showListAttempts() {
    	
        for (Attempt attempt : this.game.getAttemptList()) {
        	String message = Message.ATTEMPT.toString()
        			.replaceFirst("#proposed", attempt.getPrintedProposedCombination())
        			.replaceFirst("#blacks", Integer.toString(attempt.getBlacks()))
        			.replaceFirst("#whites", Integer.toString(attempt.getWhites()));
        	console.write(message);
        }
    }

    private void readCombination() {
    	ProposedCombination proposedCombination;
        do {
        	String proposedString= this.console.read(Message.PROPOSE_COMBINATION.toString());
            proposedCombination=new ProposedCombination(proposedString);
            
            if (!proposedCombination.getError().isNull()) {
            	ErrorView errorView=new ErrorView(proposedCombination.getError());
            	errorView.write();
            }
        	
        } while (!proposedCombination.getError().isNull());

        this.game.addNewAttempt(proposedCombination);
    }

}
