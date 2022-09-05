public class Main {

    public static void main(String[] args) {

        Student myStudent = new Student();

        myStudent.setFirstName("Ilker");
        myStudent.setLastName("Yildirim");
        myStudent.setUniversity("Otto Friedrich Universität");


        System.out.println(myStudent.getFirstName());
        System.out.println(myStudent.getLastName());
        System.out.println(myStudent.getUniversity());

    }

}
