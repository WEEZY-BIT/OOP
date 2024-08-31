import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void editTeacher(String oldName, String newName, String newSubject) {
        Optional<Teacher> teacherOpt = teachers.stream()
                .filter(t -> t.getName().equals(oldName))
                .findFirst();
        if (teacherOpt.isPresent()) {
            Teacher teacher = teacherOpt.get();
            teacher.setName(newName);
            teacher.setSubject(newSubject);
        }
    }

    public List<Teacher> getTeachers() {
        return new ArrayList<>(teachers);
    }
}