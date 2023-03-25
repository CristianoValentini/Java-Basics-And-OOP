package javaoop._2;

public class Student {

    String name ;
    int age ;

    Student(String name, int age) {

        System.out.println("\nConstructing!");
        this.name = name;
        this.age = age;
        System.out.println("name = " + name + " age = " + age);
        System.out.println("Constructed!\n");
    }


    public Student (String name) {
        this.name = name ;
        System.out.println("Constructing!");
        System.out.println("name = " + name);
        System.out.println("Constructed!\n");
    }

    public Student (int age) {
        this.age = age ;
        System.out.println("Constructing!");
        System.out.println("age = " + age);
        System.out.println("Constructed!\n");
    }

    public Student () {

    }

}
