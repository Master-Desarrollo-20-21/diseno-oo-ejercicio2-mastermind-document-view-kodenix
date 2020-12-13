package kodenix.utils;

import java.util.Scanner;

public class Console {
	
	private static Console instance;
	Scanner reader;
	
	private Console(){
		reader = new Scanner(System.in);
	}
	
	public void write(String promptMessage) {
		System.out.println(promptMessage);
	}
	
	public String read(String promptMessage) {
		System.out.print(promptMessage);
		return reader.next();
	}
	
	public static Console getInstance(){
        if(instance == null){
            instance = new Console();
        }
        return instance;
    }

}
