package ActividadTWO;

public class ArtCientifico extends Publicacion{
	String RevistaCient;
	int DOI;
	
	public String getRevistaCient() {
		return RevistaCient;
	}
	public void setRevistaCient(String revistaCient) {
		RevistaCient = revistaCient;
	}
	public int getDOI() {
		return DOI;
	}
	public void setDOI(int dOI) {
		DOI = dOI;
	}
	public ArtCientifico(String titulo, String autor, int anioDePubliacion, String revistaCient, int dOI) {
		super(titulo, autor, anioDePubliacion);
		RevistaCient = revistaCient;
		DOI = dOI;
	}

	
}
