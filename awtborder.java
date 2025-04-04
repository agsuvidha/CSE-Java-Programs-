//AWT program to demonstrate border layout

import java.awt.*;

public class awtborder {
    public static void main(String[] args) 
    {
        Frame f=new Frame();
        f.setSize(300,300);
        f.setVisible(true);
        Button b1=new Button("North");
        Button b2=new Button("East");
        Button b3=new Button("West");
        Button b4=new Button("South");
        Button b5=new Button("Center");
        f.setLayout(new BorderLayout(10,15));

        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.EAST);
        f.add(b3,BorderLayout.WEST);
        f.add(b4,BorderLayout.SOUTH);
        f.add(b5,BorderLayout.CENTER);
       
        
    }
    
}
