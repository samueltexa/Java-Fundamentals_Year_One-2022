package Games;
import java.io.*;
/**
 *
 * @author Samuel
 */
public class NameGame{
    public static void main(String[] args) throws IOException{
        String FirstName;
        String SecondName;
        String FullName;
        String Initials;
        int numLetters;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your first name:");
        FirstName = buf.readLine();
        System.out.print("Oh! "+ FirstName +", That is a nice name.");
        System.out.print("\nSo "+FirstName + ", What is your second name:");
        SecondName = buf.readLine();
        System.out.println("Nice name too."+ "\nSo your full name is:" + FirstName +" "+ SecondName + "\nright!");
//        FullName = buf.readLine();
//        buf.close();
//    
    }
}

