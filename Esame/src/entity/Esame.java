package entity;

public class Esame {

	
	private int voto;
	private String lista_argomenti;
	
	public Esame() {
		
	}
	
	public Esame(int voto, String lista_argomenti) {
		this.voto = voto;
		this.lista_argomenti = lista_argomenti;
	}
	
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	public int getVoto() {
		return voto;
	}
	
	public void setListaArgomenti(String lista_argomenti) {
		this.lista_argomenti = lista_argomenti;
	}
	
	public String getListaArgomenti() {
		return lista_argomenti;
	}
}
