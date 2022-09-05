import model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test

    public void testEquals() {


        //Given

        Student myStudent1 = new Student("Ilker", "Yildirim", "Otto Friedrich Uni", 16, "551E6");
        Student myStudent2 = new Student("Tom", "Rosenzweig", "Uni Flensburg", 26, "561F7");

        //When

        boolean resultEqualityFalse = myStudent1.equals(myStudent2);


        //Then

        assertEquals(resultEqualityFalse, false);

    }
        @Test

        public void testEquals2() {

            //Given

            Student myStudent1 = new Student("Ilker", "Yildirim", "Otto Friedrich Uni", 16, "551E6");
            Student myStudent2 = new Student("Ilker", "Yildirim", "Otto Friedrich Uni", 16, "551E6");

            //When

            boolean resultEqualityTrue = myStudent1.equals(myStudent2);


            //Then

            assertEquals(resultEqualityTrue, true);


        }


/*
        @Test

        public void studentRandomizerTest(){

            //Given



            //When

            //Then

        }

*/



    }

/*
In java both == and equals() method is used to check the equality of two variables or objects.
== is a relational operator which checks if the values of two operands are equal or not,
if yes then condition becomes true. equals() is a method available in Object class and is used to compare objects
for equality.
 */