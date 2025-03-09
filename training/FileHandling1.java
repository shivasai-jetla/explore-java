package training;

import java.io.File;
import java.io.IOException;

class FileHandling1
{
    public static void main(String[] args)
    {

        try{
            File obj = new File("filename1.txt");

            if(obj.createNewFile())
            {
                System.out.println("File Created: " + obj.getName());
            }
            else{
                System.out.println("File already exist...");
            }
        }

        catch(IOException e){
            System.out.println(e);
        }



    }
}