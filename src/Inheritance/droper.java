package Inheritance;

public class droper {
    class Animal {
        public void eat() {
            System.out.println("Animal eat");
        }
    }

    class Dog extends Inheritance.Animal {
        public void bark() {
            System.out.println("Dog bark");
        }

        public void eat() {
            System.out.println("Dog eat");
        }
    }

    class Cow extends Inheritance.Animal {
        public void moo() {
            System.out.println("Cow moo");
        }
    }

    class WildDog extends Inheritance.Dog {
        public void huntInParks() {
            System.out.print("Wild dogs hunt in parks");
        }

    }

    public static void main(String[] args) {
        //create object of child classes to see inheritance
        Inheritance.Dog dog = new Inheritance.Dog();
        dog.bark();
        dog.eat();
        Inheritance.Cow cow = new Inheritance.Cow();
        cow.moo();
        cow.eat();
        Inheritance.WildDog wilddog = new Inheritance.WildDog();
        wilddog.huntInParks();

    }
}