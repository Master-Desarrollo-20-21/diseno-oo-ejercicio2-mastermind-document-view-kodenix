package kodenix.mastermind.models;

import kodenix.utils.Console;

class SecretCombination extends Combination {

		
	private static final int LENGTH = 4;
	

	public SecretCombination() {

		this.colors = new Color[LENGTH];
		String combination = this.generateRandomString();
		Console.getInstance().write(combination);
		
		for(int i=0; i<LENGTH; i++){
			this.colors[i] = Color.getColorByChar(combination.charAt(i));
		}
	}
	
	public Result evalueCombination(ProposedCombination proposedCombination) {
		int blacks = 0;
		int whites = 0;

		for(int p = 0; p < LENGTH; p++) {
			for(int c = 0; c < LENGTH; c++) {
				if(proposedCombination.colors[p].isSameColorAs(this.colors[c])){
					if(p == c)
						blacks ++;
					else
						whites ++;
				}
			}
		}

        return new Result(whites, blacks);
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i=0; i<LENGTH; i++)
		{
			result += result + "*";
		}
		return result;
	}

	private String generateRandomString() {

		String result = "";
		String availableColors = Color.getAvailableColors();
	    
	    while(result.length() < LENGTH) {
	    	int randomIndex = randomIndex(availableColors.length());
	    	char electedColor = availableColors.charAt(randomIndex);
	    	result += electedColor;
	        availableColors = availableColors.replaceFirst("" + electedColor, "");
	    }

	    return result;
	}
	
	private int randomIndex(int arrayLenght) {
		return (int)(Math.random() * arrayLenght);
	}

}
