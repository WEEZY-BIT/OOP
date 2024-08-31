import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем сервисы и представления
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        StudyGroupService studyGroupService = new StudyGroupService();

        // Список студентов
        List<Student> students = Arrays.asList(
                new Student("1", "Alice"),
                new Student("2", "Bob"),
                new Student("3", "Charlie")
        );

        // Создаем контроллер
        TeacherController teacherController = new TeacherController(teacherService, teacherView, studyGroupService, students);

        // Добавляем учителей
        teacherController.addTeacher("John Smith", "Mathematics");
        teacherController.addTeacher("Jane Doe", "English");

        // Создаем учебную группу
        List<String> studentIds = Arrays.asList("1", "2");
        StudyGroup studyGroup = teacherController.createStudyGroup("John Smith", studentIds);

        // Отображаем учебную группу
        if (studyGroup != null) {
            System.out.println("Study Group Created:");
            System.out.println(studyGroup);
        }
    }
}
