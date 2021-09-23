package Engines;

import Fuels.Fuel;
import Fuels.Mana;

public class Magic implements Engine{
    private Fuel fuel = new Mana();
    @Override
    public String getType() {
        return "Magic";
    }

    @Override
    public void FuelParam() {
        System.out.println( fuel.getType() );
        System.out.println( fuel.fuelTo100KM() );
    }
}
