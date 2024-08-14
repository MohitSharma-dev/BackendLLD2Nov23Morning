package SOLID.BirdV4;

public class Client {
    public static void main(String[] args) {
        FlyingBehaviour flyingBehaviour = new FlyLowBehaviour();
        Sparrow sparrow = new Sparrow(flyingBehaviour);

        sparrow.setFlyingBehaviour(new FlyHighBehaviour());
    }
}
