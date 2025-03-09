package JDBC;
import java.sql.*;
import java.util.*;

public class JDBC_Statements_User {

    private static final String url = "jdbc:mysql://localhost:3307/training";
    private static final String username = "root";
    private static final String password = "root";

    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            Scanner sc = new Scanner(System.in);

            while(true)
            {
                System.out.println("Enter student ID: ");
                int id = sc.nextInt();
                System.out.println("Enter student first name: ");
                String fname = sc.next();
                System.out.println("Enter student ;ast name: ");
                String lname = sc.next();
                System.out.println("Enter student marks: ");
                Double marks = sc.nextDouble();
                System.out.println("Do you want to continue(Y/N): ");
                String query = String.format("INSERT into student(id,first_name,last_name,marks) VALUES(%d, '%s', '%s', %f)",id,fname,lname,marks);
                statement.addBatch(query);

                String choice = sc.next();
                if(choice.equals("N"))
                {
                    break;
                }

            }

            int[] arr = statement.executeBatch();

            boolean isInserted = true;
            for(int i: arr)
            {
                if(arr[i] == 0)
                {
                    System.out.println("Record "+ (i+1) +"not inserted");
                    isInserted = false;
                }
            }

            if(isInserted == true)
            {
                System.out.println("Data inserted successfully");
            }





        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
