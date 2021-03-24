
public class FuelGauge {
    int fuel;
    int lastrange;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    int refueling(){

        System.out.println("Заправляем полный бак! (50 Литров)");
        if (fuel < 50){
            setFuel(50);
        }
        return fuel;
    }
    void moving(int fuel, int range){
        if(fuel > 0) {setFuel (fuel - (range - lastrange)/10);lastrange = range;
            System.out.println("Пройдено: " + range);
        }
        else {
            System.out.println("Бак пуст!");
        }
    }
}
