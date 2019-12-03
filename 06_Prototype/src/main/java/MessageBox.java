import framework.Product;

public class MessageBox extends Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String letter) {
        int length = letter.length();
        printLine(length);
        System.out.println(decochar + " " + letter + " " + decochar);
        printLine(length);
    }

    private void printLine(int length) {
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }
}
