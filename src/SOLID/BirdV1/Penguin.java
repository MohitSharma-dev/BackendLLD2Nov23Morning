package SOLID.BirdV1;

public class Penguin extends Bird {
    @Override
    void fly() {
        // either throw the exception or do nothing
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    void makeSound() {

    }
}
