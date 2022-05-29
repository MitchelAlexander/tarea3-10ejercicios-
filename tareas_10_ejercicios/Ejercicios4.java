package tareas_10_ejercicios;

import java.io.*;

public class Ejercicios4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double costo;
		double descuento;
		double i;
		double n;
		double pago_por_todo;
		double precio;
		pago_por_todo = 0;
		System.out.print("Ingresa el valor de n:");
		n = Double.parseDouble(bufEntrada.readLine());
		for (i=1;i<=n;i++) {
			System.out.println("PROCESO "+i);
			System.out.print("Ingresa el valor de precio:");
			precio = Double.parseDouble(bufEntrada.readLine());
			descuento = precio*0.1;
			if (precio>=200) {
				descuento = precio*0.15;
			}
			if (precio>100 && precio<200) {
				descuento = precio*0.12;
			}
			costo = precio-descuento;
			pago_por_todo = pago_por_todo+costo;
			System.out.println("Valor de costo: "+costo);
			System.out.println("Valor de descuento: "+descuento);
			System.out.println("");
		}
		System.out.println("Valor de pago por todo: "+pago_por_todo);
	}


}

