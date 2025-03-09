package training;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;


class ReadOneWriteTwo
{

    public static void main(String[] args)
    {

        try{
            FileReader input = new FileReader("filename1.txt");
            FileWriter output1 = new FileWriter("Filename2.txt");
            FileWriter output2 = new FileWriter("Filename3.txt");

            BufferedReader reader = new BufferedReader(input);
            BufferedWriter writer1 = new BufferedWriter(output1);
            BufferedWriter writer2 = new BufferedWriter(output2);

            String content = reader.readLine();

            if(content != null)
            {
                String[] sentences = content.split("\\.");

                if(sentences.length > 0)
                {
                    writer1.write(sentences[0].trim() + ".");
                }

                if(sentences.length > 1)
                {
                    writer2.write(sentences[1].trim() + ".");
                }

            }
            reader.close();
            writer1.close();
            writer2.close();
            input.close();
            output1.close();
            output2.close();


        }

        catch(IOException e)
        {
            System.err.println(e.getMessage());
        }



    }
}








