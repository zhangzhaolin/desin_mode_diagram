import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random(47L);
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        IntStream.range(0, 10).forEach(i -> {
            number = random.nextInt(50);
            notifyObservers();
        });
    }
}
