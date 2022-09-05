import model.Student;

public class Main {

    public static void main(String[] args) {

        Student myStudent = new Student();
        Student myStudent2 = new Student();
        Student myStudent3 = new Student();



        myStudent.setFirstName("Ilker");
        myStudent.setLastName("Yildirim");
        myStudent.setUniversity("Otto Friedrich Universität");


        System.out.println(myStudent.getFirstName());
        System.out.println(myStudent.getLastName());
        System.out.println(myStudent.getUniversity());

        myStudent2.setFirstName("Tom");
        myStudent2.setLastName("Rosenzweig");
        myStudent2.setUniversity("Universität in Flensburg");


        System.out.println(myStudent2.getFirstName());
        System.out.println(myStudent2.getLastName());
        System.out.println(myStudent2.getUniversity());

        myStudent3.setFirstName("Manu");
        myStudent3.setLastName("Wei-Min-Kao");
        myStudent3.setUniversity("Universität in Bonn");


        System.out.println(myStudent3.getFirstName());
        System.out.println(myStudent3.getLastName());
        System.out.println(myStudent3.getUniversity());

    }

}
