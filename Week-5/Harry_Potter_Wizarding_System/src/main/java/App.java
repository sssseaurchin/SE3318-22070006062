import java.util.List;

public class App {
    public static void main(String[] args) {
        HogwartsStudent student1 = new HogwartsStudent("Harry Potter", "Gryffindor", 1);
        HogwartsStudent student2 = new HogwartsStudent("Hermione Granger", "Gryffindor", 1);
        HogwartsStudent student3 = new HogwartsStudent("Draco Malfoy", "Slytherin", 1);

        student1.learnSpell("Expelliarmus");
        student2.learnSpell("Expelliarmus");
        student3.learnSpell("Avada Kedavra");

        Spellbook spellbook = new Spellbook();
        spellbook.getSpellsByPrefix("Ex");

        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        HogwartsStudent foundStudent = classroom.findStudent("Hermione Granger");
        System.out.println("Found student: " + foundStudent.name);

        WizardExam exam = new WizardExam(List.of("Expelliarmus"));
        exam.evaluate(student1);

        Duel.start(student1, student2, "Expelliarmus");
    }
}
