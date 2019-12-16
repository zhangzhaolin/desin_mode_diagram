import java.util.Random;

public class ProbStrategy implements Strategy {

    private Random random;
    /**
     * 默认上一次出的石头
     */
    private int previousHandValue = 0;
    /**
     * 默认第一次出的石头
     */
    private int currentHandValue = 0;
    /**
     * history[上局出的手势][这局出的手势]
     * example :
     * history[0][0] 两局分别出石头、石头胜利了的次数
     * history[0][1] 两局分别出石头、剪刀胜利了的次数
     * history[0][2] 两局分别出石头、布胜利了的次数
     */
    private int[][] history = new int[][]{
            {1, 1, 1}, {1, 1, 1}, {1, 1, 1}
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0;
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        previousHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(currentHandValue);
    }

    private int getSum(int currentHandValue) {
        int sum = 0;
        for (int i = 0; i < history[currentHandValue].length; i++) {
            sum += history[currentHandValue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[previousHandValue][currentHandValue]++;
        } else {
            history[previousHandValue][(currentHandValue + 1) % 3]++;
            history[previousHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
