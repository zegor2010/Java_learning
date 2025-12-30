package Projects.person;

import java.time.LocalDateTime;

public class Employee extends Person {

    private String office;
    private double salary;
    private LocalDateTime hireDate;

    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public LocalDateTime getHireDate() {
        return hireDate;
    }


    public Employee(String name, String address, int phone, String email,
                    String office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = LocalDateTime.now();
    }
}
