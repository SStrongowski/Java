package company;
import java.time.LocalDateTime;

import company.devices.Car;
public class Human {
    public String firstName;
    public String lastName;
    private Double salary;
    public String phone;
    public Animal pet;
    private Car car;
    public Human (String firstName , String lastName, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
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
    public Car getCar() {
        return car;
    }
    public void canIBuyThisCar(Car car) {
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
        return firstName + " " + lastName  + pet  + " " + salary + " " + phone + " " + " " + car;
    }
}
