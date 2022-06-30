package squadki.pl.squadki.person;

public class Person {
    private Long id;
    private String name;
    private String phone_number;
    private String email;

    public Person() {}

    public Person(Long id, String name, String phone_number, String email) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phone_number = phone_number;
    }

    public Person(String name, String phone_number, String email) {
        this.email = email;
        this.name = name;
        this.phone_number = phone_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

