import banner.print.Print;
import banner.print.PrintBanner;
import org.junit.jupiter.api.Assertions;

public class BannerTest {

    @org.junit.jupiter.api.Test
    public void test1() {
        String value = "Hello";
        Print printBanner = new PrintBanner<>(value);
        Assertions.assertEquals(printBanner.printWeak(), "(" + value + ")");
        Assertions.assertEquals(printBanner.printStrong(), "*" + value + "*");
        Assertions.assertNotEquals(printBanner.printWeak(), value);
    }

    @org.junit.jupiter.api.Test
    public void test2() {
        int value = 152;
        Print printBanner = new PrintBanner<>(value);
        Assertions.assertEquals(printBanner.printWeak(), "(" + value + ")");
        Assertions.assertEquals(printBanner.printStrong(), "*" + value + "*");

        Assertions.assertNotEquals(printBanner.printWeak(), value);
    }

}
