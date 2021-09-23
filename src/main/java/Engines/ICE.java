package Engines;

import Fuels.Disel;
import Fuels.Fuel;

public class ICE implements Engine{
    Fuel fuel = new Disel();
    @Override
    public String getType() {
        return "Internal combustion engine";
    }

    @Override
    public void FuelParam() {
        System.out.println( fuel.getType() );
        System.out.println( fuel.fuelTo100KM() );
    }
}
