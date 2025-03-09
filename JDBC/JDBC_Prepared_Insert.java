package JDBC;

import java.sql.*;

public class JDBC_Prepared_Insert {
    public static void main(String[] args) throws SQLException {

        String jdbcURL = "jdbc:mysql://localhost:3307/training";
        String username = "root";
        String password = "root";


        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            System.out.println("Connecting to the database...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connection successful!");

            String query = "insert into employee(emp_id,name,emp_role,emp_age,gender,salary) values(?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1,104);
            preparedStatement.setString(2,"Rahul");
            preparedStatement.setString(3,"Tester");
            preparedStatement.setInt(4,22);
            preparedStatement.setString(5,"Male");
            preparedStatement.setInt(6,10000);

            int rowEffected = preparedStatement.executeUpdate();

            if(rowEffected > 0)
            {
                System.out.println("rows inserted successfully");
            }
        }

     catch (SQLException e) {
        System.err.println("Failed to connect to the database.");
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    } finally {
            if(connection!=null)
            {
                connection.close();
            }
            if(preparedStatement != null)
            {
                preparedStatement.close();
            }
        }

    }
}
