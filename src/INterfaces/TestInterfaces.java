package INterfaces;

public class TestInterfaces {
    }
    abstract class House{
        abstract void open();
    }
    //create bathroom interface
    interface Bathroom{
        final double size = 10.0;
        void sprinkleWater();
    }
    class Bang_aloHouse extends House implements Bathroom{

        @Override
        void open() {
            System.out.println("Open bang-alo house");

        }

        @Override
        public void sprinkleWater() {
            System.out.println("Sprinkle water in bang_alo bathroom");

        }
    }