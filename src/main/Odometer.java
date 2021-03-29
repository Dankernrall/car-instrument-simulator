public class Odometer {
    public int range,maxrange = 999999;
    FuelGauge fuelgauge = new FuelGauge();
    public void move(int fuel){
        fuel = fuelgauge.getFuel();
        if(range > maxrange){ range = 0;
        }
        else if (fuel > 0){
            range+=50;fuelgauge.moving(fuel,range);
        }
        else{fuelgauge.setFuel(fuelgauge.refueling());
        }
    }
}
