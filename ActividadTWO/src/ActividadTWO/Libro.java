package ActividadTWO;

public class Libro extends Publicacion{
	int NumeroPag;
	int ISBN;
	String genero;
	
	public int getNumeroPag() {
		return NumeroPag;
	}
	public void setNumeroPag(int numeroPag) {
		NumeroPag = numeroPag;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Libro(String titulo, String autor, int anioDePubliacion, int numeroPag, int iSBN, String genero) {
		super(titulo, autor, anioDePubliacion);
		NumeroPag = numeroPag;
		ISBN = iSBN;
		this.genero = genero;
	}
	
	

}
