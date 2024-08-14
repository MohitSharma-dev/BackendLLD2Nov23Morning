package SOLID.BirdV3;

public class Vulture extends Bird implements Flyable {
    FlyHighBehaviour flyHighBehaviour = new FlyHighBehaviour();
    @Override
    void makeSound() {


    }

    @Override
    public void fly() {
//        System.out.println("Bird is flying high");
        flyHighBehaviour.flyHigh();
    }
}

// To change the flyBehaviour we have to change a lot of places