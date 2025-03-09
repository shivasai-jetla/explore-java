package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Prepared_Delete {

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

            String query = "DELETE FROM EMPLOYEE WHERE EMP_ID = ?";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1,104);

            int rowEffected = preparedStatement.executeUpdate();

            if(rowEffected > 0)
            {
                System.out.println("rows deleted successfully");
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
