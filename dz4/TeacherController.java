import java.util.List;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void addTeacher(String name, String subject) {
        Teacher teacher = new Teacher(name, subject);
        teacherService.addTeacher(teacher);
    }

    public void editTeacher(String oldName, String newName, String newSubject) {
        teacherService.editTeacher(oldName, newName, newSubject);
    }

    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getTeachers();
        teacherView.printAllTeachers(teachers);
    }
}