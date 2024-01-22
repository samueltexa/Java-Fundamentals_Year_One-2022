package Trial;
import java.io.*;
public class Trial{
    static int key;
    static int count = 3;
    static boolean found= false;
    static int[] array = new int[]{1,2,3,4};
    public static void linearSearch() throws IOException{
        BufferedReader buf  = new BufferedReader(new InputStreamReader(System.in));
        while (count<=30){
            System.out.print("Enter the key you want to search for: ");
            key = Integer.parseInt(buf.readLine());
        for (int j : array) {
            if (key == j) {
                System.out.println("Key " +key+ " Found");
                found = true;
            }
        }
        if (!found)
         System.out.println("Key "+key+" Not found");
        }
    }
    public static void main(String[] args) throws IOException {
        linearSearch();
    }
}
