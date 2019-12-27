import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BigChar {

    private char charname;
    /**
     * 大型字符所对应的字符串
     */
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            StringBuffer buffer = new StringBuffer();
            Path path = Paths.get(BigChar.class.getResource("/big" + charname + ".txt").toURI());
            Files.readAllLines(path).forEach(line -> {
                buffer.append(line);
                buffer.append("\n");
            });

            this.fontdata = buffer.toString();
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            this.fontdata = charname + "?";
        }

    }

    /**
     * 显示大型字符
     */
    public void print() {
        System.out.println(fontdata);
    }
}
