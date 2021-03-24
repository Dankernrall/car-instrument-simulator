public class Main {
    public static void main(String[] args) {
    Odometer odometer = new Odometer();
    FuelGauge fuelgauge = new FuelGauge();
    int fuel;
    for(int i = 0;i < 15; i++){
    fuel = fuelgauge.getFuel();
    odometer.move(fuel);}
    }
}
