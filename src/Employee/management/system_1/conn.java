package Employee.management.system_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class conn {
    public boolean conn;
    public PreparedStatement con;
    Connection connection;
    Statement statement;

    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employeemanagement";
            String username = "nandan";
            String user_password = "nandanN123@";
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement",username="root",user_password="nandanN123@");
            statement= connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static PreparedStatement prepareStatement(Object sql) {
        PreparedStatement preparedStatement = null;
        return preparedStatement;
    }
}
