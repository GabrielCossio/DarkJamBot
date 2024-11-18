package darkjam.example.darkjam;

import darkjam.example.darkjam.Listener.MyListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DarkjamApplication {

  // @Value("${superSecretTokenDoNotShare}")
  // public static String myVariable;

  public static void main(String[] args) {
    SpringApplication.run(DarkjamApplication.class, args);
    JDA api = JDABuilder.createDefault("")
      .enableIntents(GatewayIntent.MESSAGE_CONTENT)
      .addEventListeners(new MyListener())
      .build();
  }
}
