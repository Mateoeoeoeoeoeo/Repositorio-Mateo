package amen;

public class Herenshion {

	public static void main(String[] args) {
	
		
		Auto auto1 = new Auto (1221, "A1B2C3", "ROJO", 4, 4, "8934");
		System.out.println("El numero del motor es "+auto1.getNroMotor());
		System.out.println("El numero de la matricula es "+auto1.getMatricula());
		System.out.println("El color del Auto es "+auto1.getColor());
		System.out.println("Las cantidad de puerta del auto son "+auto1.getPuerta());
		System.out.println("Las cantidad de ruedas del auto son "+auto1.getRueda());
		
		
	}

}
