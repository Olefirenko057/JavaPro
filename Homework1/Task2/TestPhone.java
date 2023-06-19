package Homework1.Task2;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone(72055, "Samsung", 2);
        System.out.println(phone1.number);
        System.out.println(phone1.model);
        System.out.println(phone1.weight);

        System.out.println();

        Phone phone2 = new Phone(65800, "Iphone", 2.5);
        System.out.println(phone2.number);
        System.out.println(phone2.model);
        System.out.println(phone2.weight);

        System.out.println();

        Phone phone3 = new Phone(94888, "Huawei", 1.7);
        System.out.println(phone3.number);
        System.out.println(phone3.model);
        System.out.println(phone3.weight);

        System.out.println();

        phone1.receiveCall("David");
        phone2.receiveCall("Steve");
        phone3.receiveCall("Andre");

        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());


    }
}
