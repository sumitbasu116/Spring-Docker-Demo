package co.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDemoApplication.class, args);
	}
	
	@GetMapping("/greetings/{name}")
    public String greetings(@PathVariable String name) {
       name= name.split(" ")[0];
        return "Hello " + name + " Congratulations you Started the Application!";
    }
}
