package herencia;

public class Empleado extends Persona{
	
	private double sueldo;
	private String horario;
	private String cargo;
	
	public void setSueldo (double s) {
		this.sueldo = s;
	}
	
	public void serHorario (String h) {
		this.horario = h;
		
	}
	
	public void setCargo (String c) {
		this.cargo = c;
	}
	
	public double getSueldo () {
		return sueldo;
	}
	
	public String getHorario () {
		return horario;
	}
	
	public String getCargo () {
		return cargo;
			}

	public Empleado(String nombre, String apellido, int cedula, double s, String h, String c) {
		super(nombre, apellido, cedula);
		this.cargo = c;
		this.horario = h;
		this.sueldo = s;
		
	}
}
