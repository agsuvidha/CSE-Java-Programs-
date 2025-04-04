// AWT program with Menu Bar

import java.awt.*;
import java.awt.event.*;
public class awt3 extends Frame 
{
    awt3()
    {   
        MenuBar mb=new MenuBar();
        Menu m=new Menu("Main");
        MenuItem m1=new MenuItem("File");
        MenuItem m2=new MenuItem("Open");
        

        Label l=new Label("Welcome");
        Button b=new Button("Submit");

        
        setBackground(Color.lightGray);
        setMenuBar(mb);
        m.add(m1);
        m.add(m2);
        
        mb.add(m);
        add(l);
        add(b);
        setSize(500,400);
        setVisible(true);
        setLayout(new FlowLayout());
        


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }        
        });
    }    
    
    public static void main(String[] args) {
        awt3 a=new awt3();
    }
}
