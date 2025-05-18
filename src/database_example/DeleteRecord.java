package database_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DeleteRecord {
    static Connection con = null;
    static Statement stmt = null;

    public static void main(String args[]) throws Exception {
        deleteData();
    } 

    private static void deleteData() throws Exception {
        String sql = "DELETE FROM students1 where age = 67 ";
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bca_thirddb";
         con = DriverManager.getConnection(url, "root", "MyApp_90");
         if (con != null) {
             stmt = con.createStatement();
             int result=stmt.executeUpdate(sql);
             if(result==1){
                 System.out.println("deleted");
                //JOptionPane.showMessageDialog(null, "Delete record Successfully");
             }else{
            	 System.out.println("Unable to delete record");
                 //JOptionPane.showMessageDialog(null, "Failed to Delete record ");
             }
             
         } else {
        	 
             System.out.println("Unable to get the connection");
         }
     }
}


