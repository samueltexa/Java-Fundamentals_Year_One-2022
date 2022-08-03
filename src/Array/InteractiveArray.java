package Array;
import java.io.*;
public class InteractiveArray {
    public static void main(String[] args) throws IOException{
        int [] marks = new int[5];
        int sum = 0;
        double avg = 0;
        //create a buf object
        BufferedReader buf =  new BufferedReader(new InputStreamReader(System.in));
        //for loop to put elements into the array
        for(int i = 0; i < marks.length; i++){
            //prompt the user
            System.out.println("Enter an Integer Marks:");
            marks[i] = Integer.parseInt(buf.readLine());
            sum = sum + marks[i];
            avg = (double)sum / marks.length;
        }
        //for loop to output elements of the array
        for(int n = 0; n < marks.length; n++)
            System.out.print(marks[n] +" ");
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + avg);
    }
}
