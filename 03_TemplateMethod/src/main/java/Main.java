public class Main {

    public static void main(String[] args) {
        AbstractDisplay a1 = new CharDisplay('H');
        AbstractDisplay a2 = new StringDisplay("你好，世界。");
        AbstractDisplay a3 = new StringDisplay("Hello World!");
        a1.display();
        a2.display();
        a3.display();
    }

}
