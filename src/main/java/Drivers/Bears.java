package Drivers;
//ехали медведи на велосипеде....
public class Bears implements Driver{
    @Override
    public String Voice() {
        return "Aaarrrr";
    }

    @Override
    public String Move() {
        return "Clubfoot";
    }

    @Override
    public String Footprint() {
        return "Paw";
    }
}
