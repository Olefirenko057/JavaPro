package Homework1.Task1;

public class Person {
    private String fullName;
    private int age;

    public void move() {
        System.out.println(fullName + " is going");
    }
    public void talk() {
        System.out.println(fullName + " is talking");
    }

    public Person() {
        System.out.println("Person with no data");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
