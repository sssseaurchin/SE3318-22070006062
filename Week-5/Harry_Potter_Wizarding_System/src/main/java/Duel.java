import java.util.Random;

public class Duel {
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell) {
        if (spell == null || s1 == null || s2 == null) {
            System.out.println("Invalid duel parameters.");
            return;
        }

        boolean s1Knows = s1.knowsSpell(spell);
        boolean s2Knows = s2.knowsSpell(spell);

        if (!s1Knows && !s2Knows) {
            System.out.println("It's a draw!");
        } else if (s1Knows && !s2Knows) {
            System.out.println(s1.name + " wins!");
        } else if (!s1Knows && s2Knows) {
            System.out.println(s2.name + " wins!");
        } else {
            Random rand = new Random();
            int s1Strength = rand.nextInt(100);
            int s2Strength = rand.nextInt(100);

            if (s1Strength > s2Strength) {
                System.out.println(s1.name + " wins with greater magic strength!");
            } else {
                System.out.println(s2.name + " wins with greater magic strength!");
            }
        }
    }
}
