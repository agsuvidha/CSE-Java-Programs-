// Awt program for Radio button

import java.awt.*;
import java.awt.event.*;

public class awtradio extends Frame implements ItemListener
{
    Checkbox c1,c2;
    Label l1;
    Panel p;    
    CheckboxGroup cb1;
    awtradio()
    {
        	l1=new Label(" ");
            p=new Panel();
            p.setLayout(null);
          
            l1.setBounds(50,50,200,50);
            cb1=new CheckboxGroup();
            c1=new Checkbox("Java",cb1,false);
            c2=new Checkbox("Python",cb1,true);
            c1.setBounds(50,250,50,30);
            c2.setBounds(50,300,50,30);
            add(p);
            setSize(300,400);
            setVisible(true);
            p.add(l1);
            p.add(c1);
            p.add(c2);
            c1.addItemListener(this);
            c2.addItemListener(this);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            });
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==c1)
        {
            l1.setText("Java ");
        }
        else
        {
            l1.setText("Python ");
        }
        
    }
    public static void main(String[] args) 
    {
        new awtradio();    
    }
}
