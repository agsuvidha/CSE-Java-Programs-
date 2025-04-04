//AWT program to create a notepad

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class awtnotepad extends Frame implements ActionListener {
    TextArea textArea;
    MenuBar menuBar;
    Menu fileMenu;
    MenuItem newFile, openFile, saveFile, exit;
    
    public awtnotepad() {
        setTitle("AWT Notepad");
        setSize(600, 400);
        setLayout(new BorderLayout());
        
        textArea = new TextArea();
        add(textArea, BorderLayout.CENTER);
        
        menuBar = new MenuBar();
        fileMenu = new Menu("File");
        
        newFile = new MenuItem("New");
        openFile = new MenuItem("Open");
        saveFile = new MenuItem("Save");
        exit = new MenuItem("Exit");
        
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        exit.addActionListener(this);
        
        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(exit);
        
        menuBar.add(fileMenu);
        setMenuBar(menuBar);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == newFile) {
            textArea.setText("");
        } else if (e.getSource() == openFile) {
            openFile();
        } else if (e.getSource() == saveFile) {
            saveFile();
        } else if (e.getSource() == exit) {
            dispose();
        }
    }
    
    private void openFile() {
        FileDialog fileDialog = new FileDialog(this, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);
        String directory = fileDialog.getDirectory();
        String filename = fileDialog.getFile();
        if (filename != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(directory + filename))) {
                textArea.setText("");
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void saveFile() {
        FileDialog fileDialog = new FileDialog(this, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);
        String directory = fileDialog.getDirectory();
        String filename = fileDialog.getFile();
        if (filename != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(directory + filename))) {
                writer.write(textArea.getText());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        new awtnotepad();
    }
}
