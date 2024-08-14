package SOLID.BirdV4;

public class Pigeon extends Bird implements Flyable {
    FlyingBehaviour flyingBehaviour = new FlyLowBehaviour();
    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
//        System.out.println("We are flying Low");
        flyingBehaviour.doFlying();
    }
}
