package Assignments;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EchoBoth_60 extends JFrame implements ActionListener {
    JLabel inLabel = new JLabel("Enter Your Name: ");
    TextField inText = new TextField(15);
    JLabel outLabel = new JLabel("Here is Your Name :");
    TextField outText = new TextField(15);

    public EchoBoth_60() // constructor
    {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(inLabel);
        getContentPane().add(inText);
        getContentPane().add(outLabel);
        getContentPane().add(outText);
        inText.addActionListener(this);
        outText.addActionListener(this);
    }

    // The application code.
    void copyText() {
        String name = inText.getText();
        outText.setText(name);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        String actionString = evt.getActionCommand();
        if (inText.getText().equals(actionString)) {
            copyText();
            repaint();
        } else if (outText.getText().equals(actionString)) {
            String name = outText.getText();
            inText.setText(name);
        }
    }

    public static void main(String[] args) {
        EchoBoth_60 echo = new EchoBoth_60();
        WindowQuitter wquit = new WindowQuitter();
        echo.addWindowListener(wquit);
        echo.setSize(300, 100);
        echo.setVisible(true);
    }
}

class WiindowQuitter extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}