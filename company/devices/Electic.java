package company.devices;

public class Electic extends Car{
    public Electic(String producer, String model,Integer yearOfProduction,Double enginePower, String color, Double value) {
        super(producer, model, yearOfProduction,enginePower,color,value);
    }  
    @Override
    public void refuel(){
        System.out.println("Charged to full");
    }  
    public String toString() {
        return "It's Electric car " + super.toString();
    }
}
