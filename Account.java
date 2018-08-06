
package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Account {
    //step1
    
  String user="root";//by default DB username is root and password is blank
  String pass="";
  String url="jdbc:mysql://localhost:3306/hospital";
  String driver="com.mysql.jdbc.Driver";
   Connection con;
  //step2
  void dbConnect() throws ClassNotFoundException, SQLException{
      Class.forName(driver);//step2--load driver
      con=DriverManager.getConnection(url, user,pass);// create connection
            
  }
  void dbClose() throws SQLException{
      con.close();
  }
  
  public void insertPatientInfo(String name,String contact,String age,String dname,String date,String time) throws ClassNotFoundException, SQLException{
      dbConnect();
      String sql="insert into patient(name,contact,age,dname,date,time) values(?,?,?,?,?,?)";
      PreparedStatement pstmt=con.prepareStatement(sql);
      pstmt.setString(1,name );
      pstmt.setString(2,contact );
      pstmt.setString(3,age );
      pstmt.setString(4,dname );
      pstmt.setString(5,date );
      pstmt.setString(6,time );
     pstmt.executeUpdate();
      dbClose();
  }
  
}
