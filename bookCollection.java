import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;



/*
McKenna Pasquale
Software Development 1
01/28/2024


This class creates the text file, tests its existence, and writes the essential information relating to the assignment
 */

public class bookCollection
{
    public  void go()
    {

        File file = new File("C:/Users/kenna/IdeaProjects/LibraryManagementSystem/src/lms.txt"); //creating relationship with the text file

        if(file.exists()) //test to ensure it exists and is syncing correctly.
            {
            System.out.println("The file exists");

            }
        else
            {
            System.out.println("File doesn't exist");
            }


        try //writing original information to the file.
            {
            FileWriter writer = new FileWriter("C:/Users/kenna/IdeaProjects/LibraryManagementSystem/src/lms.txt");
            writer.write("1,To Kill a Mockingbird,Harper Lee\n2,1984,George Orwell\n3,The Great Gatsby,F. Scott Fitzgerald"); //include basic text from assignment
            //writer.append("\nLast updated by KennaP"); //anything I want added to the last line of the text file
            writer.close(); //closing the writer
            }
        catch (IOException e)
            {
            e.printStackTrace();
            }

    }
}

