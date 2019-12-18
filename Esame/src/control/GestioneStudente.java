package control;

import java.util.ArrayList;

import entity.Studente;

public class GestioneStudente {

	private ArrayList<Studente> lista_studenti;
	
	public GestioneStudente() {
		lista_studenti = new ArrayList<Studente>();
	}
	
	public void aggiungiStudente(Studente s) {
		lista_studenti.add(s);
	}
	
	public void rimuoviStudente(Studente s) {
		lista_studenti.remove(s);
	}
	
	public void modificaNomeStudente(Studente s, String nome) {
		s.setNome(nome);
	}
	
	public void modificaCognomeStudente(Studente s, String cognome) {
		s.setCognome(cognome);
	}
	
	public void modificaMatricolaStudente(Studente s, String matricola) {
		s.setMatricola(matricola);
	}
	
	public void modificaPinStudente(Studente s, int PIN) {
		s.setPIN(PIN);
	}
	
	public void stampaStudenti() {
		System.out.println("Gli studenti presenti all'interno della lista sono: ");
		for(int i=0; i<lista_studenti.size(); i++) {
			System.out.println(lista_studenti.get(i));
		}
	}
}
