import java.io.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
McKenna Pasquale
Software Development 1
01/28/2024

Main Class that runs the entire program
 */
public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/Users/kenna/IdeaProjects/LibraryManagementSystem/src/lms.txt"); //link text file


        //verify that the file exists - could be helpful for startup to ensure the file transferred over and is stored in the correct spot for users.
        if (file.exists()) {
            System.out.println("The file exists");
        } else {
            System.out.println("File doesn't exist");
        }


        //using inheritance and polymorphism to ensure proper collaboration
        bookCollection bookCollection = new bookCollection();
        newCollection newCollection = new newCollection();
        listCollection listCollection = new listCollection();
        removeBook removeBook = new removeBook();


        //creating an array of the different public classes
        bookCollection[] collection = {newCollection, listCollection, removeBook};


        //asks users which option they would like to perform in the system.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to 1: Add a new book to the collection, 2: List the current books in the collection, or 3: Delete a book from the collection?");
        int choice = scanner.nextInt();



        if (choice == 1) //gives user option to add a collection, and lists the collection.
        {
            bookCollection = new newCollection();
            newCollection.go();
            System.out.println("\n1,To Kill a Mockingbird,Harper Lee\n2,1984,George Orwell\n3,The Great Gatsby,F. Scott Fitzgerald");
        }
        else if (choice == 2) //lists the collections that I had entered in from original assignment info in text file, plus the file just recently added
        {
            bookCollection = new listCollection();
            listCollection.go();
        }
        else if (choice == 3) //removes a line from the collection.
             {
            removeBook = new removeBook();
            removeBook.removeRecord("C:/Users/kenna/OneDrive/Desktop/lms.txt",3);
            System.out.println("The books have been deleted from this file. ");


        }
    }
}

























