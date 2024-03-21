package esame;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
        new Student("Mario", "Rossi", 23, 5),
        new Student("Gianni", "Gialli", 19, 2),
        new Student("Rosa", "Matricole", 18, 1)
        ));

        ArrayList<Professor> professors = new ArrayList<>(Arrays.asList(
        new Professor("Rosario", "Novelli", 35, 5),
        new Professor("Agatina", "Sperti", 45, 15)
        ));

        ArrayList<Person> people = new ArrayList<>();

        people.addAll(students);
        people.addAll(professors);

        System.out.println("Students who can apply as tutor: ");
        for(Student student : students) {
            if(student.canApplyAsTutor()) {
                student.stampaNomeCompleto();
            }
        }

        System.out.println("Professors who can apply as head: ");
        for(Professor professor : professors) {
            if(professor.canApplyAsHead()) {
                professor.stampaNomeCompleto();
            }
        }

        System.out.println("Lista persone: ");
        for(Person person : people) {
            person.stampaNomeCompleto();
        }

        System.out.println("Nome completo escludendo le lettere a, o, i: ");
        for(Person person : people) {
            String name = person.getFirstName().replaceAll("[aoiAOI]"," " + person.getLastName()).replaceAll("[aoiAOI]", " ");
            System.out.println(name);
        }

        System.out.println("Nome completo sostituendo le lettere maiuscole con *: ");
        for(Person person : people) {
            String name = person.getFirstName().replaceAll("[A-Z]", "*" + person.getLastName().replaceAll("[A-Z]", "*"));
            System.out.println(name);
        }
    }
}