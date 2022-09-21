package Trial;
import javax.swing.*;
public class HelloWorld extends JFrame {
    JButton btn;
    HelloWorld(){
        btn = new JButton("Exit");
        getContentPane().add(btn);
    
    }
    public static void main(String[] args) {
        System.out.println("Welcome! to the World");
        HelloWorld hello = new HelloWorld();
        hello.setSize(600,600);
        hello.setVisible(true);
    }
}
