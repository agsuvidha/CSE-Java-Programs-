// AWT program to implement right click menu bar

import java.awt.*;
import java.awt.event.*;

public class awt6 {
    public static void main(String[] args) 
    {
      
        Frame frame = new Frame("PopupMenu Example");
        frame.setSize(400, 400);

        PopupMenu popupMenu = new PopupMenu();

        MenuItem menuItem1 = new MenuItem("New");
        MenuItem menuItem2 = new MenuItem("Open");
        MenuItem menuItem3 = new MenuItem("Close");

        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        popupMenu.add(menuItem3);

        frame.add(popupMenu);

        frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(frame, e.getX(), e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(frame, e.getX(), e.getY());
                }
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
      
    }
}
