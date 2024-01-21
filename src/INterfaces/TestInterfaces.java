package INterfaces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TestInterfaces {
    static String name1;
    static String name2;
    static InputStreamReader in = new InputStreamReader(System.in);
    static BufferedReader buf = new BufferedReader(in);
//    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
public static void main(String[] args) throws IOException {
    System.out.print("Enter your first name: ");
    name1 = buf.readLine();
    System.out.print("Your first name is: "+name1);
    System.out.print("\nEnter your second name: ");
    name2 = buf.readLine();
    System.out.print("Your second name is: "+name2);
    System.out.println("\nYour full name is: "+name1+" "+name2);
}
    }