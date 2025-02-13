package proyecto;

import java.util.Scanner;

public class carrito {
	public static void seleccionarProductos(String[] productos, int[] cantidades) {
		Scanner scan = new Scanner(System.in);
		boolean seguir = true;
		int contadorProducto = 0;
		int contadorCantidad = 0;

		while(seguir == true) {

		System.out.println("Que producto quieres seleccionar?");
		String producto = scan.nextLine();

		productos[contadorProducto] = producto;
		contadorProducto++;

		System.out.println("Cantidad?");
		int cantidad = scan.nextInt();

		cantidades[contadorCantidad] = cantidad;
		contadorCantidad++;

		System.out.println("Quieres seguir comprando?");
		String seguirsiono = scan.next();

		if (seguirsiono.equalsIgnoreCase("No")) {
		seguir = false;
		}
		}
		}

		public static void eliminarProductos(String[] productos, int[] cantidades) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Que producto quieres eliminar?");
		String producto = scan.nextLine();

		for(int i = 0; i < productos.length; i++) {
		if (productos[i].equals(producto)) {
		productos[i] = "";
		cantidades[i] = 0;
		System.out.println("Producto Eliminado!");
		}
		}

		}

		public static void calcularTotal(double[] precio, int[] cantidades, String[] productos, String[] hierba) {
		       double total = 0;

		       for (int i = 0; i < productos.length; i++) {
		           if (productos[i] != null && productos[i].length() > 0) {
		               for (int j = 0; j < hierba.length; j++) {
		                   if (productos[i].equals(hierba[j])) {
		                       double productTotal = precio[j] * cantidades[i];
		                       total += productTotal;
		                       System.out.println(productos[i] + ": " + productTotal + "€");
		                   }
		               }
		           }
		       }
		       
		       System.out.println("----------------------");
		       System.out.println("Total: " + total + "€");
		   }
		}