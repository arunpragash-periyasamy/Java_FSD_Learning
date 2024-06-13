package demo.src.main.java.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Test {
    static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kec_hostel", "kec_hostel",
                    "kec_password");
            System.out.println("MySQL Connected");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return connection;
    }
    public static void main(String[] args) {
        Connection connection = getConnection();
        if (connection != null) {
            try{
                Statement stmt = connection.createStatement();
                ResultSet result = stmt.executeQuery("SELECT id, Student_Id, Student_Name FROM student_registration");
                while (result.next()) {
                    System.out.println("Id : " + result.getInt("id") + " Roll number: " + result.getString("Student_Id")
                            + " Name: " + result.getString("Student_Name"));
                }
                connection.close();
            } catch (SQLException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}