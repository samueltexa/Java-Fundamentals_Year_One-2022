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

    @Override
    public void actionPerformed(ActionEvent e) {
        String clicked = e.getActionCommand();
        switch (clicked) {
            case "Red":
                getContentPane().setBackground(Color.RED);
                repaint();
                break;
            case "Green":
                getContentPane().setBackground(Color.GREEN);
                repaint();
                break;
            case "Blue":
                getContentPane().setBackground(Color.BLUE);
                repaint();
                break;
            case "Gray":
                getContentPane().setBackground(Color.GRAY);
                repaint();
                break;
            default:
                break;
        }
    }
}

public class FourButton_59 {
    public static void main(String[] args) {
        MyFrame1 frame = new MyFrame1();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
