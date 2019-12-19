package visitor;

import framework.Directory;
import framework.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class FileFindVisitor implements Visitor {

    private ArrayList<String> suffixList = new ArrayList<>();
    private ArrayList<File> foundFiles = new ArrayList<>();

    public FileFindVisitor(String... suffixList) {
        this.suffixList = Arrays.stream(suffixList).collect(Collectors.toCollection(ArrayList::new));
    }

    public FileFindVisitor(ArrayList<String> suffixList) {
        this.suffixList = suffixList;
    }

    @Override
    public void visit(File file) {
        suffixList.forEach(suffix -> {
            if (file != null && file.getName().lastIndexOf(suffix) > 0) {
                foundFiles.add(file);
            }
        });
    }

    @Override
    public void visit(Directory directory) {
        if (directory != null) {
            directory.iterator().forEachRemaining(entry -> entry.getAccept().accept(this));
        }
    }

    public Iterator<File> getFoundFiles() {
        return foundFiles.iterator();
    }
}
