package Assignments;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;

class MyjFrame extends JFrame implements ActionListener {
    JButton button;

    MyjFrame() {
        super.setTitle("My Colors");

        button = new JButton("COLOR");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(button);
        getContentPane().setBackground(Color.RED);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            Color background = getContentPane().getBackground();
            if (background.equals(Color.RED)) {
                getContentPane().setBackground(Color.GREEN);
            } else if (background.equals(Color.GREEN)) {
                getContentPane().setBackground(Color.BLUE);
            } else if (background.equals(Color.BLUE)) {
                getContentPane().setBackground(Color.GRAY);
            } else if (background.equals(Color.GRAY)) {
                getContentPane().setBackground(Color.RED);
            } else {
                getContentPane().setBackground(Color.RED);
            }

        }
    }

}

public class Exercise_2_59 {
    public static void main(String[] args) {
        MyjFrame frame = new MyjFrame();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

