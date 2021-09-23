import Drivers.*;
import Engines.*;
import Fuels.*;
import Transport.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Transport bike = new Bike(new Bears(), new Nature()); //ехали медведи на велосипеде
        Transport onfoot = new OnFoot(new Cat(), new Nature()); //а за ними кот, задом наперед
        Transport ballon = new Ballon(new Mosquito(), new Wind()); //а за ним комарики, на воздушном шарике
        Transport dog = new Dog(new Crawfish(), new Nature()); //а за ними раки на хромой собаке
        Transport horse = new Horse(new Wolf(), new Nature()); //волки на кобыле
        Transport auto = new Auto(new Lion(), new ICE()); //львы в автомобиле
        Transport tram = new Tram(new Rabbit(), new DC()); //зайчики в трамвайчике
        Transport besom = new Besom(new Frog(), new Magic()); //жаба на метле
        ArrayList<Transport> chukovsky = new ArrayList<Transport>();
        chukovsky.add(bike);
        chukovsky.add(onfoot);
        chukovsky.add(ballon);
        chukovsky.add(dog);
        chukovsky.add(horse);
        chukovsky.add(auto);
        chukovsky.add(tram);
        chukovsky.add(besom);

        for (Transport tr:chukovsky) {
            System.out.print("Driver voice: "+tr.getDriverVoice()+"; " );
            System.out.print("Driver foot: "+tr.checkDriverFoot()+"; " );
            System.out.println("Engine: "+tr.checkEngineType() );
            tr.printFuelParam();
        }
    }
}
