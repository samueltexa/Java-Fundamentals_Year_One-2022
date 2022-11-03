/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Programing;
import javax.swing.*;

/**
 *
 * @author Samuel
 */
public class Button_Gui extends JFrame {
    //reference to the button
    JButton btn;
    Button_Gui(){
        btn = new JButton("SAVE");
        getContentPane().add(btn);
    
    }
    
     public static void main(String[] args){
        //JFrame frame = new JFrame("SAMUEL FRAME");
        Button_Gui gui = new Button_Gui();
        gui.setSize(600,600);
        gui.setVisible(true);
    }
    
}
