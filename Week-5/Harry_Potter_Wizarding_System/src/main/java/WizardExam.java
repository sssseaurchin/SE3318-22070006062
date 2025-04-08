import java.util.List;

public class WizardExam {
    private List<String> requiredSpells;

    public WizardExam(List<String> requiredSpells) {
        this.requiredSpells = requiredSpells;
    }

    public boolean pass(HogwartsStudent student) {
        if (student == null) {
            return false;
        }
        for (String spell : requiredSpells) {
            if (!student.knowsSpell(spell)) {
                return false;
            }
        }
        return true;
    }

    public void evaluate(HogwartsStudent student) {
        if (pass(student)) {
            System.out.println(student.name + " passed the exam.");
        } else {
            System.out.println(student.name + " failed the exam.");
        }
    }
}
