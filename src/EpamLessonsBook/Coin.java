package EpamLessonsBook;


public class Coin {

    private double diametr;
    private double weight;

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double valueDiametr) {
        if (valueDiametr > 0) {
            diametr = valueDiametr;
        } else {
            System.out.println("Value og Diametr is negatitive, PLS using positive diametr");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double valueWeight) {
        if (valueWeight > 0) {
            weight = valueWeight;
        } else {
            System.out.println("Value of Weigth is negatitive, PLS using positive weight");
        }
    }
}