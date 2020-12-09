package kodenix.mastermind.models;

import java.util.HashSet;
import java.util.Set;

public class ProposedCombination extends Combination {

    private String proposedString;

    public ProposedCombination() {}

    public ProposedCombination(String proposedString) {
        super();
        this.proposedString = proposedString;

        if (isValid()) {
            this.createCombination();
        }
    }

    private void createCombination(){
        for (int i=0;i<LENGTH;i++) {
			this.colors[i]=Color.getColorByChar(this.proposedString.charAt(i));
		}
    }
    
    public boolean isValid(){
        
        return (!(
            !isValidLength(proposedString) || 
            !this.isValidColor(proposedString) || 
            this.isRepeatedColor(proposedString)
        ));
        
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
