package Assignments;
//chapter58;
import java.awt.*;
//import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
    JButton color;

    MyFrame() {
        super.setTitle("Question_1");
        color = new JButton("COLOR");
        getContentPane().add(color);
        color.addActionListener(this);
        getContentPane().setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e){
        // To change body of generated methods, choose Tools | Templates.
        String Click;
        Click = e.getActionCommand();
        if (Click.equals("COLOR")) {
            if (getContentPane().getBackground() == Color.blue) {
                getContentPane().setBackground(Color.red);
            } else {
                getContentPane().setBackground(Color.blue);
            }
        }
    }

}

class WindowQuitter extends WindowAdapter {
    public void WindowClosing(WindowEvent e) {
        System.exit(0);
    }

}

public class ButtonDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.getContentPane().setBackground(Color.blue);
        WindowQuitter quit = new WindowQuitter();
        frame.addWindowListener(quit);
        frame.setSize(600, 600);
        frame.setVisible(true);

    }
}