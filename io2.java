// Using FileOutputStream

import java.io.*;

public class io2 
{
    public static void main(String[] args) 
    {
        try
        {
            FileOutputStream of=new FileOutputStream("test.txt");
            of.write(109);
            of.close();
            System.out.println("done");
        }
        catch(Exception e)
        {

        }
    }    
}
