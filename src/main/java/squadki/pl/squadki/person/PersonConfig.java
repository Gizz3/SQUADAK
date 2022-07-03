package squadki.pl.squadki.person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository repository){
        return args -> {
            Person kapiziak = new Person("Kapiziak", "997", "kacer@kozak.xd");
            Person janeq = new Person("Janek", "666", "janek@malpa.pies");
            repository.saveAll(List.of(kapiziak, janeq));
        };
    }
}
