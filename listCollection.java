import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


/*
McKenna Pasquale
Software Development 1
01/28/2024

This class lists the entire collection
 */


public class listCollection extends bookCollection
{


@Override
    public void go()
        {
        try
            {
            //read from file
            FileReader reader = new FileReader("src/lms.txt");
            Scanner myReader = new Scanner(reader);
            System.out.println("Books currently in the system: ");

            while (myReader.hasNextLine())
                {
                String data = myReader.nextLine();
                System.out.println(data);
                //myReader.close();
                }

            }

        catch (FileNotFoundException e)
            {
            System.out.println("An error has occurred");
            e.printStackTrace();
            }
        }
}
