package EpamLessonsBook;

public class CompareCoin {

    public void compareDiametr(Coin first, Coin second) {
        double delta = first.getDiametr() - second.getDiametr();
        if (delta > 0) {
            System.out.println("Coin diametr of first more than second, " + delta);
        } else if (delta == 0) {
            System.out.println("Diametrs of Coins  are same");
        } else if (delta < 0) {
            System.out.println("Coin diametr of second more than first, " + delta);
        }
    }

    public void compareWeight(Coin first, Coin second) {
        double deltaWeight = first.getWeight() - second.getWeight();
        if (deltaWeight > 0) {
            System.out.println("Coin weight of first more than second, " + deltaWeight);
        } else if (deltaWeight == 0) {
            System.out.println("Weight of Coins are same");
        } else if (deltaWeight < 0) {
            System.out.println("Coin weight of second more than first, " + deltaWeight);
        }
    }
}

