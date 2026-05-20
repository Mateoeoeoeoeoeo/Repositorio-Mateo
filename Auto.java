package amen;

public class Auto extends Vehiculo {
	int puerta;
	int rueda;
	String nroCarroceria;
	
	public int getPuerta() {
		return puerta;
	}
	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}
	public int getRueda() {
		return rueda;
	}
	public void setRueda(int rueda) {
		this.rueda = rueda;
	}
	public String getNroCarroceria() {
		return nroCarroceria;
	}
	public void setNroCarroceria(String nroCarroceria) {
		this.nroCarroceria = nroCarroceria;
		
	}
	public Auto(int nroMotor, String matricula, String color, int puerta, int rueda, String nroCarroceria) {
		super(nroMotor, matricula, color);
		this.puerta = puerta;
		this.rueda = rueda;
		this.nroCarroceria = nroCarroceria;
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

