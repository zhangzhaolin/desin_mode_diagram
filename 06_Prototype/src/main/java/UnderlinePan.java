import framework.Product;

public class UnderlinePan extends Product {

    private char ulchar;

    public UnderlinePan(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String str) {
        System.out.println(str);
        for (int i = 0; i < str.getBytes().length; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }
}
