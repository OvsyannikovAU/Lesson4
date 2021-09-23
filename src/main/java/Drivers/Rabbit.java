package Drivers;

public class Rabbit implements Driver{
    @Override
    public String Voice() {
        return "Frrr-frrr";
    }

    @Override
    public String Move() {
        return "Jump";
    }

    @Override
    public String Footprint() {
        return "Rabbit's foot";
    }
}
