package framework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import visitor.Visitor;

import java.util.function.Consumer;

@Setter
@Getter
@AllArgsConstructor
public class File extends Entry {

    private String name;
    private int size;

    @Override
    public Consumer<Visitor> getAccept() {
        return v -> v.visit(this);
    }
}
