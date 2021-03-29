
public class FuelGauge {
    private int fuel;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }
    public int refueling() {
        while (fuel < 50) {
            fuel++;
        }
        return fuel;
    }
    public void moving(int range, int lastrange) {
        if (fuel > 0) {
            this.fuel = (fuel - (range - lastrange) / 10);
            System.out.println("Пройдено: " + range);
        } else {
            System.out.println("Бак пуст! Заправляем");
            refueling();
        }
    }
}
