package Drivers;
//...а за ними раки, на хромой собаке...
public class Crawfish implements  Driver{
    @Override
    public String Voice() {
        return "...";
    }

    @Override
    public String Move() {
        return "Move back";
    }

    @Override
    public String Footprint() {
        return "Claw";
    }
}
