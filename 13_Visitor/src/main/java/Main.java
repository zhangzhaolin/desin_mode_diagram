import framework.Directory;
import framework.Entry;
import framework.File;
import visitor.FileFindVisitor;
import visitor.ListVisitor;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("E:\\学习内容\\desin_mode_diagram\\.git");
        Entry entry = getEntry(file);
        entry.getAccept().accept(new ListVisitor(""));

        FileFindVisitor findVisitor = new FileFindVisitor(".png", ".sample");
        entry.getAccept().accept(findVisitor);
        findVisitor.getFoundFiles().forEachRemaining(System.out::println);

    }

    private static Entry getEntry(java.io.File file) {
        if (file.isFile()) {
            return new File(file.getName(), (int) file.length());
        } else {
            Directory directory = new Directory(file.getName());
            Arrays.stream(Objects.requireNonNull(file.listFiles())).forEach(item -> directory.add(getEntry(item)));
            return directory;
        }

    }

}
