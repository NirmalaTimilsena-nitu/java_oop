package database_example;

import java.sql.*;

public class InsertingData {
    public static void main(String args[]) throws Exception {
      String sql = "INSERT INTO STUDENTS1 (FIRSTNAME,MIDDLENAME,LASTNAME,AGE,CITY,STATE,COUNTRY)"
      		+ "VALUES ('Puja', 'Kumari','Chaulagai',20,'Kathmandu','Bagmati','Nepal'),"
      		+  "('Sachin', 'bahadur','Sunar',26,'Dhanusha','Madhesh','Nepal'),"
      		+ "('Sachin', 'bahadur','Sunar',67,'Dhanusha','Madhesh','Nepal')";
//      
//      String sql = "INSERT INTO STUDENT (STUDENTID,First_Name,LAST_NAME,AGE,Address)"
//        		+ "VALUES (101,'Binisha','Subedi',12,'Nepal')";
// Pass the sql to JDBC method       
        insertCustomer(sql);
    }
    private static void insertCustomer(String sql) throws Exception {
    	// Get the connection using our utils.;   
    	        Class.forName("com.mysql.cj.jdbc.Driver");
    	        String url = "jdbc:mysql://localhost:3306/bca_thirddb";
    	        Connection con = DriverManager.getConnection(url, "root", "MyApp_90");
    	        if (con != null) {
    	// Create statement from connection       
    	            Statement stmt = con.createStatement();
    	// Execute the statement by passing the sql       
    	            int result = stmt.executeUpdate(sql);
    	            if (result != -1) {
    	                System.out.println("Inserted" + result + "Record(s) successfully");
    	            } else {
    	                System.out.println("Unable to insert record. Please check your SQL syntax");
    	            }
    	         // Close the statements and Connections       
    	            stmt.close();
    	            con.close();
    	        } else {
    	            System.out.println("Unable to get the connection");
    	        }
    	    }
    	}

