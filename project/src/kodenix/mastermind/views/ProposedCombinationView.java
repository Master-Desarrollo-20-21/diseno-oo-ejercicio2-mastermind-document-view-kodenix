package kodenix.mastermind.views;

import kodenix.mastermind.models.ProposedCombination;
import kodenix.utils.Console;

public class ProposedCombinationView {

	public ProposedCombinationView() {}
	
	void write(ProposedCombination proposedCombination) {
		String text = (Message.PROPOSED_COMBINATION_RESULT.toString()).replaceFirst("#proposed", proposedCombination.toString());
		Console.getInstance().write(text); 
	}

	public ProposedCombination read() {
    	ProposedCombination proposedCombination;
        do {
        	String proposedString=Console.getInstance().read(Message.PROPOSE_COMBINATION_QUESTION.toString());
            proposedCombination=new ProposedCombination(proposedString);
            
            if (!proposedCombination.getError().isNull()) {
            	ErrorView errorView=new ErrorView(proposedCombination.getError());
            	errorView.writeln();
            }
        	
        } while (!proposedCombination.getError().isNull());

        return proposedCombination;
    }

}
