import java.util.Random;

public class RandomDisplay extends CountDisplay {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        super.multiDisplay(new Random(47).nextInt(times));
    }
}
