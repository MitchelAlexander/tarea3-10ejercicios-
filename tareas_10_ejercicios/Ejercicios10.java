package tareas_10_ejercicios;

import java.io.*;

public class Ejercicios10 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double categoria1;
		double categoria2;
		double categoria3;
		int clave;
		double impuesto;
		int n;
		double precio;
		double total;
		String x;
		System.out.println("Ingresa el numero de autos");
		n = Integer.parseInt(bufEntrada.readLine());
		total = 0;
		total = 0;
		categoria2 = 0;
		categoria3 = 0;
		while (n>0) {
			System.out.println("Ingresa el precio del auto ");
			precio = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Ingresa la clave");
			clave = Integer.parseInt(bufEntrada.readLine());
			if (clave>0 && clave<4) {
				if (clave==1) {
					impuesto = precio*.10;
					categoria1 = categoria1+impuesto;
				} else {
					if (clave==2) {
						impuesto = precio*.07;
						categoria2 = categoria2+impuesto;
					} else {
						impuesto = precio*.05;
						categoria3 = categoria3+impuesto;
					}
				}
				total = total+impuesto;
				System.out.println("El impuesto a pagar por el auto "+n+" es s/."+impuesto);
				n = n-1;
			} else {
				System.out.println("Esta clave no existe");
			}
		}
		System.out.println("El impuesto a pagar por la categoria 1 es: s/."+categoria1);
		System.out.println("El impuesto a pagar por la categoria 2 es: s/."+categoria2);
		System.out.println("El impuesto a pagar por la categoria 3 es: s/."+categoria3);
		System.out.println("El impuesto total por todos los autos es: s/."+total);
	}


}

