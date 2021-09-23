package Engines;

import Fuels.Fuel;
import Fuels.NoFuel;

public class Nature implements Engine{
    private Fuel fuel = new NoFuel();
    @Override
    public String getType() {
        return "Organism";
    }

    @Override
    public void FuelParam() {
        System.out.println( fuel.getType() );
        System.out.println( fuel.fuelTo100KM() );
    }
}
