package Transport;

import Drivers.Driver;
import Engines.Engine;

public abstract class Transport {
    private Driver driver;
    private Engine engine;

    public Transport(Driver driver, Engine engine){
        this.driver = driver;
        this.engine = engine;
    }
    public String getDriverVoice(){
        return driver.Voice();
    }
    public String checkDriverFoot(){
        return driver.Footprint();
    }

    public String checkEngineType(){
        return engine.getType();
    }
    public void printFuelParam(){
        engine.FuelParam();
    }
}
