/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Samuel
 */
class reptiles{
    public void eat(){
        System.out.println("Reptiles eat");
        System.out.println("reptiles are cold-blooded");
    }

}
class Frog extends reptiles{
    public void jump(){
        System.out.println("Frog jumps");
    
    }

}
class fish extends reptiles{
    public void swims(){
        System.out.println("Fish swims");
    }
}
class chameleon extends reptiles{
    public void changes_colour(){
        System.out.println("Chameleon changes colour");
    }

}

public class Amimalia {
    public static void main(String[] args){
        reptiles rep = new reptiles();
        rep.eat();
        Frog frog = new Frog();
        frog.jump();
        chameleon cham = new chameleon();
        cham.changes_colour();
        fish Fish = new fish();
        Fish.swims();
    }
    
}
