package Array;

public class ArrayExercise {
    public static void main(String[] args){
        //declaring integers array
        int [] marks = new int [5];
        //for loop to generate integers and put them in an array
        for(int i =0; i < marks.length; i++)
            marks[i] = i * 5;
        //for loop to output elements of the
        for(int n = 0; n < marks.length; n++)
            System.out.print(marks[n] +" ");
    }
}
