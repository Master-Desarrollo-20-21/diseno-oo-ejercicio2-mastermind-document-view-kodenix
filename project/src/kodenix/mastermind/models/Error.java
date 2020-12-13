package kodenix.mastermind.models;

public enum Error {
	
	WRONG_LENGTH,
	WRONG_COLORS,
	REPEATED_COLOR,
	NULL;
    
	public boolean isNull() {
		return this == Error.NULL;
	}
}
