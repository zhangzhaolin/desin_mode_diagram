import java.util.ArrayList;

public class Directory extends Entry {

    private String name;
    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public Directory(String name, ArrayList<Entry> directory) {
        this.name = name;
        this.directory = directory;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry item : directory) {
            size += item.getSize();
        }
        return size;
    }

    @Override
    public ArrayList<Entry> getChildren() {
        return directory;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + " / " + name);
        directory.forEach(item -> {
            item.printList(prefix + " / " + name);
        });
    }

    @Override
    public Entry add(Entry entry) throws RuntimeException {
        directory.add(entry);
        entry.setParentEntry(this);
        return this;
    }
}
