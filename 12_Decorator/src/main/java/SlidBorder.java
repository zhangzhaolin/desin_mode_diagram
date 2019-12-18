public class SlidBorder extends Border {

    private char borderChar;

    protected SlidBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getRows() {
        return getDisplay().getRows();
    }

    @Override
    public int getColumns() {
        return 2 + getDisplay().getColumns();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + getDisplay().getRowText(row) + borderChar;
    }
}
