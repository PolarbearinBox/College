public class Main {
    public static void main(String[] args) {
        Crops wheat = new Crops();
        Crops corn  = new Crops();
        Crops carrot = new Crops();
        Crops sugarcane = new Crops();
        Crops indigo = new Crops();
        Crops pumpkin = new Crops();
        Crops soybean = new Crops();

        Feed chickenFeed = new Feed();
        Feed cowFeed = new Feed();
        Feed pigFeed = new Feed();
        Feed sheepFeed = new Feed();

        wheat.setGrowthTime(2);
        corn.setGrowthTime(5);
        soybean.setGrowthTime(20);
        sugarcane.setGrowthTime(30);
        carrot.setGrowthTime(10);
        indigo.setGrowthTime(120);
        pumpkin.setGrowthTime(180);

        chickenFeed.setTime(5);
        cowFeed.setTime(10);
        pigFeed.setTime(20);
        sheepFeed.setTime(30);

    }
}