package proyecto;

import java.util.Scanner;

public class carrito {

    public static void seleccionarProductos(String[] productos, int[] cantidades, String[] hierba) {
        Scanner scan = new Scanner(System.in);
        boolean seguir = true;
        int contador = 0;

        while (seguir == true) {
            System.out.println("Que producto quieres seleccionar?"); // Pedimos producto al usuario.
            String producto = scan.nextLine();

            boolean encontrado = false;
            for (int i = 0; i < hierba.length; i++) { // Buscamos si su producto es valido en nuestra lista de productos.
                if (producto.equalsIgnoreCase(hierba[i])) {
                    encontrado = true;
                }
            }

            if (encontrado == false) {
                System.out.println("Ese producto no esta disponible."); // Por si no lo encontramos.
            } 
            else {
                productos[contador] = producto; // Si encontramos lo almacenamos y pedimos cantidad.

                System.out.println("Cantidad?");
                cantidades[contador] = scan.nextInt();
                scan.nextLine(); 

                contador++;
            }

            System.out.println("Quieres seguir comprando?");
            if (scan.nextLine().equalsIgnoreCase("No")) {
                seguir = false;
            }
            System.out.println();
        }
    }

    public static void eliminarProductos(String[] productos, int[] cantidades) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Que producto quieres eliminar?"); // Pedimos producto a eliminar.
        String producto = scan.nextLine();

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].equalsIgnoreCase(producto)) { // Buscamos que no sea nulo y que el producto sea igual a la lista de productos añadidos a la cesta.
                productos[i] = null; // Le damos valor nulo a la array de productos.
                cantidades[i] = 0; // Fijamos su cantidad a 0.
                System.out.println("Producto eliminado!");
            }
        }
        System.out.println();
    }

    public static void calcularTotal(double[] precio, int[] cantidades, String[] productos, String[] hierba) {
        double total = 0;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) { // Si el producto no es nulo
                for (int j = 0; j < hierba.length; j++) {
                    if (productos[i].equalsIgnoreCase(hierba[j])) {  // Buscamos el producto con las hierbas para saber su posicion.
                        double subtotal = precio[j] * cantidades[i]; // Calculamos el subtotal multiplicando el precio por las cantidades.
                        total += subtotal; // Añadimos el subtotal al total por cada producto.
                        System.out.println(productos[i] + ": " + subtotal + "€");
                    }
                }
            }
        }

        System.out.println("----------------------");
        System.out.println("Total: " + total + "€"); // Imprimimos el total.
    }
}