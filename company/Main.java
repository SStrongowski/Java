package company;
public class Main {

    public static void main(String[] args) {

    Animal dog = new Animal("dog", "Dżekuś");
    dog.feed();
    dog.takeForWalk();

    Animal cat = new Animal("cat", "Bambik");
    cat.feed();
    for (int i=0; i<6;i++)
    cat.takeForWalk();
    }
}