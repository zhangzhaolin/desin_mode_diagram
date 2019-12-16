public class Hand {

    public static final int HANDVALUE_SHITOU = 0;
    public static final int HANDVALUE_JIANDAO = 1;
    public static final int HANDVALUE_BU = 2;

    public static final Hand[] hand = {
            new Hand(HANDVALUE_SHITOU),
            new Hand(HANDVALUE_JIANDAO),
            new Hand(HANDVALUE_BU)
    };

    public static final String[] name = {"石头", "剪刀", "布"};

    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    @Override
    public String toString() {
        return name[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    /**
     * 计分
     *
     * @param hand
     * @return 平：0；胜利：1；失败：-1
     */
    private int fight(Hand hand) {
        if (this.handValue == hand.handValue) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }
}
