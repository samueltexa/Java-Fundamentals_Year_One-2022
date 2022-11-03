package Assignments;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise_1_60 extends JFrame implements ActionListener{
    JLabel inLabel = new JLabel("UserName");
    JTextField inText = new JTextField(15);
    JLabel outLabel = new JLabel("Password");
    JTextField outText = new JTextField(15);
    
    //constructor
    Exercise_1_60(){
        JButton btn;
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(inLabel);
        getContentPane().add(inText);
        getContentPane().add(outLabel);
        getContentPane().add(outText);
        inText.addActionListener(this);
        btn = new JButton("Save");
        getContentPane().add(btn);
        
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = inText.getText();
        outText.addActionListener((ActionListener) inText);
        repaint();
    }
    public static void main(String[] args){
        Exercise_1_60 frame = new Exercise_1_60();
        WindowQuitter quit = new WindowQuitter();
        frame.addWindowListener(quit);
        frame.setSize(600, 500);
        frame.setVisible(true);
    } 
     private void btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(inLabel.getText().length() == 0){
             JOptionPane.showMessageDialog(null, "Enter Regno");
            inText.requestFocus();
            return;
        }
         //if(txtName.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Enter Name");
            //txtName.requestFocus();
        }
    
}
class WindowCloser extends WindowAdapter{
 @Override
 public void windowClosing( WindowEvent evt ){
   // what to do for this event   
 System.exit(0);
 }
}
