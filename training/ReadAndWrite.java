package training;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class ReadAndWrite {

    public static void main(String[] args) throws IOException {

        try {
            File file1 = new File("filename1.txt");


            
            FileWriter writer = new FileWriter("filename2.txt", true);

            Scanner sc = new Scanner(file1);


            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                writer.write(data + "\n");
            }


            sc.close();
            writer.close();

            System.out.println("Data copied successfully!");

        } catch (FileNotFoundException fo) {
            System.out.println("Error: " + fo.getMessage());
        }
    }
}
