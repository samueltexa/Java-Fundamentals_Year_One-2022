package Games;
import java.io.*;
/**
 *
 * @author Samuel
 */
public class MathGame {
    public static void main(String[] args) throws IOException {
    int num1, num2, sum;
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    try{
        System.out.print("Enter First number:");
        num1 = Integer.parseInt(buf.readLine());
        System.out.print("Enter Second number:");
        num2 = Integer.parseInt(buf.readLine());
        System.out.println("Sum is " + num1*num2);
        buf.close();

    }
    catch(IOException e){
    System.out.println("An I/O Exception error occured.");
//    num1 = num2 = 1;
    }
//    catch(NumberFormatException nfe){
//    System.out.println("An I/O Exception error occured.");
//    num1 = num2 = 1;
//    }
    
    }
}

