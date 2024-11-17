import java.util.Scanner;

/**
 * Main class to manage books using either a Stack or Queue data structure
 */
public class FA2024_ManageBookWithGenericStackandGenericQueue_NguyenD {
    public static void main(String[] args) {
        boolean displayMainMenu = true;
        while (displayMainMenu) {
            Scanner scanner = new Scanner(System.in);
            // Display main menu options
            System.out.println("MENU OF DATA STRUCTURE - DUSTIN NGUYEN");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Generic Stack");
            System.out.println("2. Generic Queue");
            System.out.println("0. Exit");
            System.out.println("Type 1 or 2 to select a Data Structure type or 0 to exit.");
            int input;
            switch (input = scanner.nextInt()) {
                case 1: // Stack Implementation
                    scanner.nextLine(); // Clear buffer
                    GenericStack<FA2024_Book_NguyenD> bookStack = new GenericStack<>();

                    // Input 3 books from user
                    for(int i = 1; i <= 3; i++) {
                        System.out.println("\nEnter Information for Book " + i + ":");
                        System.out.print("ISBN: ");
                        String isbn = scanner.nextLine();

                        System.out.print("Book Title: ");
                        String title = scanner.nextLine();

                        System.out.print("Writer: ");
                        String writer = scanner.nextLine();

                        System.out.print("Publisher: ");
                        String publisher = scanner.nextLine();

                        // Create and add book to stack
                        FA2024_Book_NguyenD book = new FA2024_Book_NguyenD(isbn, title, writer, publisher);
                        bookStack.push(book);
                    }

                    // Display all books in stack using temporary stack to preserve order
                    GenericStack<FA2024_Book_NguyenD> tempBookStack = new GenericStack<>();
                    System.out.println("THREE BOOKS ARE INSERTED - Dustin Nguyen");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Generic Stack:");
                    while(!bookStack.isEmpty()) {
                        FA2024_Book_NguyenD currentBook = bookStack.pop();
                        System.out.println(currentBook.toString());
                        tempBookStack.push(currentBook);
                    }
                    // Restore books to original stack
                    while(!tempBookStack.isEmpty()) {
                        bookStack.push(tempBookStack.pop());
                    }

                    // Delete and display one book from stack
                    FA2024_Book_NguyenD currentBook = bookStack.pop();
                    if(bookStack.isEmpty()) {
                        System.out.println("DELETE ONE BOOK - DUSTIN NGUYEN");
                        System.out.println("------------------------------------------");
                        System.out.println("The stack is empty");
                    }
                    else {
                        System.out.println("DELETE ONE BOOK - DUSTIN NGUYEN");
                        System.out.println("------------------------------------------");
                        System.out.println(currentBook.toString());
                    }

                    // Display top book in stack
                    if(bookStack.isEmpty()) {
                        System.out.println("BOOK AT TOP OF STACK - DUSTIN NGUYEN");
                        System.out.println("------------------------------------------");
                        System.out.println("The stack is empty");
                    } else {
                        System.out.println("BOOK AT TOP OF STACK - DUSTIN NGUYEN");
                        System.out.println("------------------------------------------");
                        System.out.println(bookStack.peek().toString());
                    }

                    // Show all remaining books in stack
                    if(bookStack.isEmpty()) {
                        System.out.println("SHOW ALL BOOKS IN STACK - DUSTIN NGUYEN");
                        System.out.println("------------------------------------------");
                        System.out.println("The stack is empty");
                    }
                    else {
                        System.out.println("SHOW ALL BOOKS IN STACK - DUSTIN NGUYEN");
                        System.out.println("------------------------------------------");
                        while (!bookStack.isEmpty()) {
                            FA2024_Book_NguyenD currentBook2 = bookStack.pop();
                            System.out.println(currentBook2.toString());
                            tempBookStack.push(currentBook2);
                        }
                        bookStack.push(tempBookStack.pop());
                    }
                    break;

                case 2: // Queue Implementation
                    scanner.nextLine(); // Clear buffer
                    GenericQueue<FA2024_Book_NguyenD> bookQueue = new GenericQueue<>();

                    // Input 3 books from user
                    for(int i = 1; i <= 3; i++) {
                        System.out.println("\nEnter Information for Book " + i + ":");
                        System.out.print("ISBN: ");
                        String isbn = scanner.nextLine();

                        System.out.print("Book Title: ");
                        String title = scanner.nextLine();

                        System.out.print("Writer: ");
                        String writer = scanner.nextLine();

                        System.out.print("Publisher: ");
                        String publisher = scanner.nextLine();

                        // Create and add book to queue
                        FA2024_Book_NguyenD book = new FA2024_Book_NguyenD(isbn, title, writer, publisher);
                        bookQueue.enqueue(book);
                    }

                    // Display all books in queue using temporary queue to preserve order
                    GenericQueue<FA2024_Book_NguyenD> tempBookQueue = new GenericQueue<>();
                    System.out.println("THREE BOOKS ARE INSERTED - Dustin Nguyen");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Generic Queue:");
                    while(!bookQueue.isEmpty()) {
                        FA2024_Book_NguyenD currentBook3 = bookQueue.dequeue();
                        System.out.println(currentBook3.toString());
                        tempBookQueue.enqueue(currentBook3);
                    }
                    // Restore books to original queue
                    while(!tempBookQueue.isEmpty()) {
                        bookQueue.enqueue(tempBookQueue.dequeue());
                    }

                    // Delete and display third book from queue
                    if(bookQueue.isEmpty()) {
                        System.out.println("DELETE ONE BOOK - DUSTIN Nguyen");
                        System.out.println("------------------------------------------");
                        System.out.println("The queue is empty");
                    } else {
                        System.out.println("DELETE ONE BOOK - DUSTIN Nguyen");
                        System.out.println("------------------------------------------");
                        tempBookQueue = new GenericQueue<>();
                        int count = 0;
                        // Process queue to get to third book
                        while(!bookQueue.isEmpty()) {
                            FA2024_Book_NguyenD currentBook4 = bookQueue.dequeue();
                            if(count < 2 ){
                                tempBookQueue.enqueue(currentBook4);
                            } else if (count == 2 ){
                                System.out.println(currentBook4.toString());
                            }
                            count++;
                        }
                        // Restore remaining books
                        while(!tempBookQueue.isEmpty()) {
                            bookQueue.enqueue(tempBookQueue.dequeue());
                        }
                    }

                    // Show all remaining books in queue
                    if(bookQueue.isEmpty()) {
                        System.out.println("SHOW ALL BOOKS IN QUEUE - DUSTIN Nguyen");
                        System.out.println("------------------------------------------");
                        System.out.println("The queue is empty");
                    }
                    else {
                        System.out.println("SHOW ALL BOOKS IN QUEUE - DUSTIN Nguyen");
                        System.out.println("------------------------------------------");
                        while (!bookQueue.isEmpty()) {
                            FA2024_Book_NguyenD currentBook5 = bookQueue.dequeue();
                            tempBookQueue.enqueue(currentBook5);
                            System.out.println(currentBook5.toString());
                        }
                        bookQueue.enqueue(tempBookQueue.dequeue());
                    }
                    break;

                case 0: // Exit program
                    displayMainMenu = false;
            }
        }
    }
}
