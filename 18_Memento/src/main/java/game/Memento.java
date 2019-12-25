package game;

import java.util.ArrayList;
import java.util.Collections;

public class Memento {

    private int money;
    private ArrayList<String> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    Memento(int money, ArrayList<String> fruit) {
        this.money = money;
        this.fruits = new ArrayList<>();
        Collections.copy(this.fruits, fruit);
    }

    void addFruit(String fruit) {
        this.fruits.add(fruit);
    }

    ArrayList<String> getFruits() {
        return (ArrayList<String>) fruits.clone();
    }

    public int getMoney() {
        return money;
    }
}
