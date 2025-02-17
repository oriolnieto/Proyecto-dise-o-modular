package proyecto;

import java.util.Scanner;

public class buscar {
	public static void porNombre(String[] hierba, String[] origen, double[] precio) {
		   Scanner scan = new Scanner(System.in);
		   boolean hierbaEncontrada = false;

		   System.out.println("Qué hierba quieres buscar por nombre?"); // Pedimos al usuario la hierba y la guardamos para luego comparar.
		   String hierbaABuscarNombre = scan.nextLine();

		   for (int i = 0; i < hierba.length; i++) {
		       if (hierba[i].equalsIgnoreCase(hierbaABuscarNombre)) {   // Buscar si la hierba hace match con nuestras hierbas, ignorando mayusculas e minusculas.
		           System.out.println("Hierba encontrada: " + hierba[i] + " | " + "Origen: " + origen[i] + " | " + "Precio: " + precio[i] + "€");
		           System.out.println();
		           hierbaEncontrada = true;
		       }
		   }
		   
		   if(hierbaEncontrada == false) {   // Por si no encuentra hierba, para determinar usamos un valor booleano.
			   System.out.println("No Encontrada.");
			   System.out.println();
		   }
		}

	public static void porOrigen(String[] origen, String[] hierba, double[] precio) {
		   Scanner scan = new Scanner(System.in);
		   boolean hierbaEncontrada = false;

		   System.out.println("Qué hierba quieres buscar por origen?");
		   String hierbaABuscarOrigen = scan.nextLine();

		   for (int i = 0; i < origen.length; i++) {
		       if (origen[i].equalsIgnoreCase(hierbaABuscarOrigen)) {
		           System.out.println("Hierba encontrada: " + hierba[i] + " | " + "Origen: " + origen[i] + " | " + "Precio: " + precio[i] + "€");
		           System.out.println();
		           hierbaEncontrada = true;
		       }
		   }
		   
		   if(hierbaEncontrada == false) {
			   System.out.println("No Encontrada.");
			   System.out.println();
		   }
		}
}