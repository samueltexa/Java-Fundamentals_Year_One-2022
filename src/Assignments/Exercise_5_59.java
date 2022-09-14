package Assignments;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;

class MyyFrame extends JFrame implements ActionListener {
    JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, buttton9;
    int[] pass_word = new int[3];
    int count = 0;

    MyyFrame() {

        super.setTitle("Real App");

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        buttton9 = new JButton("9");

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(button0);
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);
        getContentPane().add(button4);
        getContentPane().add(button5);
        getContentPane().add(button6);
        getContentPane().add(button7);
        getContentPane().add(button8);
        getContentPane().add(buttton9);

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        buttton9.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String click = e.getActionCommand();

        if (count >= 2) {
            pass();
        }

        if (click.equals("7")) {
            pass_word[0] = 7;
            count += 1;
        } else if (click.equals("3")) {
            pass_word[1] = 3;
            count += 1;
        } else if (click.equals("5")) {
            pass_word[2] = 5;
            count += 1;
            if (count >= 2) {
                pass();
            }
        } else {
            count += 1;
        }

    }

    void pass() {
        String password = "";
        for (int i = 0; i < pass_word.length; i++) {
            password += pass_word[i];
        }
        if (password.equals("735")) {
            System.exit(0);
        } else {
            getContentPane().setBackground(Color.RED);
        }
    }
}

public class Exercise_5_59 {
    public static void main(String[] args) {
        MyyFrame frame = new MyyFrame();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

