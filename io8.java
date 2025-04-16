// Reading and writing using DATA Stream

import java.io.*;

public class io8
{
    public static void main(String[] args) throws Exception {
        File f=new File("iotext5.txt");
        FileOutputStream ifs=new FileOutputStream(f);
        DataOutputStream ds=new DataOutputStream(ifs);
        ds.writeInt(2);
        ds.writeUTF("Hello");
        ds.writeBoolean(true);
        // int num[]={10,20,30,40,50};
        // for(int i:num)
        // {
        //     ds.writeInt(i);
        // }
        System.out.println("done");
        ifs.close();
        ds.close();

        FileInputStream fs=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fs);
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
    
        fs.close();
        dis.close();
    }    
}
