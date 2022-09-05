package model;

public class Student {

    private String firstName;
    private String lastName;
    private String university;
    private int age;

   public Student(String firstName, String lastName, String university, int age){
       super();
       this.firstName = firstName;
       this.lastName = lastName;
       this.university = university;
       this.age = age;
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

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.university + " " + this.age;
    }


    }
