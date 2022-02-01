package company.devices;

public class Lpg extends Car{
    public Lpg(String producer, String model,Integer yearOfProduction,Double enginePower, String color, Double value) {
        super(producer, model, yearOfProduction,enginePower,color,value);
    }  
    @Override
    public void refuel(){
        System.out.println("Lpg refueled");
    }  
    public String toString() {
        return "It's Lpg car " + super.toString();
    }
}
