import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("小明", new WinningStrategy(47));
        Player p2 = new Player("小红", new ProbStrategy(100));
        IntStream.range(0, 1_0000).forEach(i -> {
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                p1.win();
                p2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                p1.lose();
                p2.win();
            } else {
                p1.even();
                p2.even();
            }
        });
        System.out.println("Total result : ");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
