package squadki.pl.squadki.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {

    private final StudentService studentService;

    @Autowired
    public PersonController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Person> getStudents() {
        return studentService.getStudents();
    }
}
