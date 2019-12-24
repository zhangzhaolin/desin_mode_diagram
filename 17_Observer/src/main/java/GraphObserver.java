import java.util.stream.IntStream;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        IntStream.range(0,generator.getNumber()).forEach(i-> System.out.print("*"));
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
