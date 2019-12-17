import java.util.ArrayList;

public abstract class Entry {

    private Entry parentEntry;

    public abstract String getName();

    public abstract int getSize();

    public abstract ArrayList<Entry> getChildren();

    public Entry add(Entry entry) throws RuntimeException {
        throw new UnsupportedOperationException();
    }

    public String getFullName() {
        StringBuffer buffer = new StringBuffer();
        Entry entry = this;
        do {
            buffer.append("/" + getName());
            entry = entry.parentEntry;
        } while (entry != null);
        return buffer.toString();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " ( " + getSize() + " ) ";
    }

    protected Entry getParentEntry() {
        return parentEntry;
    }

    protected void setParentEntry(Entry parentEntry) {
        this.parentEntry = parentEntry;
    }
}
