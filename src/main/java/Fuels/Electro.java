package Fuels;

public class Electro implements Fuel{
    @Override
    public float fuelTo100KM() {
        return 15000;
    }

    @Override
    public String getType() {
        return "Electricity";
    }
}
