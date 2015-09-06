/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obseerver.headfirst.com;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Brian
 */
public class ButtonExample {

    JPanel mainPanel;
    ArrayList<JCheckBox> checkboxList;
    JFrame theFrame;
    JButton button;

    public static void main(String[] args) {
        JFrame theFrame;
        JButton button;

        theFrame = new JFrame("Angel vs Devil");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        theFrame.setSize(300, 300);

        button = new JButton("click me");
        theFrame.getContentPane().add(button);
        
        button.addActionListener((ActionListener) new AngelListner());
        button.addActionListener((ActionListener) new DevilListner());
        
        
        theFrame.setVisible(true);

    }


}
