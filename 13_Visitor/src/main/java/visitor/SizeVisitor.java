package visitor;

import framework.Directory;
import framework.File;

public class SizeVisitor implements Visitor {

    private int size = 0;

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        directory.iterator().forEachRemaining(entry -> entry.getAccept().accept(this));
    }

    public int getSize() {
        return size;
    }
}
