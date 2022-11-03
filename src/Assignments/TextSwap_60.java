package Assignments;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextSwap_60 extends JFrame implements ActionListener {
    JLabel inLabel = new JLabel("Enter Your Name: ");
    TextField inText = new TextField(15);
    JLabel outLabel = new JLabel("Here is Your Name :");
    TextField outText = new TextField(15);
    JButton swap;

    public TextSwap_60() // constructor
    {
        swap = new JButton("Swap");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(inLabel);
        getContentPane().add(inText);
        getContentPane().add(outLabel);
        getContentPane().add(outText);
        getContentPane().add(swap);
        swap.addActionListener(this);
        inText.addActionListener(this);

    }

    // The application code.
    void copyText() {
        String name = inText.getText();
        outText.setText(name);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == swap) {
            String holder = outText.getText();
            outText.setText(inText.getText());
            inText.setText(holder);
        }
    }

    public static void main(String[] args) {
        TextSwap_60 echo = new TextSwap_60();
        WindowQuitter wquit = new WindowQuitter();
        echo.addWindowListener(wquit);
        echo.setSize(300, 300);
        echo.setVisible(true);
    }
}

class windowQuitters extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}