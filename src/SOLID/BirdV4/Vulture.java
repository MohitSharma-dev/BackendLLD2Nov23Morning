package SOLID.BirdV4;

public class Vulture extends Bird implements Flyable {
    FlyingBehaviour flyingBehaviour = new FlyHighBehaviour();
    @Override
    void makeSound() {


    }

    @Override
    public void fly() {
//        System.out.println("Bird is flying high");
        flyingBehaviour.doFlying();
    }
}

// To change the flyBehaviour we have to change a lot of places