
//Random Access File


import java.io.*;
public class io14 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream fs=new FileOutputStream("iotest.txt");
        // RandomAccessFile rf=new RandomAccessFile("iotest5.txt","rw");
        // rf.write("Hello world".getBytes()); 
        
        
        // // RandomAccessFile rf=new RandomAccessFile("iotest.txt","r");
        // int data=rf.read();
        // while(data!=-1)
        // {
        //     System.out.println(data);
        //     data=rf.read();
        // }
        // rf.close();
        
        
        // RandomAccessFile rf=new RandomAccessFile("iotest5.txt","r");
        // while(true)
        // {
        //     String s=rf.readLine();
        //     if(s==null)
        //     {
        //         break;
        //     }
        //     System.out.println(s);
        // }
        // rf.close();
        
        
        RandomAccessFile rf=new RandomAccessFile("iotest5.txt","r");
        while(true)
        {
            long val=rf.getFilePointer();
            String s=rf.readLine();
            if(s==null)
            {
                break;
            }
            if(s.equals("Welcome"))
            {
                rf.seek(val);
                rf.writeBytes("JIMS");
            }
            System.out.println(s);
        }
        rf.close();
        
        
        System.out.println("Success");
    }
}
