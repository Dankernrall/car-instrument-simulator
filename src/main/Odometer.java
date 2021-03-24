public class Odometer {
    int range;
    FuelGauge fuelgauge = new FuelGauge();
    void move(int fuel){
        fuel = fuelgauge.getFuel();
        if(range > 999999){ range = 0;
        }
        else if (fuel > 0){
            System.out.println("Едем");range+=50;fuelgauge.moving(fuel,range);
        }
        else{fuelgauge.setFuel(fuelgauge.refueling());
        }
    }
}
