package JDBC;

import java.sql.*;

public class JDBC_Statement_Insert {
    public static void main(String[] args) throws SQLException {

        String jdbcURL = "jdbc:mysql://localhost:3307/training";
        String username = "root";
        String password = "root";


        Connection connection = null;
        Statement statement = null;

        try {
            System.out.println("Connecting to the database...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connection successful!");
            statement = connection.createStatement();

            String query = "insert into employee(emp_id,name,emp_role,emp_age,gender,salary) values(103,'ronex','AI analyst',22,'male',50000)";

            int rowEffected = statement.executeUpdate(query);

            if(rowEffected > 0)
            {
                System.out.println("rows inserted successfully");
            }


        } catch (SQLException e) {
            System.err.println("Failed to connect to the database.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        finally {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
    }
}


