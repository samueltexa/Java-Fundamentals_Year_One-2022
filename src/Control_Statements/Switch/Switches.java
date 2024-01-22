package Control_Statements.Switch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switches{
    static int count = 3;
    public static void main(String[] args) throws IOException {
        int day;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        while (count<=5){
        System.out.print("Enter the day number: ");
        day = Integer.parseInt(buf.readLine());
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}}
