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

    }
}
class Animal{
    public void eat(){
        System.out.println("Animal eat");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog bark");
    }
}
class Cow extends Animal {
    void moo(){
        System.out.println("Cow moo");
    }
}