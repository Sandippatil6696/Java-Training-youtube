public class Book {

    static int totalBooks;
    String auther ;
    String title ;
    String isbn ;

    boolean isBorrowed;

    static{
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String isbn ,String title , String auther){
        this.isbn = isbn;
        this.title = title;
        this.auther = auther;
    }

    Book(String isbn){
        this(isbn, "unknown", "unknown");
    }

    static int getTotalNoOfBooks(){
        return totalBooks ;
    }

    void borrowBook(){
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        }else{
            isBorrowed = true;
            System.out.println("Enjoy the book");
        }
    }

    void returnBook(){
        if (isBorrowed) {
            isBorrowed = false ;
            System.out.println("hope you enjoyed the book");
        }else{
            System.out.println("book is alerady return in library");
        }
    }

    public static void main(String[] args) {
    
        Book b = new Book("1", "design", "mike");
        Book b1 = new Book("2");

        System.out.println(getTotalNoOfBooks());
        b.borrowBook();
        b1.borrowBook();
        b.borrowBook();
        b.returnBook();
        b.returnBook();


    }

}
