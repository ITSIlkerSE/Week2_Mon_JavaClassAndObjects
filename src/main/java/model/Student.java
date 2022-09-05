package model;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String university;
    private int age;

    private String studentID;

    public Student(String firstName, String lastName, String university, int age, String studentID){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.university = university;
        this.age = age;
        this.studentID = studentID;
    }


    public String getFirstName(){

        return firstName;

    }

    public String getLastName(){

        return lastName;

    }

    public String getUniversity(){

        return university;
    }

    public int getAge(){

        return age;
    }

    public String getStudentID(){
        return studentID;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;

    }

    public void setLastName (String lastName){
        this.lastName = lastName;



    }

    public void setUniversity(String university){
        this.university = university;

    }

    public void setAge(int age){

        this.age = age;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public String toString() {
        return this.firstName
                + " " + this.lastName
                + " " + this.university
                + " " + this.age
                + " " + this.studentID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        if (!Objects.equals(lastName, student.lastName)) return false;
        if (!Objects.equals(university, student.university)) return false;
        return Objects.equals(studentID, student.studentID);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (university != null ? university.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (studentID != null ? studentID.hashCode() : 0);
        return result;
    }
}
