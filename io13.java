//Print stream

import java.io.*;
public class io13 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs=new FileOutputStream("iotest.txt");
        PrintStream ps=new PrintStream(fs);
        ps.println("Hello");
        ps.println(1234);
        ps.printf("Age is %d",10);
        ps.close();
        fs.close();
        System.out.println("Success");
    }
}
