import college.student.Student;
import college.faculty.Faculty;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        s.displayStudent("Rahul", 101);

        Faculty f = new Faculty();
        f.displayFaculty("Dr Sharma", "Computer Science");
    }
}