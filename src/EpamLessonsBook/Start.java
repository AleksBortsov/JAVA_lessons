package EpamLessonsBook;


public class Start {
    public static void main(String[] args) {
        System.out.println("Hello starting lessons from Epam book");
    }

    Start start = new Start(6, 6);

    public Start(int a, int b) {
        a = 5;
        b = 5;
        int c = a * b;
    }

    public double diametr;
    private double weight;

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double value) {
        if (value > 0) {
            diametr = value;
        } else {
            diametr = 0.01; // --> default value if diametr negatibe or 0
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double value) {
        weight = value;
    }
}
