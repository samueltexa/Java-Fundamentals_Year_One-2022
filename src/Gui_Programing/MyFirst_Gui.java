package Gui_Programing;
import javax.swing.*;
import java.awt.*;
//program to paint my current sreen

class gui extends JFrame{
    //paint is called automaticall by the system
    //to display customizations to the screen
    @Override
    public void paint(Graphics g){
        //draw a string at location x = 10, y = 50
        g.drawString("A gui object",10,50);
    
    }
}
public class MyFirst_Gui{
    public static void main(String[] args){
        gui frame = new gui();
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}
