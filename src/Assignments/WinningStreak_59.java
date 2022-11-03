package Assignments;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.Random;
import java.awt.Color;
import java.awt.FlowLayout;

class Myxframe extends JFrame implements ActionListener {
    JButton button1, button2, button3;

    Myxframe() {
        super.setTitle("My-App");

        button1 = new JButton("click1");
        button2 = new JButton("click2");
        button3 = new JButton("click3");

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random randnum = new Random();
        int number = Math.abs(randnum.nextInt(3));
        switch (number) {
            case 1:
                getContentPane().setBackground(Color.RED);
                break;
            case 2:
                getContentPane().setBackground(Color.BLACK);
                break;
            default:
                System.exit(0);
        }
    }
}

public class WinningStreak_59 {
    public static void main(String[] args) {
        Myxframe frame = new Myxframe();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
