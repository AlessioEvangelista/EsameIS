package control;

import java.util.ArrayList;

import entity.*;

public class GestioneAppelli {
	
	
	public GestioneAppelli() {
		
	}
	
	public void creaAppello(Corso c, DataAppello[] date) {
		if(date != null) {
		Appello a = new Appello(date);
		c.aggiungiAppello(a);
		}
		else {
			System.out.println("Nessuna data per l'appello a cui ci si vuole prenotare");
		}	
	}
	
	public void visualizzaAppelliCorso(Corso c) {
		System.out.println("Gli appelli del corso di " + c.getNomeCorso() + " sono :");
		ArrayList<Appello> lista_appelli = c.getAppelliCorso();
		for(int i=0; i<lista_appelli.size(); i++) {
			System.out.println(lista_appelli.get(i));
		}
	}
	
	public void effettuaPrenotazione(Appello app, Studente studente) {
		if(studente == null) 
			System.out.println("Nessuno studente per la prenotazione");
		else if(app.getDateAppello() == null)
			System.out.println("Nessuna data");
		else {
			app.aggiungiStudentePrenotato(studente);
		}
	}
	
	public int visualizzaStudentiPrenotati(Appello app) {
		System.out.println("Gli Studenti prenotati per l'appello sono: " );
		ArrayList<Studente> lista_studentiprenotati = app.getStudentiPrenotati();
		int numeroStudentiPrenotati = lista_studentiprenotati.size();
		
		if(numeroStudentiPrenotati ==0)
			System.out.println("Nessuno studente prenotato");
		else {
			for(int i=0; i<numeroStudentiPrenotati; i++)
				System.out.println(lista_studentiprenotati.get(i));
		}
		
		System.out.println();
		return numeroStudentiPrenotati;
	}
}
