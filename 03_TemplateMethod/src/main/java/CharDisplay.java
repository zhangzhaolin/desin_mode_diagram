import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CharDisplay extends AbstractDisplay {

    private char value;


    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(value);
    }

    @Override
    protected void close() {
        System.out.println(">>");
    }
}
