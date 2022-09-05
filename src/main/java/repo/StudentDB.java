package repo;

import model.Student;

public class StudentDB {


    private Student[] students;


    public StudentDB(Student[] students){
        super();
        this.students = students;

    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}