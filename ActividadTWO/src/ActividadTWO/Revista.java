package ActividadTWO;

public class Revista extends Publicacion {
	String Periodicidad;
	int NumEdicion;
	
	public String getPeriodicidad() {
		return Periodicidad;
	}
	public void setPeriodicidad(String periodicidad) {
		Periodicidad = periodicidad;
	}
	public int getNumEdicion() {
		return NumEdicion;
	}
	public void setNumEdicion(int numEdicion) {
		NumEdicion = numEdicion;
	}
	
	public Revista(String titulo, String autor, int anioDePubliacion, String periodicidad, int numEdicion) {
		super(titulo, autor, anioDePubliacion);
		Periodicidad = periodicidad;
		NumEdicion = numEdicion;
	}
	
	
	

}
