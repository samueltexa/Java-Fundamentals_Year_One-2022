package Data_Structures;

public class Array_Minimum{
    public static void main(String[] args){

//        System.out.println(n);
    }
    //declaring the array
    int[] array = {5 ,3, 8, 2, 1, 9, 4};
    int i;
    // function pass in the array and its size
    int min(int[] array, int n){
        int min = array[0];
        //for i == 1 to n == 7
        for(i = 1; i < n; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
