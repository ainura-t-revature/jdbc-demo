package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//create a table

public class Demo1 {
    public static void main(String[] args) throws SQLException {
        //Step 1: Load the Driver
        //Class.forName("jdbc:mysql.jdbc.Driver");

        // Step 2: Create Connection Object
        String url = "jdbc:mysql://localhost:3306/revature";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        // Step 3: Create Statement Object
        Statement statement = connection.createStatement();

        String query = "create table student (id INTEGER PRIMARY KEY AUTO_INCREMENT, name CHAR(50), email CHAR(20))";
        statement.executeUpdate(query);
        System.out.println("table created successfully");

        connection.close();
        if (connection.isClosed())
            System.out.println("connection closed");
        else
            System.out.println("connection open");
    }
}
