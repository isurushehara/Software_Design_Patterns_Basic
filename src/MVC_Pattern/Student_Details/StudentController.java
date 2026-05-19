package MVC_Pattern.Student_Details;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayStudent(model.getName(), model.getId());
    }

    public void setStudentName(String name) {
        model.setName(name);
    }
}

