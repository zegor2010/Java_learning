package Projects.person;

import java.time.LocalDateTime;

public class Staff extends Employee {

    private String title;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Staff(String name, String address, int phone, String email, String office, double salary, LocalDateTime dateHired, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }
}
