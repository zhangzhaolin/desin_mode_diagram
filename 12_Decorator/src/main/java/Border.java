public abstract class Border extends Display {

    /**
     * 表示被装饰物
     */
    private Display display;

    protected Border(Display display) {
        this.display = display;
    }

    protected Display getDisplay() {
        return display;
    }

    protected void setDisplay(Display display) {
        this.display = display;
    }
}
