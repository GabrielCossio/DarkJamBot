package darkjam.example.darkjam.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.springframework.stereotype.Component;

@Component
public class PingCommand implements Command {

  @Override
  public void execute(MessageReceivedEvent event, String[] args) {
    event.getChannel().sendMessage("Pong!").queue();
  }

  @Override
  public String getCommandName() {
    return "!ping";
  }
}
