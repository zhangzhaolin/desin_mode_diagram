import framework.Factory;
import idcard.CardFactory;

public class Main {

    public static void main(String[] args) {
        Factory f = new CardFactory();
        f.create("小红").use();
        f.create("小兰").use();
        f.create("小绿").use();
        System.out.println(((CardFactory) f).getNumberOwners());
    }

}
