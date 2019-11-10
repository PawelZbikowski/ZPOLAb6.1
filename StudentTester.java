package Wyklad5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("A", 5.26);
        Student s2 = new Student("Z", 2.23);
        Student[] students = {s1, s2};
        List<Student> studentList = Arrays.asList(s1, s2);
        //Arrays.sort(students);
        //Arrays.sort(students, new LastNameComparator());
        //Collections.sort(studentList, new LastNameComparator());

        //robimy te rzeczy lambdą teraz, najs

        Arrays.sort(students, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

    }
}
