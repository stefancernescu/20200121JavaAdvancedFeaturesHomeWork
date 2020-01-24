package mvc.exercise;

import mvc.exercise.controller.StudentController;
import mvc.exercise.pojo.Student;
import mvc.exercise.viewer.StudentViewer;
import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        Student student = retrieveStudentFromDB();
        StudentViewer studentViewer = new StudentViewer();
        StudentController studentController = new StudentController(student, studentViewer);
        studentController.updateView();

        studentController.setStudentName("Marian");
        studentController.setStudentNumber(3222);
        studentController.updateView();
    }

    @NotNull
    private static Student retrieveStudentFromDB() {
        Student student = new Student();
        student.setName("Robert");
        student.setNumber(100);
        return student;
    }
}
