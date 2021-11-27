package homework2;

public class Main {
    public static void main(String[] args) {
        Calculations calculator = new Calculations();

        System.out.println(calculator.sum(3.2, 2.32));
        System.out.println(calculator.sum(2342342134123e123, 23234523));

        System.out.println(calculator.division(3, 2));
        System.out.println(calculator.division(3.2, 2.32));
        System.out.println(calculator.division(2342342134123e123, 23234523));

        System.out.println(calculator.increase(3, 2));
        System.out.println(calculator.increase(3.2, 2.32));
        System.out.println(calculator.increase(2342342134123e123, 23234523));

        System.out.println(calculator.subtraction(3, 2));
        System.out.println(calculator.subtraction(3.2, 2.32));
        System.out.println(calculator.subtraction(2342342134123e123, 23234523));

        Building building = new Building();
        building.setColor("White");
        System.out.println(building.getColor());
        System.out.println(building.getDepth());

        Building buildingSecond = new Building(2, 50);
        building.setColor("Black");

        Building buildingThird = new Building(2, "blue", 23, 33.0f, 44.8f, 55.4f);

    }
}
