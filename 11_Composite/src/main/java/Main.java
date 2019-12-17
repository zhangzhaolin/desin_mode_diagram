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
        Entry result = new Directory(file.getName());
        if (file.isFile()) {
            result.add(new File(file.getName(), (int) file.length()));
        } else {
            Arrays.stream(Objects.requireNonNull(file.listFiles())).forEach(item -> result.add(getEntry(item)));
        }
        return result;
    }
}
