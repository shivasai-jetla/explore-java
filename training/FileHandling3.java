package training;

import java.io.FileWriter;
import java.io.IOException;

class FileHandling3{

    public static void main(String[] args)
    {

        try{

            FileWriter writer = new FileWriter("filename1.txt",true); //Overwrite
            //FileWriter writer = new FileWriter("filename1.txt",false); Append

            writer.write(" appended text");

            writer.close();
            System.out.println("Successfully Appended");
        }

        catch(IOException io)
        {
            System.out.println(io);
        }
    }

}
