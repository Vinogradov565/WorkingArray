import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students;

    public Group(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String studentID) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStudentID().equals(studentID)) {
                students.remove(i);
                return;
            }
        }
        System.out.println("Student not found: " + studentID);
    }

    public boolean hasStudent(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return true;
            }
        }
        return false;
    }

    public Student getStudent(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in this group.");
            return;
        }
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Surname: " + student.getSurname());
            System.out.println("Age: " + student.getAge());
            System.out.println("Student ID: " + student.getStudentID());
            System.out.println();
        }
    }
}
