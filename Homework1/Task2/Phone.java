package Homework1.Task2;

public class Phone {
    public int number;
    public String model;
    public double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String userName) {
        System.out.println(userName + " is calling");
    }

    public int getNumber() {
        return number;
    }
}
