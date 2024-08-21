package PrototypeRegistry;

import java.util.ArrayList;
import java.util.List;

public class Client {
    static void fillRegistry(StudentRegistry studentRegistry){
        Student Apr23Student = new Student("Temp_Name" , 25, "temp@gmail.com", "Apr23");
        studentRegistry.register("Apr23Student", Apr23Student);
        Student May23Student = new Student("Temp_Name" , 25, "temp@gmail.com", "May23");
        Student Jun23Student = new Student("Temp_Name" , 25, "temp@gmail.com", "Jun23");
        Student July23Student = new Student("Temp_Name" , 25, "temp@gmail.com", "July23");

        studentRegistry.register("May23Student", May23Student);
        studentRegistry.register("Jun23Student", Jun23Student);
        studentRegistry.register("July23Student", July23Student);

    }

    public static void main(String[] args) {
        Student st = new Student("Mohit" , 25 , "mohit@gmail.com", "Apr23");

        StudentRegistry studentRegistry = new StudentRegistry();

        fillRegistry(studentRegistry);

//        Student st1 = new Student();
//        st1.name = st.name;
//        Student st1 = new Student(st);

        Student st1 = st.copy();

        Student Apr23Student1 = studentRegistry.get("Apr23Student");
        List<Student> apr23Students = new ArrayList<Student>();

        for(int i = 0; i < 10; i++){
            apr23Students.add(studentRegistry.get("Apr23Student"));
        }

    }
}

// Registry : Data Store where I can store different type of Student objects.
// "Apr23" : obj
// "Sept23" : obj
