package amen;

public abstract class Vehiculo {
	int nroMotor;
	String matricula;
	String color;
	
	public int getNroMotor() {
		return nroMotor;
	}
	public void setNroMotor(int nroMotor) {
		this.nroMotor = nroMotor;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Vehiculo(int nroMotor, String matricula, String color) {
		this.nroMotor = nroMotor;
		this.matricula = matricula;
		this.color = color;
	}
	
	
	
	
	
	
}
