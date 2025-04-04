// AWT Menubar program with sub menu

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.event.*;
import java.awt.*;
public class awt7 
{
    public static void main(String[] args) 
    {
        Frame f=new Frame("My frame");
        f.setSize(400,400);
        f.setVisible(true);
        
        MenuBar mb=new MenuBar();
        Menu pm=new Menu("My Menu");
        MenuItem m1=new MenuItem("Click 1");
        MenuItem m2=new MenuItem("Click 2");

        Menu m22=new Menu("Save");
        MenuItem m221=new MenuItem("PDF");
        MenuItem m222=new MenuItem("DOC");

        Choice c=new Choice();
        c.add("Male");
        c.add("Female");
        c.setBounds(50,100,50,100);
 
        m22.add(m221);
        m22.add(m222);

        f.setMenuBar(mb);
        mb.add(pm);
        pm.add(m1);
        pm.addSeparator();
        pm.add(m2);
        pm.add(m22);
        //f.add(pm);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }    
}
