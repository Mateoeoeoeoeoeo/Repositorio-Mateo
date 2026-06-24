package ActividadTWO;

import java.util.Scanner;

public class Coso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("INGRESO DE LIBRO");
		System.out.print("Título: ");
		String titulo = sc.nextLine();

		System.out.print("Autor: ");
		String autor = sc.nextLine();

		System.out.print("Año de Publicacion: ");
		int anioDePublicacion = sc.nextInt();
		sc.nextLine();

		System.out.print("Numero Paginas: ");
		String numeroPag = sc.nextLine();

		System.out.print("numero de ISBN: ");
		int iSBN = sc.nextInt();
		sc.nextLine();

		System.out.print("Género: ");
		String genero = sc.nextLine();

		Libro l1 = new Libro(null, null, 0, 0, 0, null);

		System.out.println("INGRESO DE REVISTA");
		System.out.print("Título: ");
		String titulo1 = sc.nextLine();

		System.out.print("Autor: ");
		String autor1 = sc.nextLine();

		System.out.print("Año de Publicacion: ");
		int anioDePublicacion1 = sc.nextInt();
		sc.nextLine();

		System.out.print("Periodicidad: ");
		String periodicidad = sc.nextLine();

		System.out.print("Numero De Edicion: ");
		int NumEdicion = sc.nextInt();
		sc.nextLine();

		Revista r1 = new Revista(null, null, 0, null, 0);
		
		System.out.println("INGRESO DE ARTICULO CIENTIFICO");
		System.out.print("Título: ");
		String titulo2 = sc.nextLine();

		System.out.print("Autor: ");
		String autor2 = sc.nextLine();

		System.out.print("Año de Publicacion: ");
		int anioDePublicacion2 = sc.nextInt();
		sc.nextLine();

		System.out.print("Revista Cientifica donde fue publicada: ");
		String revistaClien = sc.nextLine();

		System.out.print("Nmero de DOI: ");
		int dOI = sc.nextInt();
		sc.nextLine();
		
		ArtCientifico ac1 = new ArtCientifico(null, null, 0, null, 0);

	}

}
