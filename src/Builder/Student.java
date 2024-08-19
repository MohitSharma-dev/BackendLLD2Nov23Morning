package Builder;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String course;
    private String email;
    private int gradYear;
    private List<String> skills;
//
//    Student(int id, String name, String course, String email, int gradYear) {
//        this.id = id;
//        this.name = name;
//        this.course = course;
//        this.email = email;
//        this.gradYear = gradYear;
//    }

    private Student(Builder builder){
        this.id = builder.getId();
        this.name = builder.getName();
        this.course = builder.getCourse();
        this.email = builder.getEmail();
        this.gradYear = builder.getGradYear();
        this.skills = new ArrayList<>(builder.getSkills());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public  static class Builder {
        private int id;
        private String name;
        private String course;
        private String email;
        private int gradYear;
        private List<String> skills;

        public List<String> getSkills() {
            return skills;
        }

        public Builder setSkills(List<String> skills) {
            this.skills = skills;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCourse() {
            return course;
        }

        public String getEmail() {
            return email;
        }

        public int getGradYear() {
            return gradYear;
        }

        private void validate(){
            // put all the validations here
            if(getCourse() == null){
                throw  new RuntimeException("Course is mandatory");
            }
            if(getGradYear()> 2023){
                throw new RuntimeException("Freshers are not allowed to enroll");
            }
        }

        public Student build(){
            this.validate();
            return new Student(this);
        }
    }

}
