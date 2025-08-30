package co.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class SpringDockerDemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringDockerDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDemoApplication.class, args);
	}
	
	@GetMapping("/greetings/{name}")
    public String greetings(@PathVariable String name) {
       name= name.split(" ")[0];
       logger.info("LOG INFO:/greetings/{name} endpoint was called");
       return "Hello " + name + " Congratulations you Started the Application!";
    }
}
