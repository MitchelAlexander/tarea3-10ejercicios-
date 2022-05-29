package tareas_10_ejercicios;

import java.io.*;

public class Ejercicios2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int hamburguesa;
		int n;
		int tarjeta;
		double total;
		double x;
		System.out.print("Cuantas hamburguesas desea comprar");
		n = Integer.parseInt(bufEntrada.readLine());
		for (x=1;x<=n;x++) {
			System.out.println("Seleccione el numero del tipo de hamburguesa: ");
			System.out.println("    1.- S sencilla s/.10");
			System.out.println("    2.- D doble s/.12");
			System.out.println("    3.- T triples s/.14");
			hamburguesa = Integer.parseInt(bufEntrada.readLine());
			switch (hamburguesa) {
			case 1:
				total = +10;
				break;
			case 2:
				total = +12;
				break;
			case 3:
				total = +14;
				break;
			default:
				System.out.println("Ese numero no existe en el menu");
			}
		}
		System.out.println("Elige el tipo de pago:");
		System.out.println("    1.- Efectivo");
		System.out.println("    2.- Tarjeta de credito o debito");
		tarjeta = Integer.parseInt(bufEntrada.readLine());
		switch (tarjeta) {
		case 1:
			System.out.println("El total a pagar es de: "+total+" soles");
			break;
		case 2:
			total = +(.05);
			System.out.println("El total a pagar es de: "+total+" soles");
			break;
		default:
			System.out.println("Elige un numero correcto");
		}
	}


}

