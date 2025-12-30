package Projects.self;

public class Student {
    private String surname;
    private String name;
    private String middleName;
    private int yearOfBirth;
    private String address;
    private String phone;
    private int faculty;
    private int course;
    private String[] studentsFaculty1;
    private String[] studentsFaculty2;
    private String[] studentsFaculty3;
    private String[] studentsCourse1;
    private String[] studentsCourse2;
    private String[] studentsCourse3;
    private String[] bornAfter;

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public int getDateOfBirth() {
        return yearOfBirth;
    }
    public void setDateOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getFaculty() {
        return faculty;
    }
    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    public Student(int course, int faculty, String phone, String address, int yearOfBirth, String middleName, String name, String surname) {
        this.course = course;
        this.faculty = faculty;
        this.phone = phone;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
        this.middleName = middleName;
        this.name = name;
        this.surname = surname;
    }

    public String[] getStudentsFaculty1(){
        int size = studentsFaculty1.length;
        if(faculty == 1){
            studentsCourse1 = new String[size++];
            studentsCourse1[size] = name + "" + surname + "" + middleName;
            return studentsFaculty1;
        }
        return null;
    }
    public String[] getStudentsFaculty2(){
        int size = studentsFaculty2.length;
        if(faculty == 2){
            studentsCourse2 = new String[size++];
            studentsCourse2[size] = name + "" + surname + "" + middleName;
            return studentsFaculty2;
        }
        return null;
    }
    public String[] getStudentsFaculty3(){
        int size = studentsFaculty3.length;
        if(faculty == 3){
            studentsCourse3 = new String[size++];
            studentsCourse3[size] = name + "" + surname + "" + middleName;
            return studentsFaculty3;
        }
        return null;
    }
    public String[] getStudentsCourse1(){
        int size = studentsCourse1.length;
        if(course == 1){
            studentsCourse1 = new String[size++];
            studentsCourse1[size] = name + "" + surname + "" + middleName;
            return studentsCourse1;
        }
        return null;
    }
    public String[] getStudentsCourse2(){
        int size = studentsCourse2.length;
        if(course == 2){
            studentsCourse2 = new String[size++];
            studentsCourse2[size] = name + "" + surname + "" + middleName;
            return studentsCourse2;
        }
        return null;
    }
    public String[] getStudentsCourse3(){
        int size = studentsCourse3.length;
        if(course == 3){
            studentsCourse3 = new String[size++];
            studentsCourse3[size] = name + "" + surname + "" + middleName;
            return studentsCourse3;
        }
        return null;
    }
    public String[] getBornAfter(){
        int size = bornAfter.length;
        if(yearOfBirth >= 2000){
            bornAfter = new String[size++];
            bornAfter[size] = name + "" + surname + "" + middleName;
            return bornAfter;
        }
        return null;
    }
}
