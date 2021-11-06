package jdbc;

import java.sql.*;

public class Demo4 {
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

        String query = "delete from student where name = ?";


        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "John Doe");

        int rowAffected = preparedStatement.executeUpdate();
        System.out.println("("+ rowAffected +") rows affected");

        connection.close();
                if(connection.isClosed())
                    System.out.println("connection closed");
                else
                    System.out.println("connection opened");



    }
}
