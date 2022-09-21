package Games;
import java.io.*;
public class TipCalculator {
    public static void main(String[] args) throws IOException{
       String costResponse;
       double meal, tip, total;
       BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 
       System.out.print("How much was was the meal?");
      
       try{
           costResponse = buf.readLine();
           meal = Double.parseDouble(costResponse);
           tip = meal * 0.15;
           total = meal + tip;
           System.out.println("The meal costs $" + meal);
           System.out.println("The 15% tip is $" + tip);
           System.out.println("The total is $" + total);
           buf.close();
       }
       catch(IOException e){
           System.out.println("I/O Exception Occured.");
       }
    }
    
}



