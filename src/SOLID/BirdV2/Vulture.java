package SOLID.BirdV2;

public class Vulture extends Bird implements Flyable{
    @Override
    void makeSound() {


    }

    @Override
    public void fly() {
        System.out.println("Bird is flying high");
    }
}
