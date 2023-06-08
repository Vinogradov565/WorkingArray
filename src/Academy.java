import java.util.ArrayList;
import java.util.List;

public class Academy {
    private List<Group> groups;

    public Academy() {
        groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void printStudentsInGroup(String groupName) {
        for (Group group : groups) {
            if (group.getName().equals(groupName)) {
                group.printStudents();
                return;
            }
        }
        System.out.println("Group not found: " + groupName);
    }

    public void printStudentInfo(String studentID) {
        for (Group group : groups) {
            if (group.hasStudent(studentID)) {
                Student student = group.getStudent(studentID);
                System.out.println("Name: " + student.getName());
                System.out.println("Surname: " + student.getSurname());
                System.out.println("Age: " + student.getAge());
                System.out.println("Student ID: " + student.getStudentID());
                return;
            }
        }
        System.out.println("Student not found: " + studentID);
    }
}
