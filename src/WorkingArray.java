// Файл: WorkingArray.java

import java.util.ArrayList;
import java.util.List;

public class WorkingArray {
    public static void main(String[] args) {
        // Пример использования класса DoubleArray
        DoubleArray doubleArray = new DoubleArray(10);
        doubleArray.printOriginalArray();
        int[] integerArray = doubleArray.getIntegerArray();
        doubleArray.printIntegerArray(integerArray);
        doubleArray.printRoundedIntegerArray(integerArray);
        doubleArray.sortOriginalArray();
        doubleArray.printOriginalArray();
        doubleArray.printSumOfPositiveNumbers();

        // Пример использования классов Student, Group и Academy
        Academy academy = new Academy();

        // Создаем группы
        Group group1 = new Group("Group 1");
        Group group2 = new Group("Group 2");
        Group group3 = new Group("Group 3");

        // Добавляем студентов в группы
        group1.addStudent(new Student("John", "Doe", 20, "ID001"));
        group1.addStudent(new Student("Jane", "Smith", 22, "ID002"));
        group1.addStudent(new Student("Mike", "Johnson", 21, "ID003"));
        group1.addStudent(new Student("Emily", "Williams", 19, "ID004"));
        group1.addStudent(new Student("Alex", "Brown", 20, "ID005"));

        group2.addStudent(new Student("David", "Wilson", 23, "ID006"));
        group2.addStudent(new Student("Sarah", "Taylor", 20, "ID007"));
        group2.addStudent(new Student("Michael", "Miller", 21, "ID008"));
        group2.addStudent(new Student("Olivia", "Anderson", 22, "ID009"));
        group2.addStudent(new Student("Daniel", "Thomas", 19, "ID010"));

        group3.addStudent(new Student("Sophia", "Martinez", 20, "ID011"));
        group3.addStudent(new Student("James", "Clark", 22, "ID012"));
        group3.addStudent(new Student("Isabella", "Harris", 21, "ID013"));
        group3.addStudent(new Student("Logan", "Lewis", 19, "ID014"));
        group3.addStudent(new Student("Ella", "Walker", 20, "ID015"));

        // Добавляем группы в академию
        academy.addGroup(group1);
        academy.addGroup(group2);
        academy.addGroup(group3);

        // Выводим список студентов для заданной группы
        System.out.println("Students in Group 1:");
        academy.printStudentsInGroup("Group 1");

        // Выводим информацию о конкретном студенте
        System.out.println("\nStudent with ID003:");
        academy.printStudentInfo("ID003");

        // Удаляем студента из группы
        group1.removeStudent("ID002");

        // Добавляем нового студента в группу
        group1.addStudent(new Student("Robert", "Wilson", 21, "ID016"));

        // Выводим обновленный список студентов для группы 1
        System.out.println("\nUpdated students in Group 1:");
        academy.printStudentsInGroup("Group 1");
    }
}

