public class Book {
    //Data Hiding using private, Encapsulation!
    private String bookId;
    private String title;
    private String author;
    private boolean isIssued;

    Book(String id, String name, String author, boolean is_issued){ //constructor
        this.bookId = id;
        this.title = name;
        this.author = author;
        this.isIssued = is_issued;
    }
    Book(String id, String name, String author){ //constructor overloading
        this(id, name, author, false);
    }

    //Getters And Setters
    public String getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isBookIssued(){
        return isIssued;
    }


    /* This attempts to issue the book
    @return true if book can be issued, else return false;
     */

    public boolean issueBook(){
        if(this.isIssued){
            return false;
        }
        isIssued = true;
        return true;
    }
    public void returnBook() {
        isIssued = false;
    }

    public String toString(){
        return "Book ID: " + bookId +
                ", Title: " + title +
                ", Author: " + author +
                ", Issued: " + isIssued;
    }
}
