package company;
import java.time.LocalDateTime;
import company.devices.Phone;
import company.creatures.Animal;
import company.devices.Car;
public class Human {
    public String firstName;
    public String lastName;
    private Double salary;
    private Phone phone;
    private Animal pet;
    private Car car;
    private Double cash;
    public Human (String firstName , String lastName, Double cash){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
    }
    public Human (String firstName , String lastName,  Double cash, Car car){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.car=car;
    }
    public Human (String firstName , String lastName,  Double cash, Phone phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.phone = phone;
    }
    public Human (String firstName , String lastName,  Double cash, Animal pet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.pet=pet;
    }
    public Human (String firstName , String lastName,  Double cash, Car car, Phone phone, Animal pet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.car=car;
        this.phone=phone;
        this.pet=pet;
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
    public Car getCar() {
        return this.car;
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
        this.car=car;
    }
    public void setPet(Animal animal) {
        this.pet=animal;
    }
    public void BuyThisCar(Car car) {
        if (this.salary > car.value) {
            this.car = car;
            System.out.println("You have enough money to buy " + car.producer + " " + car.model + " by cash");
        } else if (this.salary > car.value / 12) {
            this.car = car;
            System.out.println("You bought " + car.producer + " " + car.model + " in installments!");
        } else
            System.out.println("Sorry " + this.firstName + " you are too poor for this car");
    }
    public String toString() {
        return this.firstName + " " + this.lastName  + this.pet  + " " + this.salary + " " + this.phone + " " + " " + this.car;
    }
}
