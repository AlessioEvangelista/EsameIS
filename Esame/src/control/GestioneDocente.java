package control;

import java.util.ArrayList;

import entity.Docente;

public class GestioneDocente {

	private ArrayList<Docente> lista_docenti;
	
	public GestioneDocente() {
		lista_docenti = new ArrayList<Docente>();
	}
	
	public void aggiungiDocente(Docente d) {
		lista_docenti.add(d);
	}
	
	public void rimuoviDocente(Docente d) {
		lista_docenti.remove(d);
	}
	
	public void modificaNomeDocente(Docente d, String nome) {
		d.setNome(nome);
	}
	
	public void modificaCognomeDocente(Docente d, String cognome) {
		d.setCognome(cognome);
	}
	
	public void stampaDocenti() {
		System.out.println("I docenti presenti all'interno della lista sono: ");
		for(int i=0; i<lista_docenti.size(); i++) {
			System.out.println(lista_docenti.get(i));
		}
	}
}
