package training;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

class ReadOneWriteTwoDemo {

    public static void main(String[] args) {

        try (FileReader input = new FileReader("filename1.txt");
             FileWriter output1 = new FileWriter("Filename2.txt");
             FileWriter output2 = new FileWriter("Filename3.txt");
             BufferedReader reader = new BufferedReader(input);
             BufferedWriter writer1 = new BufferedWriter(output1);
             BufferedWriter writer2 = new BufferedWriter(output2)) {

            String content = reader.readLine(); // Read one line from the input file

            if (content != null) {
                // Split the content into sentences using the period as a delimiter
                String[] sentences = content.split("\\.");

                if (sentences.length > 0) {
                    // Write the first sentence to the first output file
                    writer1.write(sentences[0].trim() + ".");
                }

                if (sentences.length > 1) {
                    // Write the second sentence to the second output file
                    writer2.write(sentences[1].trim() + ".");
                }
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

