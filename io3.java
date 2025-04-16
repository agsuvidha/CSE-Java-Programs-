// Basic File operations using FILE class

import java.io.*;

public class io3 {
    public static void main(String[] args)throws Exception {
        File f=new File("iotest2.txt");
      //  if(f.createNewFile())
        if(f.exists())
      {

            System.out.println("Created");
            System.out.println("file name "+f.getName());
            System.out.println("path "+f.getAbsolutePath());
            System.out.println("Readable "+ f.canRead());
            System.out.println("Size "+f.length());
        }
        else
        {
            System.out.println("Not");
        }
    }
    
}
