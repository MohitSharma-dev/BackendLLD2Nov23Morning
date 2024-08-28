package Decorator;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {

        Beverage b = new Decaf();
        System.out.println(b.getDesc());
        System.out.println(b.cost());

        b = new Milk(b);

        System.out.println(b.getDesc());
        System.out.println(b.cost());

        b = new Milk(b);

        System.out.println(b.getDesc());
        System.out.println(b.cost());

        b = new Whip(b);

        System.out.println(b.getDesc());
        System.out.println(b.cost());

        List<Integer> list = new ArrayList<>();

        List<Integer> list1 = Collections.synchronizedList(list);

        InputStream inputStream = new FileInputStream("example.text");
        inputStream = new BufferedInputStream(inputStream);
        try {
            inputStream = new GZIPInputStream(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        create APIRequest obj
        // authenticateAPIRequest
        // cacheAPIRequest
        // logAPIRequest

        // Button : HTML Element
        // addBorder (Button button)
        // addCorner (Button button)
    }
}
