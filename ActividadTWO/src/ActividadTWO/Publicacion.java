package ActividadTWO;

public abstract class Publicacion {
	String Titulo;
	String Autor;
	int AnioDePubliacion;
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getAnioDePubliacion() {
		return AnioDePubliacion;
	}
	public void setAnioDePubliacion(int anioDePubliacion) {
		AnioDePubliacion = anioDePubliacion;
	}
	
	public Publicacion(String titulo, String autor, int anioDePubliacion) {
		Titulo = titulo;
		Autor = autor;
		AnioDePubliacion = anioDePubliacion;
	}
	

	
	
	
}
