// Simple calculator using AWT

import java.awt.*;
import java.awt.event.*;

public class awtcalculator extends Frame implements ActionListener {
    TextField display;
    Button[] buttons;
    String[] labels = {
        "7", "8", "9", "/", "4", "5", "6", "*",
        "1", "2", "3", "-", "0", "C", "=", "+"
    };
    String operand1 = "", operand2 = "", operator = "";
    
    public awtcalculator() 
    {
        setTitle("AWT Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());
        
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        
        buttons = new Button[16];
        for (int i = 0; i < 16; i++) 
        {
            buttons[i] = new Button(labels[i]);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }
        
        add(panel, BorderLayout.CENTER);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            if (operator.isEmpty()) {
                operand1 += command;
            } else {
                operand2 += command;
            }
            display.setText(operand1 + operator + operand2);
        } else if (command.equals("C")) {
            operand1 = operand2 = operator = "";
            display.setText("");
        } else if (command.equals("=")) {
            calculate();
        } else {
            if (!operand1.isEmpty() && operand2.isEmpty()) {
                operator = command;
                display.setText(operand1 + operator);
            }
        }
    }
    
    private void calculate() {
        if (!operand1.isEmpty() && !operand2.isEmpty()) {
            double num1 = Double.parseDouble(operand1);
            double num2 = Double.parseDouble(operand2);
            double result = 0;
            
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num2 != 0 ? num1 / num2 : 0; break;
            }
            
            display.setText(String.valueOf(result));
            operand1 = String.valueOf(result);
            operand2 = operator = "";
        }
    }
    
    public static void main(String[] args) {
        new awtcalculator();
    }
}