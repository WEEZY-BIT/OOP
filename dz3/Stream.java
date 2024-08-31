import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group> {
    private List<Group> groups;

    public Stream() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public Iterator<Group> iterator() {
        return groups.iterator();
    }
}