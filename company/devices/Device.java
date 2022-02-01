package company.devices;

import company.saleable;

public abstract class Device implements saleable {
    public String producer;
    protected String mode;
    public int yearOfProduction;
    public String model;
    public Device(String producer, String model,Integer yearOfProduction){
        this.producer=producer;
        this.model=model;
        this.yearOfProduction=yearOfProduction;
    }
    public abstract void turnOn();
    @Override
    public String toString() {
        return this.producer+" "+this.mode+" "+this.yearOfProduction+" "+ this.model;
    }
}
