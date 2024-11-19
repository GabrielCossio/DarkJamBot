package darkjam.example.darkjam.configuration;

import darkjam.example.darkjam.listeners.MyListener;
import io.github.cdimascio.dotenv.Dotenv;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// This bean runs other beans defined within it at spring boot project startup
@Configuration
public class JdaConfig {

  @Bean
  public JDA jda(MyListener messageListener) throws LoginException {
    // Load .env file
    Dotenv dotenv = Dotenv.load();

    // Get the Discord token from the .env file
    String token = dotenv.get("superSecretTokenDoNotShare");
    if (token == null || token.isEmpty()) {
      throw new IllegalStateException(
        "Discord bot token (superSecretTokenDoNotShare) is missing from the .env file"
      );
    }

    return JDABuilder.createDefault(token)
      .enableIntents(GatewayIntent.MESSAGE_CONTENT)
      .addEventListeners(messageListener)
      .build();
  }
}
