package company.devices;

public class Phone  extends Device{
    final public Double screenSize;
    final public String operatingSystem;

    public Phone(String producer,  String model ,Integer yearOfProduction,Double screenSize, String operatingSystem) {
        this.producer=producer;
        this.yearOfProduction=yearOfProduction;
        this.model=model;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }
    public String asString() {
        return this.operatingSystem + " " + this.screenSize ;
    }
    @Override
    public void turnOn() {
        this.mode = "on";
        System.out.println(this.model+" starting...");
    }
}