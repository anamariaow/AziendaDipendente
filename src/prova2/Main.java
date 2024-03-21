package prova2;

import prova.Azienda;
import prova.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("Dipendente1", 1200.0);
        Dipendente dipendente2 = new Dipendente("Dipendente2", 1250.0);
        Dipendente dipendente3 = new Dipendente("Dipendente3", 1300.0);

        Azienda azienda = new Azienda();

        azienda.aggiungiDipendente(dipendente1);
        azienda.aggiungiDipendente(dipendente2);
        azienda.aggiungiDipendente(dipendente3);

        //azienda.rimuoviDipendente(dipendente1);

        azienda.visualizzaDipendenti();

        azienda.aumentaStipendio(50.0);
    }
}