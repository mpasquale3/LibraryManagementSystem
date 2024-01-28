import java.io.*;


/*
McKenna Pasquale
Software Development 1
01/28/2024

This class deletes a line from the collection by using line number, searching the old file to find that line, and overwrites that file with a new file that doesn't contain that line
 */


public class removeBook extends bookCollection
{


    public void removeRecord (String filepath, int deleteLine)
        {
            //create current file and one to overwrite file with a new file
        String tempFile = "C:/Users/kenna/IdeaProjects/LibraryManagementSystem/src/lms.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        //assigning variables
        int line = 0;
        String currentLine;

        //ensure all imports have been met, create reading and writing tasks to current and new files
        try
            {
            FileWriter fileWriter = new FileWriter(tempFile, true);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bWriter);

            FileReader fileReader = new FileReader(filepath);
            BufferedReader bReader = new BufferedReader(fileReader);

            while((currentLine = bReader.readLine()) != null)
                {
                line++;
                    if(deleteLine != line)
                    {
                    printWriter.println(currentLine);
                    }
                }

            printWriter.flush();
            fileWriter.close();
            bWriter.close();
            printWriter.close();
            fileReader.close();
            bReader.close();

            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);

            }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            }


        }



