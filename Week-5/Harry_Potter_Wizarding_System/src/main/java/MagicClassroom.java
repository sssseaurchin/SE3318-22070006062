import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MagicClassroom {
    private List<HogwartsStudent> students;

    public MagicClassroom() {
        students = new ArrayList<>();
    }

    public boolean addStudent(HogwartsStudent student) {
        if (student == null) {
            return false;
        }
        students.add(student);
        return true;
    }

    public HogwartsStudent findStudent(String name) {
        if (name == null) {
            return null;
        }
        for (HogwartsStudent student : students) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    public HogwartsStudent findStudentBySpell(String spell) {
        if (spell == null) {
            return null;
        }
        for (HogwartsStudent student : students) {
            if (student.knowsSpell(spell)) {
                return student;
            }
        }
        return null;
    }

    public List<HogwartsStudent> getStudentsByHouse(String house) {
        if (house == null) {
            return new ArrayList<>();
        }
        return students.stream()
                .filter(s -> s.house.equals(house))
                .collect(Collectors.toList());
    }

    public List<HogwartsStudent> getStudentsSortedByHouse() {
        return students.stream()
                .sorted((s1, s2) -> s1.house.compareTo(s2.house))
                .collect(Collectors.toList());
    }
}
