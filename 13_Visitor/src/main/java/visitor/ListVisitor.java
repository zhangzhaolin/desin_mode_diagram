package visitor;

import framework.Directory;
import framework.File;

public class ListVisitor implements Visitor {

    private String currentDir = "";

    public ListVisitor(String currentDir) {
        this.currentDir = currentDir;
    }

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        directory.iterator().forEachRemaining(entry -> {
            entry.getAccept().accept(new ListVisitor(currentDir + "/" + directory.getName()));
        });
    }
}
