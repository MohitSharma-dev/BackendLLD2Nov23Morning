package PrototypeRegistry;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String email;
    private String batch;

    Student(String name, int age, String email, String batch){
        this.name = name;
        this.age = age;
        this.email = email;
        this.batch = batch;
    }

    Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.email = st.email;
        this.batch = st.batch;
    }

    @Override
    public Student copy() {
        Student st = new Student(this);
        return st;
    }
}
