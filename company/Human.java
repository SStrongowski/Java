package company;
import java.time.LocalDateTime;
public class Human {
    public String firstName;
    public String lastName;
    private Double salary;
    public String phone;
    public Animal pet;
    public Car car;
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
}
