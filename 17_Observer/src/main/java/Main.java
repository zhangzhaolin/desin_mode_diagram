public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new IncrementalNumberGenerator();
        generator.addObserver(new GraphObserver());
        generator.addObserver(new DigitObserver());
        generator.execute();
    }
}
