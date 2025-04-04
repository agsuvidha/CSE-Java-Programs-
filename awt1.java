// Basic AWT program to show the working of frame

import java.awt.*;
public class awt1 {
    awt1()
    {
        Frame f=new Frame();
        Label l1=new Label("Name");
        f.setSize(200,200);
        f.setVisible(true);
        f.add(l1);
        }
    public static void main(String[] args) {
        awt1 a=new awt1();
    }
}
