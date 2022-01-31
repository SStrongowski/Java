package company;

public class Animal {
    final String species;
    public String name;
    private Double weight;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
        if (species == "dog")
            this.weight = 8.0;
        else if (species =="cat")
            this.weight = 3.0;
        else
            weight = 1.0; 
    }

    void feed() {
        if (this.weight <= 0)
            System.out.println(this.name+"RIP");
        else {
            weight += 1;
            System.out.println(this.name+ "Weight increased to " + this.weight + " kg");
        }
    }

    void takeForWalk() {
        if (this.weight <= 0)
            System.out.println(this.name+" is dead");
        else {
            weight -= 1;
            System.out.println(this.name+"Weight reduced to " + this.weight + " kg");
        }

    }
    public String toString(){
        return this.species + " " + this.name + " " + this.weight;
    }
}