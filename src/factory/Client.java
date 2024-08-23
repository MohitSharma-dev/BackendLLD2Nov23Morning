package factory;

import factory.components.Button.Button;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String platformName =  scanner.nextLine();
        Platform p = Platform.createPlatform(platformName);


        UIComponentFactory componentFactory = p.createUIComponentFactory();
        Button b = componentFactory.createButton();
        b.draw();
    }
}
