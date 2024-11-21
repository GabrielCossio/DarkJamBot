package darkjam.example.darkjam.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

// This interface will be implemented for all commands such as !play, !ping, etc.
public interface Command {
  /**
   * Execute the command logic.
   *
   * @param event The event containing the message.
   * @param args The arguments for the command.
   */
  void execute(MessageReceivedEvent event, String[] args);

  /**
   * The name of the command.
   *
   * @return The command name (Ex: "!play").
   */
  String getCommandName();
}
