package SOLID.BirdV0;

public class Bird {
    private String color;
    private String name;
    private int noOfWings;
    private String type;

    void makeSound(){

    }

    void fly(){
        if(type.equals("Pigeon")){
            System.out.println("Pigeon is flying");
        } else if (type.equals("Sparrow")){
            System.out.println("Sparrow is flying");
        }
    }

    void eat(){

    }
}
