package kodenix.mastermind.views;

import kodenix.utils.Console;

public class ResumeView {

    boolean needResume() {

        Console console = new Console();
        String response = "";
        
        do {
            response = console.read(Message.RESUME.toString());
        } while (!(response.equals("y") || response.equals("n")));

        return response.equals("y");

    }
}
