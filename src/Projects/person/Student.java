package Projects.person;

public class Student extends Person {
    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";

    public Student(String name, String address, int phone, String email, String status) {
        super(name, address, phone, email);
    }
}

