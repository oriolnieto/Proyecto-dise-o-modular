package proyecto;

import java.util.Scanner;

public class buscar {
	public static void porNombre(String[] hierba) {
		   Scanner scan = new Scanner(System.in);

		   System.out.println("Qué hierba quieres buscar por nombre?");
		   String hierbaABuscarNombre = scan.nextLine();

		   for (int i = 0; i < hierba.length; i++) {
		       if (hierba[i].equalsIgnoreCase(hierbaABuscarNombre)) {
		           System.out.println("Hierba encontrada!");
		       }
		   }
		}

	public static void porOrigen(String[] origen, String[] hierba) {
		   Scanner scan = new Scanner(System.in);

		   System.out.println("Qué hierba quieres buscar por origen?");
		   String hierbaABuscarOrigen = scan.nextLine();

		   for (int i = 0; i < origen.length; i++) {
		       if (origen[i].equalsIgnoreCase(hierbaABuscarOrigen)) {
		           System.out.println("Hierba encontrada: " + hierba[i]);
		       }
		   }
		}
}