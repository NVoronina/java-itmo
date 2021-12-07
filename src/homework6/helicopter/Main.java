package homework6.helicopter;

public class Main {
    public static void main(String[] args) {
        Wing wing = new Wing();
        wing.setWeight(40);
        new Helicopter(wing).getWing().showWeight();
    }
}
