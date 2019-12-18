package entity;

import java.time.LocalDate;

public class DataAppello {

	private String aula;
	private LocalDate data;
	private TipoProva tipo;
	
	public DataAppello() {
		
	}
	
	public DataAppello(String aula, LocalDate data, TipoProva tipo) {
		this.aula = aula;
		this.data = data;
		this.tipo = tipo;
	}
	
	public void setAula(String aula) {
		this.aula = aula;
	}
	
	public String getAula() {
		return aula;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setTipoProva(TipoProva tipo) {
		this.tipo = tipo;
	}
	
	public TipoProva getTipoProva() {
		return tipo;
	}
	
	public String toString() {
		return "DataAppello: " + data + "     " + "Aula: " + aula + "     " + "Tipo Prova: " + tipo;
	}
}
