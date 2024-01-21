package Games;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// or import java.io.*;

public class Interactive {
    public static void main(String[] args) throws IOException{
        String name;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader buf = new BufferedReader(in);
        try{
            System.out.print("What is your name: ");
            name =  buf.readLine();
            System.out.print("Your name is: "+name);
        }catch (IOException ex){
            System.out.println("An error has occurred");
        }

    }
}
