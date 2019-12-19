package framework;

import lombok.Getter;
import lombok.Setter;
import visitor.Visitor;

import java.util.Iterator;
import java.util.function.Consumer;

@Setter
@Getter
public abstract class Entry {

    private Consumer<Visitor> accept;

    private String name;

    protected abstract int getSize();

    public Entry add(Entry entry) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public Iterator<Entry> iterator() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return getName() + " ( " + getSize() + " ) ";
    }

}
