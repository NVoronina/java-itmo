package lesson6;

import lesson2.Car;

public class Main {
    public static void main(String[] args) {
//        Child child = new Child();
//        Parent parent = new Parent();
//
//        Parent parent2 = new Child();
//        Parent parent3 = new AnotherChild();
//        parent.print();
//        parent3.print();
        Transport helicopter = new Helicopter(3, 4, true);
        Transport bus = new Bus(20, 20, false);
        bus.printTransportName();
    }
}
