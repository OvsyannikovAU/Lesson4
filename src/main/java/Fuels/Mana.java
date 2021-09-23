package Fuels;

public class Mana implements Fuel{
    @Override
    public float fuelTo100KM() {
        return 100;
    }

    @Override
    public String getType() {
        return "Street magic";
    }
}
