import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем группы
        Group group1 = new Group("Group A");
        Group group2 = new Group("Group B");
        Group group3 = new Group("Group C");

        // Создаем потоки и добавляем группы
        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream();
        stream2.addGroup(group3);

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        // Создаем сервис и контроллер
        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        // Сортируем потоки
        controller.sortStreams(streams);

        // Выводим результат
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getGroups().size() + " groups.");
        }
    }
}