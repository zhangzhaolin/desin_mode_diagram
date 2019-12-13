import java.net.URISyntaxException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws URISyntaxException {

        Display d1 = new Display(new StringDisplayImpl("Hello China."));
        d1.display();

        CountDisplay d2 = new CountDisplay(new StringDisplayImpl("Hello Word."));
        d2.multiDisplay(5);

        RandomDisplay d3 = new RandomDisplay(new StringDisplayImpl("ShiWaZi"));
        d3.randomDisplay(5);

        String filePath = Paths.get(Main.class.getResource("display.txt").toURI()).toString();
        Display fileDisplay = new Display(new FileDisplayImpl(filePath));
        fileDisplay.display();

    }
}
