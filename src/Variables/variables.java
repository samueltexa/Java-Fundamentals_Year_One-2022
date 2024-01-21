package Variables;

public class variables{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.bark();
        dog.run();
        dog.eat();
        Cow cow = new Cow();
        cow.moo();
    }

    static class Animals {
        public void eat(){
            System.out.println("Animals walk");
            System.out.println("Animals eat food");
            System.out.println("Animals are mammals");
        }
    }
    static class Dog extends Animals{
        public void bark(){
            System.out.println("Dogs like barking");
        }
        public void run(){
            System.out.println("Dogs run faster");
        }
    }
    static class Cow extends Animals{
        public void moo(){
            System.out.println("Cow moo");
            System.out.println("Cow eat grass");
        }
    }
}
