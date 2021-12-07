package university;

import students.Student;

import java.util.*;

public class University {

    private final String nameOfUniversity = "Java University";

    private Map<Integer, Student> allStudents = new HashMap<>();

    public List<Student> getAllStudents() {
        return this.allStudents.values().stream().toList();
    }

    public List<Student> getAllStudentsRepresentative() {
        return this.allStudents.values().stream().filter(Student::isRepresentative).toList();
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public int getStudentCount() {
        return allStudents.size();
    }

    public void removeStudent(Student student) {
        this.allStudents.remove(student.getId(), student);
    }

    public Student getBestStudent() {
        List<Student> sortedList = this.allStudents.values().stream().sorted(Comparator.comparing(Student::getNote)).toList();
        return sortedList.get(0);
    }

    public void addStudent(Student student) {
        this.allStudents.put(student.getId(), student);
    }

    public Float getAverageGrade() {
        int summ = 0;
        for (Student student : this.allStudents.values()
        ) {
            summ += student.getNote();
        }
        return (float) (summ / this.allStudents.size());
    }

    public void setStudentRepresentativeById(int id) {
        Student student = this.allStudents.get(id);
        student.setRepresentative(true);
    }

}
