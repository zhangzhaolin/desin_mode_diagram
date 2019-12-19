package framework;

import visitor.ListVisitor;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ElementArrayList {

    private ArrayList<Entry> data = new ArrayList<>();

    private Consumer<ListVisitor> visitorConsumer = visitor -> data.forEach(entry -> entry.getAccept().accept(visitor));

    public Entry add(Entry entry) {
        this.data.add(entry);
        return entry;
    }


}
