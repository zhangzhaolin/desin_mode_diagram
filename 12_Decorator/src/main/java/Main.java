public class Main {

    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello Word");
        Display d2 = new SlidBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new SlidBorder(
                new FullBorder(
                        new FullBorder(
                                new SlidBorder(
                                        new FullBorder(
                                                new StringDisplay("Hello World")
                                        ), '*'
                                )
                        )
                ), '/'
        );
        d4.show();
    }

}
