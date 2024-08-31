import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }

    public void sortStreams(List<Stream> streams) {
        StreamComparator comparator = new StreamComparator();
        streamService.sortStreams(streams, comparator);
    }
}