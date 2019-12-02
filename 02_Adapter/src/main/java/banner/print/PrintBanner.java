package banner.print;

public class PrintBanner<T> extends Print {

    private Banner<T> banner;

    public PrintBanner(T value) {
        banner = new Banner<>(value);
    }

    /**
     * @return (str)
     */
    @Override
    public String printWeak() {
        return banner.showWithParen();
    }

    /**
     * @return *str*
     */
    @Override
    public String printStrong() {
        return banner.showWithAster();
    }
}
