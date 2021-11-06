package jdbc;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Step 1: Load the Driver
        //Class.forName("jdbc:mysql.jdbc.Driver");

        // Step 2: Create Connection Object
        String url = "jdbc:mysql://localhost:3306/revature";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        // Step 3: Create Statement Object
        Statement statement = connection.createStatement();

        // Step 4: Execute Query
        String sql = "Select * from employee";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println("Id: " + resultSet.getInt(1) + ", Name: " +
                    resultSet.getString(2) + ", Email: " + resultSet.getString(3));
        }

        // Step 5: Close the connection
        connection.close();
    }

}
