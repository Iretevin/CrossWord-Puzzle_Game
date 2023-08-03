
package com.mycompany.aptechp2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBConnect {
     void connectAndenter( int id,String user_name,int hours,int minutes,int seconds,int milliseconds){
         
      
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crosswordpuzzled","root","");
          String query = "insert into detailstable( id,user_name,hours,minutes,seconds,milliseconds)values(?,?,?,?,?,?)";
          PreparedStatement preparedStmt = conn.prepareStatement(query);
          preparedStmt.setInt(1,id);
          preparedStmt.setString(2,user_name);
          preparedStmt.setInt(3,hours);
          preparedStmt.setInt(4,minutes);
          preparedStmt.setInt(5,seconds);
          preparedStmt.setInt(6,milliseconds);
           int i = preparedStmt.executeUpdate();
           
           if(i>1){
               System.out.println("Data is inserted");
           }
           else{
               System.out.println("No data");
           }
        }catch(Exception e){
            System.out.println(e);
        }
    }
     
     
     
    
    
    
}
