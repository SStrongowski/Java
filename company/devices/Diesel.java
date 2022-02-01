package company.devices;

public class Diesel extends Car{
    public Diesel(String producer, String model,Integer yearOfProduction,Double enginePower, String color, Double value) {
        super(producer, model, yearOfProduction,enginePower,color,value);
    }  
    @Override
    public void refuel(){
        System.out.println("Refueled diesel");
    }  
    public String toString() {
        return "It's Diesel car " + super.toString();
    }
}
