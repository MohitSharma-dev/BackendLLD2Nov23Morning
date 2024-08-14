package SOLID.BirdV3;

public abstract class Bird {
    private String color;
    private String name;
    private int noOfWings;
    private String type;

    void eat(){
        System.out.println("The Bird is eating");
    }

//    abstract void fly();
    abstract void makeSound();
}
