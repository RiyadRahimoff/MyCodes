package schoolsystem;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        Classroom classroom1 = new Classroom("11A");
        Classroom classroom2 = new Classroom("11B");

        school.addClassroom(classroom1);
        school.addClassroom(classroom2);

        Student student1 = new Student("Riyad","Rahimov",18);
        Student student5 = new Student("Riyad","Rahimov",18);
        Student student2 = new Student("Namiq","Namiqli",19);
        Student student4 = new Student("Idris","Hetemli",17);
        Student student3 = new Student("Ferhad","Rustemli",18);


        school.addStudentToClassroom(classroom1.getClassName(), student1);
        school.addStudentToClassroom(classroom1.getClassName(), student2);
        school.addStudentToClassroom(classroom2.getClassName(), student3);
        school.addStudentToClassroom(classroom2.getClassName(), student4);
        school.addStudentToClassroom(classroom2.getClassName(), student5);

        school.displayInfo();
    }
}
