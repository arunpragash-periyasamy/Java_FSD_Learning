package demo.src.main.java.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/kec_hostel";
    private static final String USER = "kec_hostel";
    private static final String PASSWORD = "kec_password";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully.");
        } catch (SQLException e) {
            System.err.println("Failed to establish connection.");
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        // Test the connection
        Connection connection = getConnection();
        if (connection != null) {
            try {
                Statement stmt = connection.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM student_registration");
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + " " + rs.getString("Student_Name") + " " + rs.getString("EmailId"));
                    }
                
                connection.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}