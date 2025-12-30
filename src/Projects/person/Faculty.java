package Projects.person;

import java.time.LocalDateTime;

public class Faculty extends Employee {

    private int workedHours;
    public String rank;

    public int getHours() {
        return workedHours;
    }
    public void setHours(int workedHours) {
        this.workedHours = workedHours;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    public Faculty(String name, String address, int phone, String email, String office, double salary, LocalDateTime hireDate, int workedHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.workedHours = workedHours;
        this.rank = rank;
    }
}