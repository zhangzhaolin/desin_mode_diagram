package game;

import java.util.*;

public class Gamer {

    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitName = new String[]{"苹果", "葡萄", "香蕉", "橘子"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金钱增加了");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持金钱较少了");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获取了水果 : " + f);
            fruits.add(f);
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        fruits.stream().filter(p -> p.startsWith("好吃的")).forEach(memento::addFruit);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        Collections.copy(this.fruits, memento.getFruits());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Gamer.class.getSimpleName() + "[", "]")
                .add("money=" + money)
                .add("fruits=" + fruits)
                .add("random=" + random)
                .toString();
    }

    public String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix += "好吃的";
        }
        return prefix + fruitName[random.nextInt(fruitName.length)];
    }

}
