package Games;


import java.io.*;

public class Interactive {
    public static void main(String[] args) throws IOException{
    String name;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    try{
        System.out.print("What is your name:");
        name =  buf.readLine();
        System.out.println("Hello " + name+"," + " How are you doing?");
    
    }
    catch(IOException ioe){
        System.out.println("I/O Exception occured.");
    
    }
    }
    
}
