package Constructors;

public class MyConstructors {
    //instance variable
    static double bonus;
    static double total_points;
    //constructor for girls
    public MyConstructors(double bonus) {
        MyConstructors.bonus = bonus;
    }
    //constructor for boys
    public MyConstructors() {
        MyConstructors.bonus = 0.0;
    }
    double score(double marks) {
        return(bonus + marks);
    }
    public static void main(String[] args) {
        MyConstructors girls = new MyConstructors(1.5);
        total_points = girls.score(24.0);
        System.out.println(total_points);
        MyConstructors boys = new MyConstructors();
        total_points = boys.score(24.0);
        System.out.println(total_points);
    }
}
