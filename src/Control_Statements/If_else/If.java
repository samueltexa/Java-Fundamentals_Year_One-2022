package Control_Statements.If_else;
class If_else{
    // declaring the variables
    int passmark;
    int math;
    int science;
    int english;
    // creating a constructor
    If_else(){
        // initializing the variables
       passmark = 60;
       math = 50;
       science = 60;
       english = 50;
    }
    // creating a method to grade the marks
    public static void grade(){
        If_else obj = new If_else();
        System.out.println("Pass mark is "+obj.passmark+"%");
        if (obj.math>=obj.passmark){
            System.out.println("You have passed in Math");
        }
        else{
            System.out.println("You have failed in Math with "+obj.math+"%");
        }
        if (obj.science>=obj.passmark){
            System.out.println("You have passed in Science with "+obj.science+"%");
        }
        else{
            System.out.println("You have failed in Science with "+obj.science+"%");
        }
        if(obj.english>=obj.passmark){
            System.out.println("You have passed in English with "+obj.english+"%");
        }
        else{
            System.out.println("You have failed in English with "+obj.english+"%");
        }
    }
    // main method
    public static void main(String[] args) {
        grade();
    }
}