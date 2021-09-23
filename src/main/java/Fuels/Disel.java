package Fuels;

public class Disel implements Fuel{
    @Override
    public float fuelTo100KM() {
        return 12.7f;
    }

    @Override
    public String getType() {
        return "Disel fuel";
    }
}
