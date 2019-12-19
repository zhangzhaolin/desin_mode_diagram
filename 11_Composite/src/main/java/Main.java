import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("E:\\学习内容\\desin_mode_diagram");
        Entry entry = getEntry(file);

    }

    private static Entry getEntry(java.io.File file) {
        if (file.isFile()) {
            return new File(file.getName(), (int) file.length());
        } else {
            Directory dictionary = new Directory(file.getName());
            Arrays.stream(Objects.requireNonNull(file.listFiles())).forEach(item -> dictionary.add(getEntry(item)));
            return dictionary;
        }

    }
}
