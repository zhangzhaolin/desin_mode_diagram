import java.util.stream.IntStream;

public class IncrementalNumberGenerator extends NumberGenerator {

    private final int START = 10;
    private final int END = 50;
    private final int STEP = 5;
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = START; i <= END; i += STEP) {
            number = i;
            notifyObservers();
        }
    }
}
