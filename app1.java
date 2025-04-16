import java.sql.*;  
class app1
{  
    public static void main(String args[])
    {  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/","root","root1234");  
            Statement stmt=con.createStatement();  
            stmt.executeUpdate("create table mydemo.User (Id int, name varchar(50),age int, profile varchar(50))");  
            System.out.println("Success");
            con.close();  
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    }  
}  
