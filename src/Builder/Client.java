package Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
//        Student s = new Student(... all the attributes);

//        Builder builder = new Builder();
        Student student = Student
                .getBuilder()
                .setGradYear(2025)
//                .setCourse("Academy")
                .setEmail("mohit.sharma@gmail.com")
                .setId(1)
                .setName("Mohit sharma")
                .setSkills(new ArrayList<>())
                .build();

//        Student s2 = new Student(new B);
//        Student s2 = new Student();

//        Stream<Integer> s1 =  List.of(1 , 2 ,3 , 5).stream();
//        s1.filter().map().findFirst();
    }
}

// validations
// setter of the builder itself
// constructor of Student class