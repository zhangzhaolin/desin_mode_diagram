import framework.Manager;
import framework.Product;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Manager manager = new Manager();
        manager.register("strong message", new UnderlinePan('~'));
        manager.register("waring box", new MessageBox('*'));
        manager.register("slash box", new MessageBox('/'));

        Product p1 = manager.create("strong message");
        p1.use("Hello , World!");
        Product p2 = manager.create("waring box");
        p2.use("Hello , World!");
        Product p3 = manager.create("slash box");
        p3.use("Hello , World!");

    }

}
