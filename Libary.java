

package strproject;

import java.util.InputMismatchException;

import java.util.Scanner;



public class Libary {

   
    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);

        LinkedList<Book> bookList = new LinkedList<>();
        LLQueue<Request> requestQueue = new LLQueue<>();

        Book b1 = new Book("Java Programming", "Sara");
        Book b2 = new Book("Data Structures", "Reema");
        Book b3 = new Book("Operating Systems", "Lama");

        bookList.addLast(b1);
        bookList.addLast(b2);
        bookList.addLast(b3);

        requestQueue.Enqueue(new Request("LLina", b1));
        requestQueue.Enqueue(new Request("Shooq", b2));
        requestQueue.Enqueue(new Request("Deema", b3));

        int option = 0;
        do {
            try {

                System.out.print("\n1. Add Book\n"
                        + "2. Find Book by Title\n"
                        + "3. Display Book List\n"
                        + "4. Find Book by Author\n "
                        + "5. Show Queue Requests\n"
                        + "6. Show First Requests in Queue\n"
                        + "7. Remove Book\n"
                        + "8. Display Available Books\n"//ava
                        + "9. Process First Request in Queue\n"//exit
                        + "10. Exit\n"
                        + ">> ");
                option = input.nextInt();
                switch (option) {
 
                    case 1:
                        System.out.println("Enter book title: ");
                        input.nextLine();
                        String title = input.nextLine();
                        System.out.println("Enter author title: ");
                        String author = input.nextLine();
                        bookList.addLast(new Book(title, author));
                        System.out.println("Book has been added.");
                        break;

                    case 2:
                        System.out.println("Enter book title: ");
                        input.nextLine();
                        title = input.nextLine();
                        Book b = bookList.findBookByTitle(title);
                        if (b != null) {
                            System.out.println(b);
                        } else {
                            System.out.println("Book not found");
                        }
                        break;//5

                    case 3:
                       System.out.println("Book List: ");
                        bookList.display();
                        break;
                    case 4:
                        System.out.println("Enter book author name: ");
                        input.nextLine();
                        author = input.nextLine();
                        b = bookList.findBookByAuthor(author);
                        if (b != null) {
                            System.out.println(b);
                        } else {
                            System.out.println("Book not found");
                        }
                        break;//6

                    case 5:
                        System.out.println("Requests in the queue: ");
                        requestQueue.display();
                        break;//7

                    case 6:
                        System.out.println("First Request in the Queue: ");
                        Request request = requestQueue.first();
                        System.out.println(request);//8

                        break;

                    case 7:
                        request = requestQueue.Dequeue();
                        System.out.println(request);
                        System.out.println("Request has been processed.");
                        break;//2
                    case 8:
                         System.out.println("Available books are ");
                       
                           bookList.displayAvailableBooks();
                    
                       
                    case 9:     
                        System.out.println("Thank you");
                        break;//10
                   
                    default:
                        System.out.println("Invalid option!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input");
                input.next();
            }
        } while (option != 9);//10

    }
}
