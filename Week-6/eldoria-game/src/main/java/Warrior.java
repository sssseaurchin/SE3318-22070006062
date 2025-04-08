public class Warrior extends Hero{
    public Warrior(String name, int level) {
        super(name, level);
    }
    public void speak() {
        System.out.println("I am " + name);
    }
    public void attack(){
        System.out.println(name + " attacks.");
    }
}
