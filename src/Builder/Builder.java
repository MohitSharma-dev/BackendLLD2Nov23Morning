//package Builder;
//
//import java.util.List;
//
//public class Builder {
//    private int id;
//    private String name;
//    private String course;
//    private String email;
//    private int gradYear;
//    private List<String> skills;
//
//    public List<String> getSkills() {
//        return skills;
//    }
//
//    public Builder setSkills(List<String> skills) {
//        this.skills = skills;
//        return this;
//    }
//
//    public Builder setId(int id) {
//        this.id = id;
//        return this;
//    }
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public Builder setCourse(String course) {
//        this.course = course;
//        return this;
//    }
//
//    public Builder setEmail(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public Builder setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    private void validate(){
//        // put all the validations here
//        if(getCourse() == null){
//            throw  new RuntimeException("Course is mandatory");
//        }
//        if(getGradYear()> 2023){
//            throw new RuntimeException("Freshers are not allowed to enroll");
//        }
//    }
//
//    public Student build(){
//        this.validate();
//        return new Student(this);
//    }
//}
