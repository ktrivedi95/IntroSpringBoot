//THIS IS JUST AN ATTEMPT TO CREATE THE EXERCISE WITH JAVA
//IT IS INCOMPLETE, SINCE IT'S MISSING A LOT OF OTHER JAVA CODE

@Grab("spring-boot-starter-web")

import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloWorldExerciseWithJava {
	
	@RequestMapping("/")
	public String home() {
		"Hello World Exercise";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldExerciseWithJava.class, args);
	}
}