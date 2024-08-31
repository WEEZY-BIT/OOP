import java.util.List;

public class TeacherView {
    public void printTeacherDetails(Teacher teacher) {
        System.out.println(teacher);
    }

    public void printAllTeachers(List<Teacher> teachers) {
        if (teachers.isEmpty()) {
            System.out.println("No teachers available.");
        } else {
            teachers.forEach(this::printTeacherDetails);
        }
    }
}