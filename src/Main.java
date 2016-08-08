import org.alicebot.ab.*;
import org.alicebot.ab.utils.IOUtils;

public class Main {

	public static void main(String[] args) {
		String botname = "Marvin";
		
		// create a bot with 3 parameters: name, working directory and action
		Bot bot = new Bot(botname, System.getProperty("user.dir"), "chat");
		Chat chatSession = new Chat(bot);
		
		// when trace_mode is true, it prints pattern matching process and thus is good for debugging purpose
		MagicBooleans.trace_mode = false;
		
		// optional: see the "brain" of this bot
		// bot.brain.printgraph();

        String textLine="";
        while (true) {
        	// read user input
            textLine = IOUtils.readInputTextLine("You");
            // handling null input
            if (textLine == null || textLine.length() < 1){
            	textLine = MagicStrings.null_input;
            }
        	// get bot response (sentence split has been taken care of in multisentenceRespond)
            String response = chatSession.multisentenceRespond(textLine);
            System.out.println(botname + ": " +response);
            
        }

	}

}
