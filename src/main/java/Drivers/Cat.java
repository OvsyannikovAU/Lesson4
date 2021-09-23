package Drivers;
//...а за ними кот, задом наперед...
public class Cat implements Driver{

    @Override
    public String Voice() {
        return "Meow-meow";
    }

    @Override
    public String Move() {
        return "Jump";
    }

    @Override
    public String Footprint() {
        return "Paw";
    }
}
