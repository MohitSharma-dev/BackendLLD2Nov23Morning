package SOLID.BirdV3;

public class Sparrow extends Bird implements Flyable {
    FlyLowBehaviour flyLowBehaviour = new FlyLowBehaviour();
    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
//        System.out.println("We are flying Low");
        flyLowBehaviour.flyLow();
    }
}
