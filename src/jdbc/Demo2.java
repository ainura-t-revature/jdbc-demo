package jdbc;

import java.sql.*;

//insert data into table
public class Demo2 {
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
        // Demo2: Insert data into table
        String query = "insert into student (name, email) values (?, ?)";

        // get prepareStatement object
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        // set the values in query
        preparedStatement.setString(1, "Mark Smith");
        preparedStatement.setString(2, "m@gmail.com");
        preparedStatement.setString(1, "John Doe");
        preparedStatement.setString(2, "j@gmail.com");
        preparedStatement.setString(1, "Brad Man");
        preparedStatement.setString(2, "b@gmail.com");
        preparedStatement.setString(1, "Mike James");
        preparedStatement.setString(2, "mj@gmail.com");
        // execute query
        int rowAffected = preparedStatement.executeUpdate();
        System.out.println("("+ rowAffected +") rows affected" );
        connection.close();
        if (connection.isClosed())
            System.out.println("connection closed");
        else
            System.out.println("connection open");
    }
}
