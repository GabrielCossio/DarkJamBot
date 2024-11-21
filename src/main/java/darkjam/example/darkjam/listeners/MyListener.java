package darkjam.example.darkjam.listeners;

import darkjam.example.darkjam.commands.CommandHandler;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.springframework.stereotype.Component;

@Component
public class MyListener extends ListenerAdapter {

  private final CommandHandler commandHandler;

  public MyListener(CommandHandler commandHandler) {
    this.commandHandler = commandHandler;
  }

  @Override
  public void onMessageReceived(MessageReceivedEvent event) {
    if (event.getAuthor().isBot()) return;
    String content = event.getMessage().getContentRaw();

    commandHandler.handle(event, content);
    // if (content.equals("!ping")) {
    //   MessageChannel channel = event.getChannel();
    //   channel.sendMessage("Pong!").queue();
    // }
    // if (content.equals("!pong")) {
    //   MessageChannel channel = event.getChannel();
    //   channel.sendMessage("Ping!").queue();
    // }
  }
}
