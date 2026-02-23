import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner scan = new Scanner(System.in);
        AuthService auth = new AuthService();

        boolean loggedIn = false;
        User curUser = null;
        boolean isAdmin = false;

        while(!loggedIn){
            System.out.println("\n Welcome To The Library! Please Sign in...");
            System.out.println("1. Register New Student.");
            System.out.println("2. Register New Admin");
            System.out.println("3. Login");

            int choice = scan.nextInt();
            scan.nextLine();

            if(choice == 1){
                System.out.println("Enter Your Name: ");
                String name = scan.nextLine();

                System.out.println("Enter Your Id: ");
                String userId = scan.nextLine();
                curUser = new Student(name, userId);

                System.out.println("Enter Your Password: ");
                String pass = scan.nextLine();

                auth.register(curUser, pass);
                loggedIn = true;
            }else if(choice == 2){
                System.out.println("Enter Your Name: ");
                String name = scan.nextLine();

                System.out.println("Enter Your Id: ");
                String userId = scan.nextLine();
                curUser = new Admin(name, userId);

                System.out.println("Enter Your Password: ");
                String pass = scan.nextLine();

                auth.register(curUser, pass);
                loggedIn = true;
            }else{
                System.out.println("Enter Your Id: ");
                String userId = scan.nextLine();

                System.out.println("Enter Your Password: ");
                String pass = scan.nextLine();

                curUser = auth.login(userId, pass);
                if (curUser != null)
                    loggedIn = true;
                else{
                    System.out.println("Wrong Credentials!, Try Again.");
                }
            }
        }
        if(curUser instanceof Admin){
            isAdmin = true;
        }

        while(loggedIn){
            System.out.println("\n-----Library Menu-----");
            curUser.showMenu();
            System.out.println("4. Exit");

            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    if(isAdmin) {
                        System.out.println("Enter Book Id:");
                        String id = scan.nextLine();

                        System.out.println("Enter Book Title:");
                        String name = scan.nextLine();

                        System.out.println("Enter Author Name:");
                        String author = scan.nextLine();

                        Book newBook = new Book(id, name, author);
                        lib.addBook(id, newBook);
                        System.out.println("Book Added Successfully!");
                    }else{
                        System.out.println("Enter Book Id:");
                        String bookId_i = scan.nextLine();
                        lib.issueBook(bookId_i);
                    }
                    break;
                case 2:
                    if(isAdmin){
                        System.out.println("Enter Book Id:");
                        String bookId_r = scan.nextLine();
                        lib.removeBook(bookId_r);
                    }else{
                        System.out.println("Enter Book Id:");
                        String bookId_rt = scan.nextLine();
                        lib.returnBook(bookId_rt);
                    }
                    break;
                case 3:
                    lib.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
