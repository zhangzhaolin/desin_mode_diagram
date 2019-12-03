import framework.Factory;
import framework.Product;
import idcard.CardFactory;

public class Main {

    public static void main(String[] args) {
        Factory f = new CardFactory();
        Product p1 = f.create("小红");
        Product p2 = f.create("小兰");
        Product p3 = f.create("小绿");
        p1.use();
        p2.use();
        p3.use();
        System.out.println(((CardFactory) f).getNumberOwners());
    }

}
