public class Odometer {
    int range;
    FuelGauge fuelgauge = new FuelGauge();
    int move(int fuel){
        fuel = fuelgauge.getFuel();
        if(range > 999999){ range = 0; return range;}
        else if (fuel > 0){
            System.out.println("Едем");range+=50;fuelgauge.moving(fuel,range);return fuel; }
        else{fuel = fuelgauge.refueling();return fuel; }
    }
}
