package homework6.helicopter2;


public class Helicopter {
    private Wing wing;

    class Wing {
        private int weight;

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void showWeight() {
            System.out.println(this.weight);
        }
    }

    public Helicopter(int weigth) {
        this.wing = new Wing();
        this.wing.setWeight(weigth);
    }

    public Wing getWing() {
        return wing;
    }
}
