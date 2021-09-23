package Drivers;

public class Mosquito implements Driver{
    @Override
    public String Voice() {
        return "Bzzzz";
    }

    @Override
    public String Move() {
        return "Flight";
    }

    @Override
    public String Footprint() {
        return "Slur";
    }
}
