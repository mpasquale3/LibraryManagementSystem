import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.io.*;



/*
McKenna Pasquale
Software Development 1
01/28/2024

This class asks the user to input a new book to the collection
 */

public class newCollection extends bookCollection
{
    listCollection listCollection = new listCollection();
    bookCollection bookCollection = new bookCollection();

    @Override
    public void go()
    //asking for user input to add a new book to the collection
        {
            try{
                FileWriter fileWriter = new FileWriter("C:/Users/kenna/IdeaProjects/LibraryManagementSystem/src/lms.txt");
                Scanner myObj = new Scanner(System.in);
                System.out.println("Enter Title of new book: ");
                System.out.println("Enter Author of new book: ");
                System.out.println("Enter Unique ID of new book: ");

                //assigning variables
                String title = myObj.nextLine();
                String author = myObj.nextLine();
                int ID = myObj.nextInt();
                String newBook =  title + ", " + author + ", " + ID + " ";

                //output variables
                System.out.println("\n" + bookCollection + "\n" + newBook);
                fileWriter.write("1,To Kill a Mockingbird,Harper Lee \n2,1984,George Orwell\n3,The Great Gatsby,F. Scott Fitzgerald");
                fileWriter.write("\n" + newBook);
                fileWriter.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }




        }


}