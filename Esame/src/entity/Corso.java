package entity;

import java.util.ArrayList;

public class Corso {
	private String nomeCorso;
	private int numeroCFU;
	private Docente docente;
	private ArrayList<Appello> lista_appelli = new ArrayList<Appello>();
	
	public Corso() {
		
	}
	
	public Corso(String nomeCorso, int numeroCFU, Docente docente) {
		this.nomeCorso = nomeCorso;
		this.numeroCFU = numeroCFU;
		this.docente = docente;
	}
	
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	
	public void setNumeroCFU(int numeroCFU) {
		this.numeroCFU = numeroCFU;
	}
	
	public int getNumeroCFU() {
		return numeroCFU;
	}
	
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	public Docente getDocente() {
		return docente;
	}
	
	public void aggiungiAppello(Appello appello) {
		lista_appelli.add(appello);
	}
	
	public ArrayList<Appello> getAppelliCorso(){
		return lista_appelli;
	}
	
	public String toString() {
		return "Corso: " + nomeCorso + " "+ numeroCFU + " sostenuto da " + docente;
	}
}
