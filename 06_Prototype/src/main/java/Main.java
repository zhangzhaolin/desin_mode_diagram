import framework.Manager;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Manager manager = new Manager();
        manager.register("u1", new UnderLinePen('~'));
        manager.register("m1", new MessageBox('*'));
        manager.register("m2", new MessageBox('/'));

        manager.create("m1").use("Hello World!");
        manager.create("m2").use("Hello World!");
        manager.create("u1").use("Hello");
    }

}
