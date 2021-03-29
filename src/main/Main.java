public class Main {
    public static void main(String[] args) {
    Odometer odometer = new Odometer();
    FuelGauge fuelGauge = new FuelGauge(10); //Задаем количество бензина
    for(int i = 0;i < 15; i++){
    odometer.move(fuelGauge);}
    }
}
