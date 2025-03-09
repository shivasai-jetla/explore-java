package JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBC_Prepared_User {

    private static final String url = "jdbc:mysql://localhost:3307/training";
    private static final String username = "root";
    private static final String password = "root";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }

        try {
                Connection connection = DriverManager.getConnection(url, username, password);
                Scanner sc = new Scanner(System.in);

                String query = "INSERT INTO student (id, first_name, last_name, marks) VALUES (?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

            while (true) {
                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // Consume leftover newline

                System.out.print("Enter student first name: ");
                String fname = sc.nextLine();

                System.out.print("Enter student last name: ");
                String lname = sc.nextLine();

                System.out.print("Enter student marks: ");
                double marks = sc.nextDouble();


                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, fname);
                preparedStatement.setString(3, lname);
                preparedStatement.setDouble(4, marks);
                preparedStatement.addBatch();

                System.out.print("Do you want to continue (Y/N): ");
                String choice = sc.next();
                if (choice.equals("N")) {
                    break;
                }
            }

            int[] arr = preparedStatement.executeBatch();


            boolean isInserted = true;
            for(int i = 0; i < arr.length;i++)
            {
                if(arr[i] == 0)
                {
                    System.out.println("Record "+ (i+1) +"not inserted");
                    isInserted = false;
                }
            }

            if (isInserted) {
                System.out.println("Data inserted successfully.");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
