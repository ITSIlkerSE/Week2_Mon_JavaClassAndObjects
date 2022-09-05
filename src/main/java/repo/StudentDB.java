package repo;

import model.Student;

import java.util.Arrays;

public class StudentDB {

    private Student[] students;

    @Override
    public String toString() {
        return Arrays.toString(students);
    }

    public StudentDB(Student[] students){
        super();
        this.students = students;

    }


    public Student[] getAllStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String randomStudent(Student[] students){
        String tempArr = Arrays.toString(students);
        return students[(int)(Math.random() * students.length)] + "";
    }


}
