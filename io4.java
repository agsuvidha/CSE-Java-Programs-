//Writing to a file using FILEOUTPUT Stream

import java.io.*;

public class io4
{
    public static void main(String[] args) 
    {
        try
        {
           String msg="Welcome";
            FileOutputStream of=new FileOutputStream("iotest.txt");
            byte b[]=msg.getBytes();
            of.write(b);
            of.close();
            System.out.println("done");
        }
        catch(Exception e)
        {

        }
    }    
}
