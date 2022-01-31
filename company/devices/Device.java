package company.devices;

public abstract class Device {
    public String producer;
    protected String mode;
    public int yearOfProduction;
    public String model;
    public abstract void turnOn();
    public abstract String asString();
    @Override
    public String toString() {
        return this.producer+" "+this.mode+" "+this.yearOfProduction+" "+ this.model +" "+ asString();
    }
}
