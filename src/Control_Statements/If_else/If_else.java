package Control_Statements.If_else;
class If{
   int math = 90;
    int english = 80;
    int science = 70;
    int total = math + english + science;
    int average = total/3;
    public void ifElse(){
        if (average >= 90){
            System.out.println("Grade: A");
        }
        else if (average >= 80){
            System.out.println("Grade: B");
        }
        else if (average >= 70){
            System.out.println("Grade: C");
        }
        else if (average >= 60){
            System.out.println("Grade: D");
        }
        else if (average >= 50){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}