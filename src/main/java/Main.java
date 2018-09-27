import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@EnableAutoConfiguration
@RestController
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
	String s = null;
	System.out.println(s.length());
  }

  @RequestMapping("/")
  public String greeting(){
    return "Hello world!";
  }
}