package Assignments;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise_1_60 extends JFrame implements ActionListener{
    JLabel inLabel = new JLabel("Password");
    JTextField inText = new JTextField(15);
    JLabel outLabel = new JLabel("Password");
    JTextField outText = new JTextField(15);
    //constructor
    
    Exercise_1_60(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(inLabel);
        getContentPane().add(inText);
        getContentPane().add(outLabel);
        getContentPane().add(outText);
        inText.addActionListener(this);
        
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = inText.getText();
        outText.addActionListener((ActionListener) inText);
        repaint();
    }
    public static void main(String[] args){
        Exercise_1_60 frame = new Exercise_1_60();
        //WindowQuitter quit = new WindowQuitter();
        //frame.addWindowListener(quit);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }  
}
