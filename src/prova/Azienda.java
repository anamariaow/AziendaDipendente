package prova;

import java.util.ArrayList;

public class Azienda {
    private ArrayList<Dipendente> dipendenteArrayList;

    public Azienda() {
        this.dipendenteArrayList = new ArrayList<>();
    }

    public ArrayList<Dipendente> getDipendenteArrayList() {
        return dipendenteArrayList;
    }

    public void setDipendenteArrayList(ArrayList<Dipendente> dipendenteArrayList) {
        this.dipendenteArrayList = dipendenteArrayList;
    }

    public void aggiungiDipendente(Dipendente dipendente) {
        dipendenteArrayList.add(dipendente);
    }

    public void rimuoviDipendente(Dipendente dipendente) {
        dipendenteArrayList.remove(dipendente);
    }

    public void visualizzaDipendenti() {
        System.out.println("Elenco dipendenti: ");
        for(Dipendente dipendente : dipendenteArrayList) {
            dipendente.stampaDettagli();
        }
    }

    public void aumentaStipendio(Double aumento) {
        System.out.println("Aumento stipendio: ");
        for(Dipendente dipendente : dipendenteArrayList) {
            Double nuovoStipendio = dipendente.getSalario() + aumento;
            System.out.println(nuovoStipendio + " - " + dipendente.getNome());
        }
    }

}
