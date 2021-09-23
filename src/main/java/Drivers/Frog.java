package Drivers;
//...жаба на метле...
public class Frog implements Driver{
    @Override
    public String Voice() {
        return "Croak";
    }

    @Override
    public String Move() {
        return "Jump";
    }

    @Override
    public String Footprint() {
        return "Membrane fingers";
    }
}
