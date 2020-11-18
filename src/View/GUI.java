/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.*;
/**
 *
 * @author User
 */
public class GUI extends JFrame {
    JFrame frame;
    JTextField tf;
    public GUI() {
        frame = new JFrame("");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
        
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
    

}
