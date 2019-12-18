package test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import control.GestioneAppelli;
import entity.*;

public class TestVisualizzaStudentiPrenotati {

	@Test
	public void test01UnoStudenteUnAppelloUnaDataOrale() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.ORALE);
		DataAppello[] dateDicembreIS = new DataAppello[1];
		dateDicembreIS[0] = data1;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(1, numeroStudentiPrenotati);
	}
	
	@Test
	public void test02UnoStudentiUnAppelloUnaDataScritta() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.SCRITTA);
		DataAppello[] dateDicembreIS = new DataAppello[1];
		dateDicembreIS[0] = data1;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(1, numeroStudentiPrenotati);
	}
	
	@Test
	public void test03UnoStudentiUnAppelloUnaDataAlCalcolatore() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.AL_CALCOLATORE);
		DataAppello[] dateDicembreIS = new DataAppello[1];
		dateDicembreIS[0] = data1;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(1, numeroStudentiPrenotati);
	}
	
	@Test
	public void test04UnoStudenteUnAppelloDueDateOraleScritta() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.ORALE);
		DataAppello data2 = new DataAppello("T4", LocalDate.of(2019, 12, 16), TipoProva.SCRITTA);
		DataAppello[] dateDicembreIS = new DataAppello[2];
		dateDicembreIS[0] = data1;
		dateDicembreIS[1] = data2;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(1, numeroStudentiPrenotati);
	}
	
	@Test
	public void test05UnoStudenteUnAppelloDueDateOraleAlCalcolatore() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.ORALE);
		DataAppello data2 = new DataAppello("T4", LocalDate.of(2019, 12, 16), TipoProva.AL_CALCOLATORE);
		DataAppello[] dateDicembreIS = new DataAppello[2];
		dateDicembreIS[0] = data1;
		dateDicembreIS[1] = data2;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(1, numeroStudentiPrenotati);
	}
	
	@Test
	public void test06UnoStudenteUnAppelloDueDateScrittaAlCalcolatore() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.SCRITTA);
		DataAppello data2 = new DataAppello("T4", LocalDate.of(2019, 12, 16), TipoProva.AL_CALCOLATORE);
		DataAppello[] dateDicembreIS = new DataAppello[2];
		dateDicembreIS[0] = data1;
		dateDicembreIS[1] = data2;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(1, numeroStudentiPrenotati);
	}
	
	@Test
	public void test07UnoStudenteUnAppelloTreDate() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.ORALE);
		DataAppello data2 = new DataAppello("T4", LocalDate.of(2019, 12, 16), TipoProva.SCRITTA);
		DataAppello data3 = new DataAppello("T2", LocalDate.of(2019, 12, 20), TipoProva.AL_CALCOLATORE);
		DataAppello[] dateDicembreIS = new DataAppello[3];
		dateDicembreIS[0] = data1;
		dateDicembreIS[1] = data2;
		dateDicembreIS[2] = data3;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(1, numeroStudentiPrenotati);
	}
	
	@Test
	public void test08DueStudentiUnAppelloUnaData() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.ORALE);
		DataAppello[] dateDicembreIS = new DataAppello[1];
		dateDicembreIS[0] = data1;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Studente s2 = new Studente("Mario", "Rossi", "N46003700", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		gest_app.effettuaPrenotazione(appDicembreIS, s2);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(2, numeroStudentiPrenotati);
	}
	
	@Test
	public void test09DueStudentiUnAppelloDueDate() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.ORALE);
		DataAppello data2 = new DataAppello("T4", LocalDate.of(2019, 12, 16), TipoProva.SCRITTA);
		DataAppello[] dateDicembreIS = new DataAppello[2];
		dateDicembreIS[0] = data1;
		dateDicembreIS[1] = data2;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Studente s2 = new Studente("Mario", "Rossi", "N46003700", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		gest_app.effettuaPrenotazione(appDicembreIS, s2);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(2, numeroStudentiPrenotati);
	}
	
	@Test
	public void test10DueStudentiUnAppelloTreDate() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.ORALE);
		DataAppello data2 = new DataAppello("T4", LocalDate.of(2019, 12, 16), TipoProva.SCRITTA);
		DataAppello data3 = new DataAppello("T2", LocalDate.of(2019, 12, 20), TipoProva.AL_CALCOLATORE);
		DataAppello[] dateDicembreIS = new DataAppello[3];
		dateDicembreIS[0] = data1;
		dateDicembreIS[1] = data2;
		dateDicembreIS[2] = data3;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Studente s2 = new Studente("Mario", "Rossi", "N46003700", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		gest_app.effettuaPrenotazione(appDicembreIS, s2);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(2, numeroStudentiPrenotati);
	}
	
	@Test
	public void test11ZeroStudentiUnAppelloUnaData() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello data1 = new DataAppello("T1", LocalDate.of(2019,12,19), TipoProva.ORALE);
		DataAppello[] dateDicembreIS = new DataAppello[1];
		dateDicembreIS[0] = data1;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = null;
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(0, numeroStudentiPrenotati);
	}
	
	@Test
	public void test12UnoStudenteUnAppelloZeroDate() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello[] dateDicembreIS = null;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = new Studente("Alessio", "Evangelista", "N46002706", 1234);
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(0, numeroStudentiPrenotati);
	}
	
	@Test
	public void test13ZeroStudentiUnAppelloZeroDate() {
		
		int numeroStudentiPrenotati;
		
		GestioneAppelli gest_app = new GestioneAppelli();
		Docente d = new Docente("Roberto", "Natella");
		Corso c = new Corso("Ingegneria del Software", 9, d);
		DataAppello[] dateDicembreIS = null;
		gest_app.creaAppello(c, dateDicembreIS);
		
		Studente s = null;
		Appello appDicembreIS = new Appello();
		
		gest_app.effettuaPrenotazione(appDicembreIS, s);
		numeroStudentiPrenotati = gest_app.visualizzaStudentiPrenotati(appDicembreIS);
		
		assertEquals(0, numeroStudentiPrenotati);
	}

}
