package prova2;

import java.util.ArrayList;

public class Azienda {
    ArrayList<Dipendente> dipendenteArrayList;

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

    public void visualizzaDipendente() {
        for(Dipendente dipendente :dipendenteArrayList) {
            dipendente.stampaDettagliDipendente();
        }
    }

    public void aumentaStipendio(Double aumento) {
        System.out.println("Aumento stipendi: ");
        for(Dipendente dipendente : dipendenteArrayList) {
            Double nuovoStipendio = dipendente.getSalario() + aumento;
            dipendente.setSalario(nuovoStipendio);
        }
    }
}
