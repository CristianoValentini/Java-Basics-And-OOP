package javaoop._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student = new Student("Marco", "Casagrande", 24, "Develhope", "Java");

        System.out.println("Nome: " + student.getName() + "  Cognome: " + student.getSurname() + "  Età: " +
                student.getAge() + "  Corso: " + student.getCourse() + "  tipo di corso: " + student.getTypeOfCourse());

        student.setName("Gianluca");
        student.setSurname("Valentini");
        student.setAge(25);
        student.setCourse("Develhope");
        student.setTypeOfCourse("FullStack");

        System.out.println("Nome: " + student.getName() + "  Cognome: " + student.getSurname() + "  Età: " +
                student.getAge() + "  Corso: " + student.getCourse() + "  tipo di corso: " + student.getTypeOfCourse());

    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here

        Student student = new Student();
        student.getName();
        student.getName();
        student.getName();
        System.out.println("getName è stato richiamato " + student.nameCounter + " volte");

        student.setName("Paolo");
        student.setSurname("Verdi");
        student.setAge(31);
        student.setCourse("Develhope");
        student.setTypeOfCourse("Data");

        student.setAge(17);


    }

}
