package Array;
import java.util.ArrayList;
public class ArayList {
    public static void main(String[] args) {
        //array list
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(90);
        marks.add(76);
        marks.add(54);
        for (int i = 0; i < marks.size(); i++)
            System.out.println(marks.get(i) + " ");
    }
}
