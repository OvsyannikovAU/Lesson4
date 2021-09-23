package Drivers;
//...львы в автомобиле...
public class Lion implements Driver{
    @Override
    public String Voice() {
        return "Roar";
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
