import java.util.stream.IntStream;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        IntStream.range(0, times).forEach(i -> print());
        close();
    }

}
