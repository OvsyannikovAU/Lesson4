package Engines;

import Fuels.Fuel;
import Fuels.Helium;

public class Wind implements Engine {
    private Fuel fuel = new Helium();
    @Override
    public String getType() {
        return "Wind fly";
    }

    @Override
    public void FuelParam() {
        System.out.println( fuel.getType() );
        System.out.println( fuel.fuelTo100KM() );
    }
}
