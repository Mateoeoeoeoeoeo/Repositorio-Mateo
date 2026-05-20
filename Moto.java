package amen;

public class Moto extends Vehiculo {
	String tipoManillar;
	int nroGenerado;
	double modelo;
	
	public String getTipoManillar() {
		return tipoManillar;
	}
	public void setTipoManillar(String tipoManillar) {
		this.tipoManillar = tipoManillar;
	}
	public int getNroGenerado() {
		return nroGenerado;
	}
	public void setNroGenerado(int nroGenerado) {
		this.nroGenerado = nroGenerado;
	}
	public double getModelo() {
		return modelo;
	}
	public void setModelo(double modelo) {
		this.modelo = modelo;
	}
	public Moto(int nroMotor, String matricula, String color, String tipoManillar, int nroGenerado, double modelo) {
		super(nroMotor, matricula, color);
		this.tipoManillar = tipoManillar;
		this.nroGenerado = nroGenerado;
		this.modelo = modelo;
	}
	
	
	}
	
	

