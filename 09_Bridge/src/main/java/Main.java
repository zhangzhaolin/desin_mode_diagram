public class Main {
    public static void main(String[] args) {

        Display d1 = new Display(new StringDisplayImpl("Hello China."));
        d1.display();



        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello Word."));
        d3.multiDisplay(5);
    }
}
