package students;

public class ItStudent extends Student{

    public ItStudent(int id, String name, int age, int semester, int note, boolean isRepresentative) {
        super(id, name, age, semester, note, isRepresentative);
    }

    public String getCourse(){
        return "IT Security";
    }
}
