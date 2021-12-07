import students.ItStudent;
import university.University;

public class Main {

    public static void main(String[] args) {
        University university = new University();
        System.out.println("This ist the University :" + university.getNameOfUniversity());
        ItStudent student = new ItStudent(1, "Sebastian", 40, 1, 4, true);
        university.addStudent(student);
        student = new ItStudent(2, "Basti", 40, 1, 3, true);
        university.addStudent(student);
        student = new ItStudent(3, "Fritz", 40, 1, 6, false);
        university.addStudent(student);
        System.out.println(university.getAllStudents());
        System.out.println(university.getBestStudent());
        System.out.println(university.getAllStudentsRepresentative());
        System.out.println(university.getAverageGrade());
    }
}
