package squadki.pl.squadki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SquadkiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquadkiApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello KapiziaK";
	}
}
