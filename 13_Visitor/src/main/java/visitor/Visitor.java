package visitor;

import framework.Directory;
import framework.File;

public interface Visitor {

    void visit(File file);

    void visit(Directory directory);

}
