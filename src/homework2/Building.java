package homework2;

public class Building {
    private int stages;
    private String color;
    private int flatsNumber;
    private float height;
    private float width;
    private float depth;

    public Building() {}

    public Building(int stages, int flatsNumber) {
        this.stages = stages;
        this.flatsNumber = flatsNumber;
    }

    public Building(int stages, String color, int flatsNumber, float height, float width, float depth) {
        this.stages = stages;
        this.color = color;
        this.flatsNumber = flatsNumber;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getStages() {
        return stages;
    }

    public int getFlatsNumber() {
        return flatsNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }
}
