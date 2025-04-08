public class Mage extends Hero{
    public Mage(String name, int level) {
        super(name, level);
    }
    public void speak() {
        System.out.println("I am Mage " + name);
    }
    public void castSpell() {
        System.out.println(name + " casts a spell.");
    }
}
