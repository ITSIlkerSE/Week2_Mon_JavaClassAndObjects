import model.Student;

public class Main {

    public static void main(String[] args) {



        Student myStudent = new Student("Ilker", "Yildirim", "Otto Friedrich Uni", 16, "551E6");

        Student myStudent2 = new Student("Tom", "Rosenzweig", "Uni Flensburg", 26, "561F7");

        Student myStudent3 = new Student("Manu", "Wei-Min-Kao", "Uni Bonn", 44,"663G1");


        System.out.println(myStudent);

        System.out.println(myStudent2);

        System.out.println(myStudent3);



        if(myStudent.equals(myStudent2)){
            System.out.println("Es sind die gleichen Studenten!");
        }else {
            System.out.println("Es sind nicht die gleichen Studenten !");
        }

    }



    }




