public class Odometer {
    private int range;
    private int maxrange = 999999;
    private int lastrange;

    public void move(FuelGauge ob) {
        if (range > maxrange) {
            this.lastrange = range;
            this.range = 0;
        } else {
            this.lastrange = range;
            this.range += 50;
            ob.moving(range,lastrange);
        }
    }
}
