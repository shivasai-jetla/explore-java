package JDBC;

import java.sql.*;

public class JDBC_Retrieve {
    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3307/training";
        String username = "root";
        String password = "root";


        Connection connection = null;

        try {
            System.out.println("Connecting to the database...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connection successful!");
            Statement statement = connection.createStatement();

            String query = "SELECT *FROM EMPLOYEE";

            ResultSet result = statement.executeQuery(query);

            while (result.next())
            {
                int id = result.getInt("emp_id");
                String name = result.getString("name");

                System.out.println(id+" "+name);
            }

            connection.close();
            result.close();

        } catch (SQLException e) {
            System.err.println("Failed to connect to the database.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

