package PrototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> students = new HashMap<>();

    void register(String key , Student student){
        students.put(key, student);
    }

    Student get(String key){
        return students.get(key).copy();
    }
}
