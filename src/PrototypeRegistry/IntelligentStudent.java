package PrototypeRegistry;

public class IntelligentStudent extends Student {
    private int iq;

    IntelligentStudent(IntelligentStudent IS){
        super(IS);
        this.iq = IS.iq;
    }

    @Override
    public IntelligentStudent copy() {
       IntelligentStudent student = new IntelligentStudent(this);
       return student;
    }
}
