package herencia;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Jose", "Rodriguez", 4589823, 14, 7000, 12345678);
		System.out.print("el nombre del cliente es "+cliente1.getNombre());
		System.out.println(cliente1.getApellido());
		System.out.print("su cedula es "+cliente1.getCedual());
		System.out.println(" su numero de cliente es "+cliente1.getNroCliente());
		System.out.print("su deuda es de "+cliente1.deuda);
		System.out.println(" y su numero de telefono es "+cliente1.nroTelefono);
		
		
	}

}
