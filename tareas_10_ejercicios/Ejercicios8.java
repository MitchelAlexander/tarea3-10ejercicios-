package tareas_10_ejercicios;


import java.io.*;

public class Ejercicios8 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		int n;
		double total;
		double total1;
		double total2;
		double total3;
		double venta;
		System.out.println("Ingresa el numero de ventas");
		n = Integer.parseInt(bufEntrada.readLine());
		a = 0;
		b = 0;
		c = 0;
		total = 0;
		total1 = 0;
		total2 = 0;
		total3 = 0;
		while (n>0) {
			System.out.println("Ingresa el monto de la venta "+n);
			venta = Double.parseDouble(bufEntrada.readLine());
			if (venta<=10000) {
				a = a+1;
				total1 = total1+venta;
			} else {
				if (venta<20000) {
					b = b+1;
					total2 = total2+venta;
				} else {
					c = c+1;
					total3 = total3+venta;
				}
			}
			total = total+venta;
			n = n-1;
		}
		System.out.println("El numero de ventas menores a s/.10,000 es: "+a);
		System.out.println("El total de las ventas menores a s/.10,000 es: s/."+total1);
		System.out.println("El numero de ventas mayores a s/.10,000 y menores a s/.20,000 es: "+b);
		System.out.println("El total de las ventas mayores a s/.10,000 y menores a s/.20,000 es: s/."+total2);
		System.out.println("El numero de ventas de s/.20,000 en adelante es: "+c);
		System.out.println("El total de las ventas de s/.20,000 en adelante es: s/."+total3);
		System.out.println("El monto total de la ventas es: s/."+total);
	}


}

