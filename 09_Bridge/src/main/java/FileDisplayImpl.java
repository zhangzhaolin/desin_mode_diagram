import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDisplayImpl implements DisplayImpl {

    private String filePath;
    private Path path;


    public FileDisplayImpl(String filePath) {
        this.filePath = filePath;
        this.path = Paths.get(filePath);
    }

    @Override
    public void rawOpen() {
        if (path == null) {
            this.path = Paths.get(filePath);
        }
    }

    @Override
    public void rawPrint() {
        try {
            Files.readAllLines(path, StandardCharsets.UTF_8).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        path = null;
    }
}
