package kodenix.mastermind.models;

import java.util.HashSet;
import java.util.Set;

public class ProposedCombination extends Combination {

	Error error = Error.NULL;
	
	public ProposedCombination(String proposedString) {
		this.validate(proposedString);
		if (this.error == Error.NULL) {
			this.createCombination(proposedString);
		}
	}
    
    public Error getError() {
    	return this.error;
    }

    private void createCombination(String combinationString){
        for (int i=0;i<LENGTH;i++) {
			this.colors[i]=Color.getColorByChar(combinationString.charAt(i));
		}
    }
    
    private void validate(String proposedString){
        if(!isValidLength(proposedString)) this.error = Error.WRONG_LENGTH;
        if(!this.isValidColor(proposedString)) this.error = Error.WRONG_COLORS;
        if(this.isRepeatedColor(proposedString)) this.error = Error.REPEATED_COLOR;
    }

    private boolean isValidLength(String proposedString) {
		return proposedString.length()==this.LENGTH;
    }

    private boolean isValidColor(String proposedString) {

        String[] proposedArray = proposedString.split("");
        for (String item : proposedArray) {
            if(!Color.getAvailableColors().contains(item)){
                return false;
            }
        }
		return true;
    }

    private boolean isRepeatedColor(String proposedString) {
        return hasDuplicateColor(proposedString);
    }

    private boolean hasDuplicateColor(String proposedString) {
        Set<Character> chars = new HashSet<Character>();
        for (char c : proposedString.toCharArray()) {
            if (!chars.add(c)) return true;
        }
        return false;
    }

}
