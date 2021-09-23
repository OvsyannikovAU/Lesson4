package Fuels;

public class Helium implements Fuel{
    @Override
    public float fuelTo100KM() {
        return 2.5f;
    }

    @Override
    public String getType() {
        return "Helium fuel";
    }
}
