package middeearth;
import middeearth.model.*;
public class App {
    public static void main(String[] args) {
        // Create mentors
        Mentor gandalf = new Mentor("Gandalf", "Gandalf the Grey");
        Mentor elrond = new Mentor("Elrond", "Lord of Rivendell");

        // Create adventurers
        Adventurer frodo = new Adventurer("Frodo Baggins", "Ring-bearer", "Hobbit");
        Adventurer aragorn = new Adventurer("Aragorn", "King of Gondor", "Man");
        Adventurer legolas = new Adventurer("Legolas", "Prince of Mirkwood", "Elf");
        Adventurer gimli = new Adventurer("Gimli", "Son of Glóin", "Dwarf");

        // Create quests
        Quest destroyTheRing = new Quest("Destroy the One Ring", "Hard");
        Quest defendHelmsDeep = new Quest("Defend Helm's Deep", "Very Hard");

        // Mentors oversee quests
        gandalf.overseeQuest(destroyTheRing);
        elrond.overseeQuest(defendHelmsDeep);

        // Adventurers join quests
        frodo.joinQuest(destroyTheRing);
        aragorn.joinQuest(defendHelmsDeep);
        legolas.joinQuest(defendHelmsDeep);
        gimli.joinQuest(defendHelmsDeep);

        // Display quests
        frodo.displayQuests();
        aragorn.displayQuests();
        legolas.displayQuests();
        gimli.displayQuests();

        // Display adventurers in quests
        destroyTheRing.displayAdventurers();
        defendHelmsDeep.displayAdventurers();
    }
}

