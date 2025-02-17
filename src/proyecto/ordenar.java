package proyecto;

public class ordenar {
	public static void menorMayor(double[] precio, String[] hierba) {
	       for (int i = 0; i < precio.length - 1; i++) {
	           for (int j = i + 1; j < precio.length; j++) {
	               if (precio[i] > precio[j]) { // Si el precio[i] es mas grande que el que tenemos almacenado en j.
	                   double temporalPrecio = precio[i];
	                   precio[i] = precio[j];
	                   precio[j] = temporalPrecio; // Cambiamos precio[i] a precio[j].
	                   

	                   String temporalHierba = hierba[i];
	                   hierba[i] = hierba[j];
	                   hierba[j] = temporalHierba;
	               }
	           }
	       }
	       
	       System.out.println("Precio ordenado de menor a mayor:");
	       for (int i = 0; i < precio.length; i++) {
	           System.out.println(hierba[i] + ": " + precio[i] + "€"); // Mostramos los precios ordenados de menor a mayor.
	       }
	       System.out.println();
	   }

	public static void mayorMenor(double[] precio, String[] hierba) {
	       for (int i = 0; i < precio.length - 1; i++) {
	           for (int j = i + 1; j < precio.length; j++) {
	               if (precio[i] < precio[j]) {
	                   double temporalPrecio = precio[i];
	                   precio[i] = precio[j];
	                   precio[j] = temporalPrecio;
	                   
	                   String temporalHierba = hierba[i];
	                   hierba[i] = hierba[j];
	                   hierba[j] = temporalHierba;
	               }
	           }
	       }
	       
	       System.out.println("Precio ordenado de mayor a menor:");
	       for (int i = 0; i < precio.length; i++) {
	           System.out.println(hierba[i] + ": " + precio[i] + "€");
	       }
	       System.out.println();
	   }
}