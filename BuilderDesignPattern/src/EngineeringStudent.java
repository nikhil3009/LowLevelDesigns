import java.util.*;

public class EngineeringStudent extends StudentBuilder{
    List<String> subject = new ArrayList<>();
    public StudentBuilder setSubjects(){
        List<String> subject = new ArrayList<>();
        subject.add("DSA");
        subject.add("OS");
        subject.add("Networks");
        subject.add("COD");
        this.subjects = subject;
        return this;
    }
}
