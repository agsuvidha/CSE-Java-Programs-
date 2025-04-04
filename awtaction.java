//AWT program for calculator using Combo Box

import java.awt.*;
import java.awt.event.*;

public class awtaction implements ActionListener 
{
    Frame f;
    Panel p;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1;
    Choice c;

    awtaction()
    {
        f=new Frame();
        p=new Panel();
        
        l1=new Label("Number 1");
        l2=new Label("Number 2");
        l3=new Label("Result");
        c=new Choice();
        c.add("+");
        c.add("-");
        c.add("*");
        c.add("/");
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        b1=new Button("Submit");

        p.setLayout(null);
        
        l1.setBounds(50,50,50,20);
        t1.setBounds(100,50,50,20);

        l2.setBounds(50,100,50,20);
        t2.setBounds(100,100,50,20);
        
        c.setBounds(50,200,50,20);
        
        l3.setBounds(50,150,50,20);
        t3.setBounds(100,150,50,20);
       
        b1.setBounds(75,300,50,50);

        t3.setEditable(false);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(c);
        p.add(l3);
        p.add(t3);
        p.add(b1);

        f.add(p);

        f.setSize(400,500);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        b1.addActionListener(this);
    }    

    public void actionPerformed(ActionEvent e)
    {
        int val1=Integer.parseInt(t1.getText());
        int val2=Integer.parseInt(t2.getText());
        if(c.getSelectedIndex()==0)
        {
            t3.setText(Integer.toString(val1+val2));
        }        
        else if(c.getSelectedIndex()==1)
        {
            t3.setText(Integer.toString(val1-val2));
        } 
        else if(c.getSelectedIndex()==2)
        {
            t3.setText(Integer.toString(val1*val2));
        }
        else 
        {
            t3.setText(Integer.toString(val1/val2));
        }
     
    }
    public static void main(String[] args) 
    {
        new awtaction();
    }
}
