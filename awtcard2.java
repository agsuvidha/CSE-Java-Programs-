// AWT program to demonstrate Card Layout with multiple panels

import java.awt.*;
import java.awt.event.*;

public class awtcard2 extends Frame implements ActionListener {
    CardLayout card;
    Panel cardPanel;
    
    public awtcard2() {
        setTitle("CardLayout Demo");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setVisible(true);
        
        card = new CardLayout();
        cardPanel = new Panel();
        cardPanel.setLayout(card);
        
        Panel card1 = new Panel();
        card1.add(new Label("This is Card 1"));
        
        Panel card2 = new Panel();
        card2.add(new Label("This is Card 2"));
        
        Panel card3 = new Panel();
        card3.add(new Label("This is Card 3"));
        
        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");
        cardPanel.add(card3, "Card3");
        
        Panel buttonPanel = new Panel();
        Button btnNext = new Button("Next");
        Button btnPrevious = new Button("Previous");
        
        btnNext.addActionListener(this);
        btnPrevious.addActionListener(this);
        
        buttonPanel.add(btnPrevious);
        buttonPanel.add(btnNext);
        
        add(cardPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Next")) {
            card.next(cardPanel);
        } else if (command.equals("Previous")) {
            card.previous(cardPanel);
        }
    }
    
    public static void main(String[] args) {
        new awtcard2();
    }
}
