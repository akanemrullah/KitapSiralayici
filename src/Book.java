public class Book implements Comparable<Book> {

    private String bookName;
    private int pageNumber;
    private String authorsName;
    private String publicationDate;

    public Book(String bookName, int pageNumber, String authorsName, String publicationDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorsName = authorsName;
        this.publicationDate = publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public int compareTo(Book o) {

        return 0;
    }
}
