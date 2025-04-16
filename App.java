import java.sql.*;  
class App{  
public static void main(String args[]){  
try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/","root","root1234");  
    //here sonoo is database name, root is username and password  
    Statement stmt=con.createStatement();  
    stmt.executeUpdate("create database mydemo");  
    // while(rs.next())  
    // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    System.out.println("Success");
    con.close();  
}
catch(Exception e)
{ System.out.println(e);}  
}  
}  