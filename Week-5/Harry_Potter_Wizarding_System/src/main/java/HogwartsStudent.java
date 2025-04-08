import java.util.ArrayList;
import java.util.List;

public class HogwartsStudent {
    String name;
    String house;
    private int year;
    private List<String> spellsLearned;

    public HogwartsStudent(String name, String house, int year) {
        this.name = name;
        this.house = house;
        this.year = year;
        this.spellsLearned = new ArrayList<>();
    }

    public boolean learnSpell(String spell) {
        if (spell == null || spellsLearned.contains(spell)) {
            return false;
        }
        spellsLearned.add(spell);
        return true;
    }

    public boolean knowsSpell(String spell) {
        return spell != null && spellsLearned.contains(spell);
    }
}
