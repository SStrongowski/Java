package company;
import java.time.LocalDateTime;
import company.devices.Phone;
import company.creatures.Animal;
import company.devices.Car;

import java.util.Arrays;
public class Human {
    public String firstName;
    public String lastName;
    private Double salary;
    private Phone phone;
    private Animal pet;
    private Car[] garage;
    private Double cash;
    private static Integer DEFAULT_GARAGE_SIZE=2;
    public Human (String firstName , String lastName, Double cash){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.garage=new Car[DEFAULT_GARAGE_SIZE];
    }
    public Human (String firstName , String lastName,  Double cash, Integer garageSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.garage=new Car[garageSize];
    }
    public Human (String firstName , String lastName,  Double cash, Phone phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.phone = phone;
        this.garage=new Car[DEFAULT_GARAGE_SIZE];
    }
    public Human (String firstName , String lastName,  Double cash, Animal pet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.pet=pet;
        this.garage=new Car[DEFAULT_GARAGE_SIZE];
    }
    public Human (String firstName , String lastName,  Double cash, Integer garageSize, Phone phone, Animal pet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.phone=phone;
        this.pet=pet;
        this.garage=new Car[garageSize];
    }
    public Double getSalary() {
        System.out.println("Salary amount: " + this.salary+ ", checked at " + LocalDateTime.now().toString());
        return salary;
    }
    public void changeSalary(Double sum){
        if (sum <0){
            System.out.println("Salary can't be less than zero");
            return;
        }
        System.out.println("Data has been updated") ;
        System.out.println("Please pick up the annex from Mrs.Hania") ;
        System.out.println("Zus and Us already know about your salary change");
        this.salary=sum;
        System.out.println("Salary changed successful") ;
    }

    // getters
    public Double getCash(){
        return this.cash;
    }
    public Phone getPhone() {
        return this.phone;
    }
    public Car getCar(Integer index){
            return this.garage[index];
    }
    public Animal getPet() {
        return this.pet;
    }
    // setters
    public void setCash(Double cash) {
        this.cash=cash;
    }
    public void setPhone(Phone phone) {
        this.phone=phone;
    }
    public void setCar(Car car) {
        for (Integer i=0;i<garage.length;i++){
            if (this.garage[i] == null){
                System.out.println(i);
                this.garage[i]=car;
                return;
            }
        }
    }
    public void setCar(Car car,Integer index) {
        this.garage[index]=car;
    }
    public void setPet(Animal animal) {
        this.pet=animal;
    }
    public String toString() {
        return this.firstName + " " + this.lastName+" "  + this.pet  + " " + this.salary + " " + this.phone + " " + Arrays.toString(this.garage);
    }
    public Double carsValue(){
        Double value = 0.0;
        for (Car car : garage) {
            if (car != null) {
                value += car.value;
            }
        }
        return value;
    }
    public void sortCars(){
        Arrays.sort(garage);
    }
    public boolean hasACar(Car newCar){
        for(Car car : garage){
            if(newCar.equals(car)){
                return true;
            }
        }
        return false;
    }
    public boolean hasAFreePlace(){
        for(Car car : garage){
            if(car == null){
                return true;
            }
        }
        return false;
    }
    public void removeCarFromGarage(Car carForRemove){
        for(Integer i=0;i<garage.length;i++){
            if(carForRemove.equals(this.garage[i])){
                this.garage[i]=null;
                return;
            }
        }
    }
}
