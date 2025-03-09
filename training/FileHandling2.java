package training;

import java.io.FileWriter;
import java.io.IOException;

class FileHandling2
{
    public static void main(String[] args)
    {

        try
        {
            FileWriter writer = new FileWriter("filename1.txt");

            writer.write("Hello Guys");

            writer.close();

            System.out.println("Successfully Written");
        }

        catch(IOException io)
        {
            io.printStackTrace();
        }
    }
}
