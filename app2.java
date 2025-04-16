import java.sql.*;  
class app2
{  
    public static void main(String args[])
    {  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/","root","root1234");  
            Statement stmt=con.createStatement();  
            stmt.execute("insert into mydemo.user values(2,'mno',18,'tester')");  
            System.out.println("Success");
            con.close();  
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    }  
}  
