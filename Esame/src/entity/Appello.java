package entity;

import java.util.ArrayList;

public class Appello {

	private ArrayList<DataAppello> lista_date = new ArrayList<DataAppello>();
	private ArrayList<Studente> lista_studentiprenotati = new ArrayList<Studente>();
	
	public Appello() {
		
	}
	
	public Appello(DataAppello[] date) {
		for(int i=0; i<date.length; i++)
			lista_date.add(date[i]);
	}
	
	
	public void aggiungiData(DataAppello data) {
		lista_date.add(data);
	}
	
	public void rimuoviAppello(DataAppello data) {
		lista_date.remove(data);
	}
	
	public String toString() {
		String date="";
		for(int i=0; i<lista_date.size(); i++) {
			date= date+ lista_date.get(i) + "\n";
		}
		return date;	
	}
	
	public ArrayList<DataAppello> getDateAppello(){
		return lista_date;
	}
	
	public void aggiungiStudentePrenotato(Studente studente) {
		lista_studentiprenotati.add(studente);
	}
	
	public ArrayList<Studente> getStudentiPrenotati(){
		return lista_studentiprenotati;
	}
}
