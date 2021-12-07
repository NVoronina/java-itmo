package lesson6;

public abstract class Transport {
    private int weigth;
    private int seatPlace;
    private boolean isFly;

    public Transport(int weigth, int seatPlace, boolean isFly) {
        this.weigth = weigth;
        this.seatPlace = seatPlace;
        this.isFly = isFly;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getSeatPlace() {
        return seatPlace;
    }

    public void setSeatPlace(int seatPlace) {
        this.seatPlace = seatPlace;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    abstract void printTransportName();

    public void nonAbstract() {
        System.out.println(this.weigth);
    }
}
