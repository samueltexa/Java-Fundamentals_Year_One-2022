package Trial;

public class Trial {
    static void LinearSearch(){
    int[] array = new int[]{2,4,5,6,7,8};
    int key;
    key = array[5];
    
    for(int i =0; i < array.length;i ++){
        if(array[i] == key)
                System.out.println("Element found.");
        
    else
        System.out.println("Element not found");
    }
    
    }   
    
    public static void main(String[] args){
        LinearSearch();
    } 
}
