package entity;
public class Studente {

	private String nome;
	private String cognome;
	private String matricola;
	private int PIN;
	
	public Studente() {
		
	}
	
	public Studente(String nome, String cognome, String matricola, int PIN) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.PIN = PIN;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	public void setPIN(int PIN) {
		this.PIN = PIN;
	}
	
	public int getPIN() {
		return PIN;
	}
	
	public String toString() {
		return "Studente: " + nome + " " + cognome + " " + matricola + " " + PIN;
	}
}
