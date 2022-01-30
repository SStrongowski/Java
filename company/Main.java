package company;
public class Main {

    public static void main(String[] args) {

    Animal dog = new Animal("dog", "Dżekuś");
    dog.feed();
    dog.takeForWalk();

    Animal cat = new Animal("cat", "Bambik");
    cat.feed();
    for (int i=0; i<6;i++){
        cat.takeForWalk();
    }
    Human me =new Human("Sebastian","Strongowski","+48123456789");
    me.car = new Car("vw", "passat", 90.5, "silver");


    me.changeSalary(-100.0);
    me.changeSalary(2999.99);
    me.getSalary();
    }
    
}