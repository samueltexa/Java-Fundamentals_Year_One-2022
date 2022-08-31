package INterfaces;

public class TestInterfaces {
    public static void main(String[] args){
        Bang_aloHouse bang = new Bang_aloHouse();
        bang.open();
        bang.sprinkleWater();
        StorageHouse storage = new StorageHouse();
        storage.open();
        storage.sprinkleWater();
        HutHouse hut =  new HutHouse();
        hut.open();
    }
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
            System.out.println("Open bang-alo house.");

        }

        @Override
        public void sprinkleWater() {
            System.out.println("Sprinkle water in bang_alo bathroom.");
            System.out.println("The size of the bathroom is " + +size);

        }
    }
    class StorageHouse extends House implements Bathroom{

    @Override
    void open() {
        System.out.println("Open bang-alo house.");

        }

    @Override
    public void sprinkleWater() {
        System.out.println("Sprinkle water in bang_alo bathroom.");

        }
    }
    class HutHouse extends House{

        @Override
        void open() {
            System.out.println("Opens hut house.");
        }
    }