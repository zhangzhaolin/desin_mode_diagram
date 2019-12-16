import java.util.Random;

/**
 * 若上一局手势赢了，那么下一局就继续用这个手势。如果上一局手势输了，那么就随机出手势。
 *
 * @author zhang
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand previousHand;

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            previousHand = Hand.getHand(random.nextInt(3));
        }
        return previousHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
