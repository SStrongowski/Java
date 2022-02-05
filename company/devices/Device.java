package company.devices;

import company.saleable;

public abstract class Device implements saleable {
    public String producer;
    protected String mode;
    public int yearOfProduction;
    public String model;
    public Double value;
    public Device(String producer, String model,Integer yearOfProduction,Double value){
        this.producer=producer;
        this.model=model;
        this.yearOfProduction=yearOfProduction;
        this.value=value;
    }
    public abstract void turnOn();

    public String toString() {
        return this.producer+" "+this.mode+" "+this.yearOfProduction+" "+ this.model+ " " + this.value;
    }
}
