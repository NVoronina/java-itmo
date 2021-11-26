package lesson2;

public class Car {
    private String model;
    private String brand;
    private float carPrice;
    private double insurancePrice;
    private int seatPlace;

    public Car(String model, String brand, float carPrice) {
        this.model = model;
        this.brand = brand;
        this.carPrice = carPrice;
    }

    public Car(double insurancePrice, int seatPlace) {
        this.insurancePrice = insurancePrice;
        this.seatPlace = seatPlace;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public float getCarPrice() {
        return carPrice;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public int getSeatPlace() {
        return seatPlace;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", carPrice=" + carPrice +
                ", insurancePrice=" + insurancePrice +
                ", seatPlace=" + seatPlace +
                '}';
    }
}
