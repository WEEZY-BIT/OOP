public class Main {
    public static void main(String[] args) {
        // Создаем сервис и представление
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        // Добавляем учителей
        teacherController.addTeacher("John Smith", "Mathematics");
        teacherController.addTeacher("Jane Doe", "English");

        // Отображаем всех учителей
        System.out.println("All teachers:");
        teacherController.showAllTeachers();

        // Редактируем учителя
        teacherController.editTeacher("John Smith", "John Smith", "Physics");

        // Отображаем всех учителей после редактирования
        System.out.println("\nAll teachers after editing:");
        teacherController.showAllTeachers();
    }
}