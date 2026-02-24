import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;

    private Book findBook(String bookId){
            return books.get(bookId);
    }

    public Library(){
        books = new HashMap<>();
    }
    public void addBook(String bookId, Book book){
        books.put(bookId, book);
    }
    public void removeBook(String bookId){
        Book book = findBook(bookId);
        if(book != null){
            books.remove(bookId);
            System.out.println("Book Removed Successfully!");
            return;
        }else
            System.out.println("Book Not Found!");
    }

    public void issueBook(String bookId, String userId){
        Book book = findBook(bookId);
        if(book == null){
            System.out.println("Book not found!");
            return;
        }
        else if(!book.issueBook(userId))
            System.out.println("Book has been issued to User: "+book.getIssuedToUserId()+" please wait until its back");
        else
            System.out.println("Book issued successfully!");
    }
    public void returnBook(String bookId){
        Book bookFound = findBook(bookId);
        if(bookFound != null) {
            if(bookFound.returnBook())
                System.out.println("Book has been Returned!");
            else
                System.out.println("Book hasn't been issued yet!");
        }else{
            System.out.println("Book Not Found!");
        }
    }
    public void displayBooks(){
        for(Book b : books.values()){
            System.out.println(books);
        }
    }
}
