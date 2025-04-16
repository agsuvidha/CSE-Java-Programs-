// Buffered Input Stream

import java.io.*;
public class io9 {
    public static void main(String[] args) throws IOException{
        //File f=new File("iotext6.txt");
        BufferedInputStream bs=new BufferedInputStream(System.in);
        int data=bs.read();
        System.out.println((char)data);
        bs.close();
    }
    
}
