import java.util.List;
import java.util.Optional;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;
    private StudyGroupService studyGroupService;
    private List<Student> students;  // Assuming this list is populated somewhere

    public TeacherController(TeacherService teacherService, TeacherView teacherView, StudyGroupService studyGroupService, List<Student> students) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
        this.studyGroupService = studyGroupService;
        this.students = students;
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

    public StudyGroup createStudyGroup(String teacherId, List<String> studentIds) {
        Optional<Teacher> teacherOpt = teacherService.getTeachers().stream()
                .filter(t -> t.getName().equals(teacherId))
                .findFirst();

        List<Student> selectedStudents = students.stream()
                .filter(student -> studentIds.contains(student.getId()))
                .toList();

        if (teacherOpt.isPresent()) {
            Teacher teacher = teacherOpt.get();
            return studyGroupService.createStudyGroup(teacher, selectedStudents);
        } else {
            System.out.println("Teacher not found!");
            return null;
        }
    }
}
