package darkjam.example.darkjam.commands;

import java.util.HashMap;
import java.util.Map;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.springframework.stereotype.Component;

@Component
public class CommandHandler {

  private final Map<String, Command> commands = new HashMap<>();

  // constructor handles all of the future commands
  public CommandHandler(PingCommand pingCommand) {
    commands.put(pingCommand.getCommandName(), pingCommand);
  }

  public void handle(MessageReceivedEvent event, String content) {
    // args is content split so for the future when we have !play Despacito args[0] = !play and args[1] = Despacito
    String[] args = content.split(" ", 2);
    // Get command from Map
    Command command = commands.get(args[0]);
    if (command != null) command.execute(event, args);
    else event.getChannel().sendMessage("Unknown command: " + args[0]).queue();
  }
}
