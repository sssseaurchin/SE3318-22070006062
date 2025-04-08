import java.util.ArrayList;
import java.util.List;

public class Spellbook {
    private List<String> spells;

    public Spellbook() {
        spells = new ArrayList<>();
    }

    // Retrieve spell at a specific index
    public String getSpell(int index) {
        if (index < 0 || index >= spells.size()) {
            return null; // Or throw an exception if preferred
        }
        return spells.get(index);
    }

    // Get spells by prefix
    public List<String> getSpellsByPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        if (prefix != null) {
            for (String spell : spells) {
                if (spell.startsWith(prefix)) {
                    result.add(spell);
                }
            }
        }
        return result;
    }
}
