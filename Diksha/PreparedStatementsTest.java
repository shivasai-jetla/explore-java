package Diksha;

import java.sql.*;
import java.util.Scanner;


public class Demo1 {

    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");

            Scanner s=new Scanner(System.in);
            int d=s.nextInt();;
            PreparedStatement ps=con.prepareStatement("select * from emp1 where id=?");
            ps.setInt(1, d);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}

