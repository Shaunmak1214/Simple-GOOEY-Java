import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class GUI implements ActionListener{

    private int count  = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton button;

    //default constructor
    public GUI() {

        //Frame Object
        frame = new JFrame();

        //Button Object
        button = new JButton("Click Me");
        button.addActionListener(this);

        //Label Object
        label = new JLabel("Number of clicks: 0");

        //Panel Object
        panel = new JPanel();

        //Panel Setup
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        //Frame Setup
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String [] args) {

        new GUI();

    }

    //Overiding
    public void actionPerformed(ActionEvent e) {

        count++;
        label.setText("Number of clicks: " + count);

    }

}