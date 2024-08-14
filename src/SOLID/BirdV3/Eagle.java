package SOLID.BirdV3;

public class Eagle extends Bird implements Flyable {
    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        System.out.println("Bird is flying high");
    }
}
