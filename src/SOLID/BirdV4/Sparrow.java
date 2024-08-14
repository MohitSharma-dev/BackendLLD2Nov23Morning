package SOLID.BirdV4;

public class Sparrow extends Bird implements Flyable {
    FlyingBehaviour flyingBehaviour;

    Sparrow(FlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
//        System.out.println("We are flying Low");
        flyingBehaviour.doFlying();
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }
}
