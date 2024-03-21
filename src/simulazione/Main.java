package simulazione;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Workman> workmanArrayList = new ArrayList<>(Arrays.asList(
                new Workman( 0, "Mario Gialli", 0.5f, 20),
                new Workman( 5, "Gianni Fannulloni", 0.2f, 30),
                new Workman( 17, "Giorgia Lavoroni", 0.85f, 40)
        ));

        ArrayList<Head> headArrayList = new ArrayList<>(Arrays.asList(
                new Head( 3, "Alessio Antichi", 0.55f, 20),
                new Head( 1, "Marianna Figlidelcapo", 0.3f, 2),
                new Head( 9, "Gianluigi Figlidelcapo", 0.3f, 4)
        ));

        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        employeeArrayList.addAll(workmanArrayList);
        employeeArrayList.addAll(headArrayList);

        System.out.println("Operai che potrebbero essere promossi: ");
        for(Workman workman : workmanArrayList) {
            if(workman.canApplyForPromotion()) {
                workman.stampaDettagli();
            }
        }

        System.out.println("Direttori che potrebbero essere declassati: ");
        for(Head head : headArrayList) {
            if(head.mayBeDemoted()) {
                head.stampaDettagli();
            }
        }

        System.out.println("Nome ed efficency index di ogni persona: ");
        for(Employee employee : employeeArrayList) {
            employee.stampaDettagli();
        }

        System.out.println("Nome di ogni persona escludendo le lettere maiuscole: ");
        for(Employee employee : employeeArrayList) {
            String nome = employee.getName().replaceAll("[A-Z]", "");
            System.out.println(nome);
        }

        System.out.println("Nome di ogni persona ed efficencyIndex sostituendo il carattere . con , e le cifre con ?");
        for(Employee employee : employeeArrayList) {
            String nome = employee.getName().replaceAll("\\.", "," + employee.getEfficencyIndex().toString().replaceAll("\\d", "?"));
            System.out.println(nome);
        }
    }
}