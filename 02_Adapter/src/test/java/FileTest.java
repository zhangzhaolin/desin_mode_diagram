import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import properties.file.FileIo;
import properties.file.FileJson;
import properties.file.FileProperties;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDate;

public class FileTest {

    @Test
    public void test1() throws IOException, URISyntaxException {
        FileIo fileIo = new FileProperties();
        fileIo.readFromFile(getClass().getResource("example.properties").toURI().getPath());
        Assertions.assertEquals(fileIo.getValue("author"), "张三");
        Assertions.assertEquals(fileIo.getValue("title"), "如何学好英语");
        fileIo.setValue("author", "施瓦兹");
        fileIo.setValue("title", "如何让孩子爱上学习?");
        fileIo.setValue("publishTime", LocalDate.now().toString());
        fileIo.writeToFile(getClass().getResource("output.properties").toURI().getPath());

    }

    @Test
    public void test2() throws IOException, URISyntaxException {
        FileIo fileIo = new FileJson();
        fileIo.readFromFile(getClass().getResource("json.txt").toURI().getPath());
        Assertions.assertEquals(fileIo.getValue("author"), "张三");
        Assertions.assertEquals(fileIo.getValue("title"), "如何学好英语");
        fileIo.setValue("author", "施瓦兹");
        fileIo.setValue("title", "如何让孩子爱上学习?");
        fileIo.setValue("publishTime", LocalDate.now().toString());
        fileIo.writeToFile(getClass().getResource("output.txt").toURI().getPath());

    }

}
