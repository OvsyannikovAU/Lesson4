package Fuels;

public class NoFuel implements Fuel{
    @Override
    public float fuelTo100KM() {
        return 0;
    }

    @Override
    public String getType() {
        return "None";
    }
}
