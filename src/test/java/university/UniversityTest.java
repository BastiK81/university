package university;

import org.junit.jupiter.api.Test;
import students.ItStudent;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {

    @Test
    void getAllStudents() throws Exception {
        University university = new University();
        ItStudent student = new ItStudent(1, "Sebastian", 40, 1, 4, true);
        university.addStudent(student);
        assertEquals("[Student{id=1, name='Sebastian', age=40, semester=1, note=4, isRepresentative=true}]", university.getAllStudents().toString());
    }

    @Test
    void getAllStudentsRepresentative() throws Exception {
        University university = new University();
        ItStudent student = new ItStudent(1, "Sebastian", 40, 1, 4, true);
        university.addStudent(student);
        assertEquals("[Student{id=1, name='Sebastian', age=40, semester=1, note=4, isRepresentative=true}]", university.getAllStudents().toString());
    }

    @Test
    void getNameOfUniversity() {
        University university = new University();
        assertEquals("Java University", university.getNameOfUniversity());
    }

    @Test
    void getStudentCount() throws Exception {
        University university = new University();
        ItStudent student = new ItStudent(1, "Sebastian", 40, 1, 4, true);
        university.addStudent(student);
        assertEquals(1, university.getStudentCount());
    }

    @Test
    void removeStudent() throws Exception {
        University university = new University();
        ItStudent student = new ItStudent(1, "Sebastian", 40, 1, 4, true);
        university.addStudent(student);
        assertEquals(1, university.getStudentCount());
        university.removeStudent(student);
        assertEquals(0, university.getStudentCount());
    }

    @Test
    void getBestStudent() throws Exception {
        University university = new University();
        ItStudent student = new ItStudent(1, "Sebastian", 40, 1, 4, true);
        university.addStudent(student);
        student = new ItStudent(2, "Basti", 40, 1, 3, true);
        university.addStudent(student);
        student = new ItStudent(3, "Fritz", 40, 1, 6, false);
        university.addStudent(student);
        assertEquals("Student{id=2, name='Basti', age=40, semester=1, note=3, isRepresentative=true}", university.getBestStudent().toString());
    }

    @Test
    void addStudent() throws Exception {
        University university = new University();
        ItStudent student = new ItStudent(1, "Sebastian", 40, 1, 4, true);
        university.addStudent(student);
        assertEquals(1, university.getStudentCount());
    }

    @Test
    void getAverageGrade() throws Exception {
        University university = new University();
        System.out.println("This ist the University :" + university.getNameOfUniversity());
        ItStudent student = new ItStudent(1, "Sebastian", 40, 1, 4, true);
        university.addStudent(student);
        student = new ItStudent(2, "Basti", 40, 1, 3, true);
        university.addStudent(student);
        student = new ItStudent(3, "Fritz", 40, 1, 6, false);
        university.addStudent(student);
        assertEquals(4.0F, university.getAverageGrade());
    }

    @Test
    void setStudentRepresentativeById() throws Exception {
        University university = new University();
        ItStudent student = new ItStudent(1, "Sebastian", 40, 1, 4, false);
        university.addStudent(student);
        assertFalse(student.isRepresentative());
        university.setStudentRepresentativeById(student.getId());
        assertTrue(student.isRepresentative());
    }
}