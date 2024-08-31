import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sortStreams(List<Stream> streams, StreamComparator comparator) {
        Collections.sort(streams, comparator);
    }
}