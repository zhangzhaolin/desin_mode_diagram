import java.util.ArrayList;

public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public ArrayList<Entry> getChildren() {
        return null;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + " / " + this);
    }
}
