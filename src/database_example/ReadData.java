package database_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bca_thirddb", "root", "MyApp_90"
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students1");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + 
                		" " + resultSet.getString(2) + 
                		" " + resultSet.getString(3));
                ;

            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
