package herencia;

public class Cliente extends Persona{
	
	int nroCliente;
	double deuda;
	int nroTelefono;
	public int getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	public double getDeuda() {
		return deuda;
	}
	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	public int getNroTelefono() {
		return nroTelefono;
	}
	public void setNroTelefono(int nroTelefono) {
		this.nroTelefono = nroTelefono;
	}
	public Cliente(String nombre, String apellido, int cedula, int nroCliente, double deuda, int nroTelefono) {
		super(nombre, apellido, cedula);
		this.nroCliente = nroCliente;
		this.deuda = deuda;
		this.nroTelefono = nroTelefono;
	}
	
	

}
