package EpamLessonsBook;

public class CoinMain {
    public static void main(String[] args) {
        Coin first = new Coin();
        first.setDiametr(5);
        first.setWeight(-15.0);

        Coin second = new Coin();
        second.setDiametr(-50);
        second.setWeight(10);

        CompareCoin compareCoin = new CompareCoin();
        compareCoin.compareDiametr(first, second);
        compareCoin.compareWeight(first, second);
    }
}
