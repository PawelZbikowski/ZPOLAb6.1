package Wyklad5;

public class Student implements Comparable<Student>{

    private String lastName;
    private double gpa;

    public Student(String lastName, double gpa) {
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(gpa, o.gpa);
    }
}
