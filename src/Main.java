import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        });

        Book book1 = new Book("Kitap",100,"Emrullah AKAN","22.03.2024");
        Book book2 = new Book("Tapki",150,"Emrullah AKAN","22.03.2024");
        Book book3 = new Book("Takip",127,"Emrullah AKAN","22.03.2024");
        Book book4 = new Book("Akipt",3142,"Emrullah AKAN","22.03.2024");
        Book book5 = new Book("Akpit",32,"Emrullah AKAN","22.03.2024");


        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book b : books){
            System.out.println(b.getBookName());
        }

        System.out.println("\n######################################\n");

        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);

        for (Book b : books2){
            System.out.println(b.getBookName());
        }

    }
}