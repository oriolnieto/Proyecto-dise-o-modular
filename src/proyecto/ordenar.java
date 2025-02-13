package proyecto;

public class ordenar {
	public static void menorMayor(double[] precio, String[] hierba) {
	       for (int i = 0; i < precio.length - 1; i++) {
	           for (int j = i + 1; j < precio.length; j++) {
	               if (precio[i] > precio[j]) {
	                   double tempPrecio = precio[i];
	                   precio[i] = precio[j];
	                   precio[j] = tempPrecio;
	                   

	                   String tempHierba = hierba[i];
	                   hierba[i] = hierba[j];
	                   hierba[j] = tempHierba;
	               }
	           }
	       }
	       
	       System.out.println("Precio ordenado de menor a mayor:");
	       for (int i = 0; i < precio.length; i++) {
	           System.out.println(hierba[i] + ": " + precio[i] + "€");
	       }
	       System.out.println();
	   }

	public static void mayorMenor(double[] precio, String[] hierba) {
	       for (int i = 0; i < precio.length - 1; i++) {
	           for (int j = i + 1; j < precio.length; j++) {
	               if (precio[i] < precio[j]) {
	                   double tempPrecio = precio[i];
	                   precio[i] = precio[j];
	                   precio[j] = tempPrecio;
	                   
	                   String tempHierba = hierba[i];
	                   hierba[i] = hierba[j];
	                   hierba[j] = tempHierba;
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