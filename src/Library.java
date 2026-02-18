import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    private Book findBook(String bookId){
        for(Book b : books){
            if(b.getBookId().equals(bookId))
                return b;
        }
        return null;
    }

    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(String bookId){
        Book book = findBook(bookId);
        if(book != null){
            books.remove(book);
            System.out.println("Book Removed Successfully!");
            return;
        }else
            System.out.println("Book Not Found!");
    }

    public void issueBook(String bookId){
        Book book = findBook(bookId);
        if(book == null){
            System.out.println("Book not found!");
            return;
        }
        else if(!book.issueBook())
            System.out.println("Book has been issued to someone else, please wait until its back");
        else
            System.out.println("Book issued successfully!");
    }
    public void returnBook(Book book){
        book.returnBook();
        System.out.println("Book has been Returned!");
    }
    public void displayBooks(){
        for(Book b : books){
            System.out.println(books);
        }
    }
}
