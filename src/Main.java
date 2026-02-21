import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("\n-----Library Menu-----");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Return Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Issue Book");
            System.out.println("6. Exit");

            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter Book Id:");
                    String id = scan.nextLine();

                    System.out.println("Enter Book Title:");
                    String name = scan.nextLine();

                    System.out.println("Enter Author Name:");
                    String author = scan.nextLine();

                    Book newBook = new Book(id, name, author);
                    lib.addBook(id, newBook);
                    System.out.println("Book Added Successfully!");
                    break;
                case 2:
                    lib.displayBooks();
                    break;
                case 3:
                    System.out.println("Enter Book Id:");
                    String bookId_rt = scan.nextLine();
                    lib.returnBook(bookId_rt);
                    break;
                case 4:
                    System.out.println("Enter Book Id:");
                    String bookId_r = scan.nextLine();
                    lib.removeBook(bookId_r);
                    break;
                case 5:
                    System.out.println("Enter Book Id:");
                    String bookId_i = scan.nextLine();
                    lib.issueBook(bookId_i);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
