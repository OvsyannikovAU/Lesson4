package Drivers;

public class Wolf implements Driver{
    @Override
    public String Voice() {
        return "Waaaaauuf";
    }

    @Override
    public String Move() {
        return "Run";
    }

    @Override
    public String Footprint() {
        return "Paw";
    }
}
