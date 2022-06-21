import org.testng.annotations.Test;

import java.sql.*;

public class ConnectMySQL {
    @Test
    public void TestDatabase() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");
        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root","Udit@4085" );

        System.out.println("Connected");

        Statement statement=connection.createStatement();

        ResultSet resultSet=statement.executeQuery("Select * from selenium_users;");

        while (resultSet.next())
        {
            String email=resultSet.getString("email");
            String name=resultSet.getString("first_name");
            System.out.println(name+" "+email);
        }
    }
}
