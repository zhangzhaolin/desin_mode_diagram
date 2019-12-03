import framework.Product;

public class UnderLinePen extends Product {

    private char underline;

    public UnderLinePen(char underline) {
        this.underline = underline;
    }

    @Override
    public void use(String letter) {
        int length = letter.length();
        System.out.println(" " + letter + " ");
        for (int i = 0; i < length + 2; i++) {
            System.out.print(underline);
        }
        System.out.println();
    }
}
