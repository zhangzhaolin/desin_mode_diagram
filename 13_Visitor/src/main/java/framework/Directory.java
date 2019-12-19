package framework;

import lombok.Getter;
import lombok.Setter;
import visitor.SizeVisitor;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

@Setter
@Getter
public class Directory extends Entry {

    private String name;

    private ArrayList<Entry> entries = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        SizeVisitor visitor = new SizeVisitor();
        this.getAccept().accept(visitor);
        return entries.stream().mapToInt(Entry::getSize).sum();
    }

    @Override
    public Iterator<Entry> iterator() throws UnsupportedOperationException {
        return entries.iterator();
    }

    @Override
    public Consumer<Visitor> getAccept() {
        return v -> v.visit(this);
    }

    @Override
    public Entry add(Entry entry) throws UnsupportedOperationException {
        entries.add(entry);
        return entry;
    }
}
