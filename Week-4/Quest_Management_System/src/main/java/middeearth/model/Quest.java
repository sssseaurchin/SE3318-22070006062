package middeearth.model;

import java.util.ArrayList;
import java.util.List;

public class Quest {
    private String name;
    private String difficulty;
    private Mentor mentor;
    private List<Adventurer> adventurers;

    public Quest(String name, String difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        this.adventurers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void addAdventurer(Adventurer adventurer) {
        adventurers.add(adventurer);
    }

    public void displayAdventurers() {
        System.out.println("Adventurers in the quest '" + name + "':");
        for (Adventurer adventurer : adventurers) {
            System.out.println("- " + adventurer.getName());
        }
    }
}
