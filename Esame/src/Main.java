import control.*;

import entity.*;

import java.time.*;
public class Main {

	public static void main(String[] args) {
		
		Docente d = new Docente("Roberto", "Natella");
		Docente d2 = new Docente("Roberto", "Pietrantuono");
		Docente d3 = new Docente("Umberto", "Cesaro");
		
		GestioneDocente lista_docenti = new GestioneDocente();
		lista_docenti.aggiungiDocente(d);
		lista_docenti.aggiungiDocente(d2);
		lista_docenti.aggiungiDocente(d3);
		lista_docenti.stampaDocenti();
		
		Corso c = new Corso("Ingegneria Del Software", 9, d);
		System.out.println(c); 
		
		Corso c1 = new Corso();
		c1.setNomeCorso("Mapi");
		c1.setNumeroCFU(6);
		c1.setDocente(d3);
		
		GestioneCorso lista_corsi = new GestioneCorso();
		lista_corsi.creaCorso(c);
		lista_corsi.creaCorso(c1);
		
		lista_corsi.stampaCorsi();
		
		lista_corsi.modificaNomeCorso(c1, "Sistemi Operativi");
		lista_corsi.modificaNumeroCFU(c1, 9);
		lista_corsi.modificaDocente(c1, d2);
		lista_corsi.stampaCorsi();
		
		
		Studente s = new Studente("Alessio", "Evangelista", "N46003706", 1234);
		System.out.println(s);
		
		Studente s2 = new Studente("Marco", "Rossi", "N46003700", 1111);
		Studente s3 = new Studente("Alberto", "Rossi", "N400000", 1111);
		
		GestioneStudente lista_studenti = new GestioneStudente();
		lista_studenti.aggiungiStudente(s);
		lista_studenti.aggiungiStudente(s2);
		lista_studenti.aggiungiStudente(s3);
		lista_studenti.stampaStudenti();
		
		lista_studenti.rimuoviStudente(s3);
		lista_studenti.stampaStudenti();
		
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.ORALE);
		System.out.println(data1);
		
		DataAppello data2 = new DataAppello();
		data2.setAula("T4");
		data2.setData(LocalDate.of(2019, 12, 16));
		data2.setTipoProva(TipoProva.SCRITTA);
		System.out.println(data2);
		
		DataAppello data3 = new DataAppello("T2", LocalDate.of(2019, 12, 20), TipoProva.AL_CALCOLATORE);
		DataAppello data4 = new DataAppello("T2", LocalDate.of(2019, 12, 22), TipoProva.ORALE);
		
		DataAppello data5 = new DataAppello("T1", LocalDate.of(2020, 01, 10), TipoProva.SCRITTA);
		DataAppello data6 = new DataAppello("T1", LocalDate.of(2020, 1, 12), TipoProva.ORALE);
		
		DataAppello[] dateDicembreIS = new DataAppello[2];
		dateDicembreIS[0] = data1;
		dateDicembreIS[1] = data2;
		
		
		DataAppello[] dateGennaioIS = new DataAppello[2];
		dateGennaioIS[0] = data5;
		dateGennaioIS[1] = data6;
		
		DataAppello[] dateDicembreSO = new DataAppello[2];
		dateDicembreSO[0] = data3;
		dateDicembreSO[1] = data4;
		
		Appello appDicembreIS = new Appello();
		Appello appGennaioIS = new Appello();
		Appello appDicembreSO = new Appello();
		
		GestioneAppelli gest_app = new GestioneAppelli();
		gest_app.creaAppello(c, dateDicembreIS);
		gest_app.creaAppello(c, dateGennaioIS);
		gest_app.visualizzaAppelliCorso(c);
		gest_app.creaAppello(c1, dateDicembreSO);
		gest_app.visualizzaAppelliCorso(c1);
		
		gest_app.visualizzaStudentiPrenotati(appGennaioIS);
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		gest_app.effettuaPrenotazione(appDicembreIS, s2);
		gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		gest_app.effettuaPrenotazione(appDicembreSO, s);
		gest_app.effettuaPrenotazione(appDicembreSO, s3);
		gest_app.visualizzaStudentiPrenotati(appDicembreSO);
	}
}
