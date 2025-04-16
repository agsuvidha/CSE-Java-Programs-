//Buffered Stream

import java.io.*;
public class io12 {
    public static void main(String[] args) throws Exception {
        File f=new File("iotest.txt");
        FileInputStream fis=new FileInputStream(f);
        BufferedInputStream bis=new BufferedInputStream(fis);
        int data=bis.read();
        System.out.println(data);
        bis.close();
        fis.close();

    }
    
}
