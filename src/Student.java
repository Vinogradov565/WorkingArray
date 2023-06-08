public class Student {
    private String name;
    private String surname;
    private int age;
    private String studentID;

    public Student(String name, String surname, int age, String studentID) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getStudentID() {
        return studentID;
    }
}
