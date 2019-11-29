import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IteratorText {

    @Test
    public void test1() {
        BookShelf bookShelf = new BookShelf(4);
        Iterator<Book> iterator = bookShelf.iterator();
        Assertions.assertFalse(iterator.hasNext());
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, iterator::next);
        Assertions.assertEquals(0, bookShelf.getLength());
    }

    @Test
    public void test2() {
        BookShelf bookShelf = new BookShelf(1);
        bookShelf.addBook(new Book("A", 1d));
        Iterator<Book> iterator = bookShelf.iterator();
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(iterator.next().getName(), "A");
        Assertions.assertFalse(iterator.hasNext());
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, iterator::next);
    }

    @Test
    public void error1() {
        BookShelf bookShelf = new BookShelf(1);
        bookShelf.addBook(new Book("A", 1d));
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> bookShelf.addBook(new Book("B", 2d)));
    }
}
