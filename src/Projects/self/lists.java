package Projects.self;

import Projects.inheritance.GeometricFigure;

import java.time.LocalDate;

public class lists {
    public class Lists extends Student {

        public Lists(String surname, String name, String middleName, String birthDate, String address, String phone, String faculty, int course) {
            super(surname, name, middleName, birthDate, address, phone, faculty, course);
        }
    }
    static void main() {
        Student[] students = {
                new Student("Ivanenko","Ivan","Ivanovych","2002-05-12","Kyiv","1","IT",2),
                new Student("Petrenko","Petro","Petrovych","2001-03-22","Lviv","2","Economics",3),
                new Student("Shevchenko","Olga","Serhiivna","2003-07-15","Odesa","3","IT",1) };

        printFaculty(students, "IT");
        printAll(students);
        printBornAfter(students, 2001);
    }

    static void printFaculty(Student[] s, String f) {
        for (Student x : s)
            if (x.getFaculty().equals(f))
                System.out.println(x);
    }

    static void printAll(Student[] s) {
        for (Student x : s) System.out.println(x);
    }

    static void printBornAfter(Student[] s, int year) {
        for (Student x : s)
            if (Integer.parseInt(x.getDateOfBirth().substring(0,4)) > year)
                System.out.println(x);
    }
}
