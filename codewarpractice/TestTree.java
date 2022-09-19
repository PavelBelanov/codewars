package codewarpractice;

import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("Как устроены кошки");
        Book b2 = new Book("Постройте заново свое тело");
        Book b3 = new Book("В поисках Эмо");
        BookComparator comp = new BookComparator();

        HashSet<Book> tree = new HashSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        List<Book> books = new ArrayList<>(tree);
        System.out.println(books);
        Collections.sort(books,comp);
        System.out.println(books);

    }
}
class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }
}

class Book  {
    String title;

    public Book(String t) {
        title = t;
    }
    @Override
    public String toString() {
        return
                "title = '" + title + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
