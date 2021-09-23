package Engines;

import Fuels.Electro;
import Fuels.Fuel;

public class DC implements Engine{
    private Fuel fuel = new Electro();
    @Override
    public String getType() {
        return "DC";
    }

    @Override
    public void FuelParam() {
        System.out.println( fuel.getType() );
        System.out.println( fuel.fuelTo100KM() );
    }
}
