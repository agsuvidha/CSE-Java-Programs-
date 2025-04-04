// Program of Flow layout with window adaptor

import java.awt.*;
import java.awt.event.*;
public class awt2 extends Frame 
{
    awt2()
    {   
        Label l=new Label("Welcome");
        Button b=new Button("Submit");
        setBackground(Color.lightGray);
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
        awt2 a=new awt2();
    }
}
