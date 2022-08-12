package Inheritance;

public class InheritanceTest {
    public static void main(String[] args){
        //create object of child classes to see inheritance
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Cow cow = new Cow();
        cow.moo();
        cow.eat();
        WildDog wilddog = new WildDog();
        wilddog.huntInParks();

    }
}
class Animal{
    public void eat(){
        System.out.println("Animal eat");
    }
}
class Dog extends Animal {
    public void bark(){
        System.out.println("Dog bark");
    }
    public void eat(){
        System.out.println("Dog eat");
    }
}
class Cow extends Animal {
    void moo(){
        System.out.println("Cow moo");
    }
}
class WildDog extends Dog{
    void huntInParks(){
        System.out.print("Wild dogs hunt in parks");
    }

}