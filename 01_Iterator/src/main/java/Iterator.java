import java.util.function.Consumer;

public interface Iterator<T> {

    boolean hasNext();

    T next();

    default void forEachConsumer(Consumer<T> consumer) {
        if (hasNext()) {
            consumer.accept(next());
        }
    }

}
