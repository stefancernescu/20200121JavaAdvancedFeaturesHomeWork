package mvc.exercise.controller;

import mvc.exercise.pojo.Student;
import mvc.exercise.viewer.StudentViewer;

public class StudentController {
    private Student model;
    private StudentViewer viewer;

    public StudentController(Student model, StudentViewer viewer) {
        this.model = model;
        this.viewer = viewer;
    }

    public void setStudentName(String name) {
        this.model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentNumber(Integer number) {
        this.model.setNumber(number);
    }

    public Integer getStudentNumber() {
        return this.model.getNumber();
    }

    public void updateView(){
        viewer.printStudentDetails(model.getName(), model.getNumber());
    }
}
