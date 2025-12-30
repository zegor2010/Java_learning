package Projects;

public class Course {
        private String courseName;
        private String[] students = new String[20];
        private int numberOfStudents = 0;

        Course(String courseName){
            this.courseName = courseName;
        }

        public String getCourseName() {
            return courseName;
        }

        public void addStudent(String student){
            if (numberOfStudents==20){ System.out.println("no free"); return;}
            students[numberOfStudents] = student;
            numberOfStudents++;
        }
        public void dropStudent(String student){
            for(int i = 0; i<students.length; i++){
                if(students[i].equalsIgnoreCase(student)){
                    students[i]=null;
                    numberOfStudents--;
                }
            }
        }
    }

