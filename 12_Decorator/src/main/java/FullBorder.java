import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FullBorder extends Border {
    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getRows() {
        return 2 + getDisplay().getRows();
    }

    @Override
    public int getColumns() {
        return 2 + getDisplay().getColumns();
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine("-", getDisplay().getColumns()) + "+";
        } else if (row == getDisplay().getRows() + 1) {
            return "+" + makeLine("-", getDisplay().getColumns()) + "+";
        } else {
            return "|" + getDisplay().getRowText(row - 1) + "|";
        }
    }

    private String makeLine(String str, int count) {
        StringBuffer buffer = new StringBuffer();
        IntStream.range(0, count).boxed().forEach(i -> buffer.append(str));
        return buffer.toString();
    }

}
