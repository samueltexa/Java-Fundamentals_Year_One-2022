package Assignments;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;

class MyFrame1 extends JFrame implements ActionListener {
    JButton red, green, blue, gray;

    MyFrame1() {
        super.setTitle("My-App");

        red = new JButton("Red");
        green = new JButton("Green");
        gray = new JButton("Gray");
        blue = new JButton("Blue");

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(red);
        getContentPane().add(green);
        getContentPane().add(blue);
        getContentPane().add(gray);

        red.addActionListener(this);
        green.addActionListener(this);
        gray.addActionListener(this);
        blue.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String clicked = e.getActionCommand();
        if (clicked.equals("Red")) {
            getContentPane().setBackground(Color.RED);
            repaint();
        } else if (clicked.equals("Green")) {
            getContentPane().setBackground(Color.GREEN);
            repaint();
        } else if (clicked.equals("Blue")) {
            getContentPane().setBackground(Color.BLUE);
            repaint();
        } else if (clicked.equals("Gray")) {
            getContentPane().setBackground(Color.GRAY);
            repaint();
        }
    }
}

public class Exercise_1_59 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
