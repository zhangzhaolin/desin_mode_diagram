import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CharDisplay extends AbstractDisplay {

    private char value;


    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(value);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
