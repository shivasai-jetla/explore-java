package JDBC;
import java.sql.*;

public class JDBC_Uni {

    public static final String url = "jdbc:mysql://localhost:3307/training";
    public static final String userName = "root";
    public static final String password = "root";


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            String query = "SELECT *from employee";

            ResultSet rs = statement.executeQuery(query);

            while (rs.next())
            {
                int id = rs.getInt("emp_id");
                String name = rs.getString("name");
                String role = rs.getString("emp_role");

                System.out.println(id+"\t "+name+"\t "+role);
            }

            connection.close();
            statement.close();
            rs.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
