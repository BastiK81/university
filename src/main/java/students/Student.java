package students;

public abstract class Student{

    private int id;
    private String name;
    private int age;
    private int semester;
    private int note;
    private boolean isRepresentative;

    public Student(int id, String name, int age, int semester, int note, boolean isRepresentative) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.note = note;
        this.isRepresentative = isRepresentative;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", semester=" + semester +
                ", note=" + note +
                ", isRepresentative=" + isRepresentative +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setRepresentative(boolean representative) {
        isRepresentative = representative;
    }

    public int getNote() {
        return note;
    }

    public boolean isRepresentative() {
        return isRepresentative;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSemester() {
        return semester;
    }


}
