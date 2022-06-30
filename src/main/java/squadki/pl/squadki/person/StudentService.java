package squadki.pl.squadki.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Person> getStudents() {
        return List.of(
                new Person(1L, "Kapiziak", "997", "kapIziak@kozak.nigeria")
        );
    }
}
