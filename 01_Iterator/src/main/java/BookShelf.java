import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BookShelf implements Aggregate<Book> {

    private int maxSize;
    private Book[] books;
    private int length = 0;
    private Logger logger = LogManager.getLogger(BookShelf.class);

    public BookShelf(int maxSize) {
        this.maxSize = maxSize;
        this.books = new Book[this.maxSize];
    }

    public void addBook(Book book) {
        if (length >= maxSize) {
            logger.error("length : {}  maxSize : {} ", length, maxSize);
            throw new ArrayIndexOutOfBoundsException();
        }
        books[length++] = book;
    }

    public int getLength() {
        return length;
    }


    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator();
    }

    private class BookShelfIterator implements Iterator<Book> {

        private int pointer = 0;

        @Override
        public boolean hasNext() {
            return pointer < length;
        }

        @Override
        public Book next() {
            if (pointer >= length) {
                logger.error("pointer : {}  length : {} ", pointer, length);
                throw new ArrayIndexOutOfBoundsException();
            }
            return books[pointer++];
        }
    }
}
