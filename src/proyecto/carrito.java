package proyecto;

import java.util.Scanner;

public class carrito {

    public static void seleccionarProductos(String[] productos, int[] cantidades, String[] hierba) {
        Scanner scan = new Scanner(System.in);
        boolean seguir = true;
        int contador = 0;

        while (seguir == true) {
            System.out.println("Que producto quieres seleccionar?");
            String producto = scan.nextLine();

            boolean encontrado = false;
            for (int i = 0; i < hierba.length; i++) {
                if (producto.equalsIgnoreCase(hierba[i])) {
                    encontrado = true;
                }
            }

            if (encontrado == false) {
                System.out.println("Ese producto no esta disponible.");
            } 
            else {
                productos[contador] = producto;

                System.out.println("Cantidad?");
                cantidades[contador] = scan.nextInt();
                scan.nextLine(); 

                contador++;
            }

            System.out.println("Quieres seguir comprando?");
            if (scan.nextLine().equalsIgnoreCase("No")) {
                seguir = false;
            }
        }
    }

    public static void eliminarProductos(String[] productos, int[] cantidades) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Que producto quieres eliminar?");
        String producto = scan.nextLine();

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].equalsIgnoreCase(producto)) {
                productos[i] = null;
                cantidades[i] = 0;
                System.out.println("Producto eliminado!");
            }
        }
    }

    public static void calcularTotal(double[] precio, int[] cantidades, String[] productos, String[] hierba) {
        double total = 0;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                for (int j = 0; j < hierba.length; j++) {
                    if (productos[i].equalsIgnoreCase(hierba[j])) {
                        double subtotal = precio[j] * cantidades[i];
                        total += subtotal;
                        System.out.println(productos[i] + ": " + subtotal + "€");
                    }
                }
            }
        }

        System.out.println("----------------------");
        System.out.println("Total: " + total + "€");
    }
}