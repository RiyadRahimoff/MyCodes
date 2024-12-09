package schoolsystem;

import exception.ClassNotFound;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Classroom> classrooms = new ArrayList<>();    // 5
    private int count;

    public void addClassroom(Classroom classRoom) {
        classrooms.add(classRoom);
    }

    public void addStudentToClassroom(String className, Student student) {
        for (int i = 0; i < classrooms.size(); i++) {
            Classroom classroom = classrooms.get(i);    //3
            if (classroom.getClassName().equals(className)) {
                count++;
                classroom.addStudent(student);
                return;
            }
        }
        if(count==0){
            throw new ClassNotFound("Class not found");
        }
    }
    public void displayInfo(){
        for(Classroom classroom:classrooms){
            classroom.displayInfo();
        }
    }

}
