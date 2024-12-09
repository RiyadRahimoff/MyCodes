package schoolsystem;

import java.util.HashSet;
import java.util.Set;

public class Classroom {
    private String className;
    private Set<Student> students;

    public Classroom(String className) {
        this.className = className;
        students = new HashSet<Student>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(HashSet<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "className='" + className + '\'' +
                ", students=" + students +
                '}';
    }

    public void displayInfo() {
        System.out.println("Sinif adi: " + className);
        for (Student student : students) {
            System.out.println(student);
        }


    }

}
