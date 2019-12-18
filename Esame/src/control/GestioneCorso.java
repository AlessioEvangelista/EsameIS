package control;

import java.util.ArrayList;

import entity.Corso;
import entity.Docente;

public class GestioneCorso {

	private ArrayList<Corso> lista_corsi;
	
	public GestioneCorso() {
		lista_corsi = new ArrayList<Corso>();
	}
	
	
	public void creaCorso(Corso c) {
		
		lista_corsi.add(c);
	}
	
	public void rimuoviCorso(Corso c) {
		lista_corsi.remove(c);
	}
	
	public void modificaNomeCorso(Corso c, String nomeCorso) {
		c.setNomeCorso(nomeCorso);
	}
	
	public void modificaNumeroCFU(Corso c, int numeroCFU) {
		c.setNumeroCFU(numeroCFU);
	}
	
	public void modificaDocente(Corso c, Docente docente) {
		c.setDocente(docente);
	}
	
	public void stampaCorsi() {
		System.out.println("I corsi presenti all'interno della lista sono: ");
		for(int i=0; i<lista_corsi.size(); i++) {
			System.out.println(lista_corsi.get(i));
		}
	}
}
