package Gui_Programing;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 
 
class myFrame extends JFrame
{
     @Override
 public void paint( Graphics g ){
 g.drawString("Click the close button", 10, 50 ); 
 }
} 
class WindowQuitter extends WindowAdapter{
 @Override
 public void windowClosing( WindowEvent e ){
   // what to do for this event   
 System.exit( 0 );
 }
}
 
public class GUItester{
 public static void main ( String[] args ){
 // construct a myFrame object    
 myFrame frm = new myFrame(); 
 // construct a listener for the frame
 WindowQuitter wquit = new WindowQuitter();
  // register the listener 
 frm.addWindowListener( wquit );
 frm.setSize( 600, 600 ); 
 frm.setVisible( true ); 
 
 } 
}