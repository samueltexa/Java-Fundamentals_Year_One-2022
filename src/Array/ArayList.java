package Array;
import java.util.ArrayList;
public class ArayList {
    public static void main(String[] args) {
        //array list
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(90);
        marks.add(76);
        marks.add(54);
        for (Integer mark : marks) System.out.println(mark);
    }
}
