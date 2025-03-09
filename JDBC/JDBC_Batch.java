package JDBC;

import java.sql.*;

public class JDBC_Batch {

    public static final String url = "jdbc:mysql://localhost:3307/training";
    public static final String userName = "root";
    public static final String password = "root";

    public static void main(String args[]) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");


        Connection con = DriverManager.getConnection(url,userName,password);
        con.setAutoCommit(false);

        Statement stmt = con.createStatement();

        stmt.addBatch("INSERT INTO employee (emp_id, name, emp_role,emp_age,gender,salary) VALUES (104, 'abhi', 'UI/UX',22,'male',20000)");
        stmt.addBatch("INSERT INTO employee (emp_id, name, emp_role,emp_age,gender,salary) VALUES (105, 'umesh', 'cloud',23,'male',50000)");

        stmt.executeBatch();

        con.commit();

        con.close();
    }
}

