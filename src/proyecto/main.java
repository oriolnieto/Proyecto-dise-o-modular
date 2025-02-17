package proyecto;

import java.util.Scanner;

public class main {
	public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
	public static String[] origen = { "Mexico", "Andorra", "Marruecos", "Palestina" };
	public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };
	public static String[] productos = new  String[4];
	public static int[] cantidades = new  int[4];

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String nombre, lugar;
	double cantidad;
	boolean seguir = true;
	
	System.out.println("Bienvenido a Green & Click!");
	
	while(seguir == true) {
		
		System.out.println("a. Buscar por nombre");
		System.out.println("b. Buscar por origen");
		System.out.println("c. Ordenar por precio de menor a mayor");
		System.out.println("d. Ordenar por precio de mayor a menor");
		System.out.println("e. Seleccionar Productos");
		System.out.println("f. Eliminar Producto");
		System.out.println("g. Calcular Total");
		System.out.println("h. Salir");
		String eleccion = scan.next();
		
		while(!(eleccion.equalsIgnoreCase("a") || eleccion.equalsIgnoreCase("b") || eleccion.equalsIgnoreCase("c") ||
			  eleccion.equalsIgnoreCase("d") || eleccion.equalsIgnoreCase("e") || eleccion.equalsIgnoreCase("f") ||
			  eleccion.equalsIgnoreCase("g") || eleccion.equalsIgnoreCase("h"))) {
			System.out.println("a. Buscar por nombre");
			System.out.println("b. Buscar por origen");
			System.out.println("c. Ordenar por precio de menor a mayor");
			System.out.println("d. Ordenar por precio de mayor a menor");
			System.out.println("e. Seleccionar Productos");
			System.out.println("f. Eliminar Producto");
			System.out.println("g. Calcular Total");
			System.out.println("h. Salir");
			eleccion = scan.next();
		}
		
		if(eleccion.equalsIgnoreCase("a")) {
			buscar.porNombre(hierba, origen, precio);
		}
        if (eleccion.equalsIgnoreCase("b")) {
        	buscar.porOrigen(origen, hierba, precio);
        }
        if (eleccion.equalsIgnoreCase("c")) {
        	ordenar.menorMayor(precio, hierba);
        }
        if (eleccion.equalsIgnoreCase("d")) {
        	ordenar.mayorMenor(precio, hierba);
        }
        if (eleccion.equalsIgnoreCase("e")) {
        	carrito.seleccionarProductos(productos, cantidades, hierba);
        }
        if (eleccion.equalsIgnoreCase("f")) {
        	carrito.eliminarProductos(productos, cantidades);
        }
        if (eleccion.equalsIgnoreCase("g")) {
        	carrito.calcularTotal(precio, cantidades, productos, hierba);
        	seguir = false;
        }
        if (eleccion.equalsIgnoreCase("h")) {
            seguir = false;
        }
    }
	}
}