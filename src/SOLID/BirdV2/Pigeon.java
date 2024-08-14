package SOLID.BirdV2;

public class Pigeon extends Bird implements Flyable{
    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        System.out.println("We are flying Low");
    }
}
