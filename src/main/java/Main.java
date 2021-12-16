import students.DataStudent;
import students.ItStudent;
import university.University;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;

public class Main {

    private static final String filePath  = "src/main/resources/students.csv";

    public static void dataStudent(String[] args) {
        try {
            someStuff();
            University university = new University();
            ItStudent student = new ItStudent(1, "Sebastian", 40, 1, 4, true);
            university.addStudent(student);
            student = new ItStudent(1, "Basti", 40, 1, 3, true);
            university.addStudent(student);
            student = new ItStudent(3, "Fritz", 40, 1, 6, false);
            university.addStudent(student);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        File input = new File(filePath);
        Set<DataStudent> students = new TreeSet<>();
        try {
            students = Files.lines(input.toPath())
                    .skip(1)
                    .filter(line -> !line.isEmpty())
                    .map(line -> line.split(","))
                    .map(values -> new DataStudent(Integer.parseInt(values[0]),values[1],values[2],Integer.parseInt(values[3])))
                    .collect(Collectors.toSet());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(students);
    }

    private static void someStuff() throws Exception {
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
