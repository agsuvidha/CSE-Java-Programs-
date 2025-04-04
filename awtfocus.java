// AWT program for Focus Listener

import java.awt.*;
import java.awt.event.*;

public class awtfocus extends Frame implements FocusListener {
    TextField textField1, textField2;
    Label label;
    
    public awtfocus() {
        setTitle("FocusListener Demo");
        setSize(400, 200);
        setLayout(new FlowLayout());
        
        label = new Label("Click on a text field to see focus events");
        textField1 = new TextField("TextField 1", 20);
        textField2 = new TextField("TextField 2", 20);
        
        textField1.addFocusListener(this);
        textField2.addFocusListener(this);
        
        add(label);
        add(textField1);
        add(textField2);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        
        setVisible(true);
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        label.setText("Focus Gained: " + ((TextField) e.getSource()).getText());
    }
    
    @Override
    public void focusLost(FocusEvent e) {
        label.setText("Focus Lost: " + ((TextField) e.getSource()).getText());
    }
    
    public static void main(String[] args) {
        new awtfocus();
    }
}
