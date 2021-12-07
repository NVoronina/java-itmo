package homework6.cars;

public class Truck extends Car{
    private int wheels;
    private int maxWeight;

    public void newWheel(int wheels) {
        this.wheels = wheels;
        System.out.println(wheels);
    }

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.newWheel(wheels);
        this.maxWeight = maxWeight;
    }
}
