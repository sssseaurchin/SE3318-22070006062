public abstract class Character {
    String name;
    int level;
    public Character(String name, int level){
        this.name = name;
        this.level = level;
    }
    public abstract void speak();
}
