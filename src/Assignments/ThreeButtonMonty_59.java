package Assignments;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.Random;
import java.awt.FlowLayout;
import java.awt.Color;

class MyrFrame extends JFrame implements ActionListener {
    JButton button1, button2, button3;

    MyrFrame() {
        super.setTitle("My Game");
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
        if (number == 0) {
            System.out.println("Winner");
            getContentPane().setBackground(Color.GREEN);
        } else {
            System.out.println(number);
            System.exit(0);
        }
    }
}

public class ThreeButtonMonty_59 {
    public static void main(String[] args) {
        MyrFrame frame = new MyrFrame();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

