package Constructors;

public class TestConstructors {
    public static void main(String[] args) {
        //tiger object
        Tiger tiger = new Tiger(2, "Kidepo valley");
        System.out.println(tiger.getNoears());
        System.out.println(tiger.getGamepark());

        //car object
        Car cars = new Car("Range Rover", 1000.0);
        cars.printBrand();
        cars.printPrice();
    }
}
class Tiger{
    //instances
    int noears;
    String gamepark;
    //constructor
    public Tiger(int noears, String gamepark){
        this.noears = noears;
        this.gamepark = gamepark;
    }
    //methods
    int getNoears() {
        return this.noears;
    }

    String getGamepark() {
        return this.gamepark;
    }
}
class Car{
    //instance variables
    String brand;
    double price;

    //constructor
    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    //methods
    void printBrand(){
        System.out.println(this.brand);
    }
    void printPrice(){
        System.out.println(this.price);
    }
}
