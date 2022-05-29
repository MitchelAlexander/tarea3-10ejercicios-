package tareas_10_ejercicios;

import java.io.*;

public class Ejercicios3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int blanco;
		int color;
		int n;
		int rojo;
		int verde;
		System.out.println("Ingresa la cantidad de focos");
		n = Integer.parseInt(bufEntrada.readLine());
		verde = 0;
		blanco = 0;
		rojo = 0;
		while (n>0) {
			System.out.println("Selecciona un color");
			System.out.println("1 = verde");
			System.out.println("2 = blanco");
			System.out.println("3 = rojo");
			color = Integer.parseInt(bufEntrada.readLine());
			if (color>=1 && color<=3) {
				if (color==1) {
					verde = verde+1;
				} else {
					if (color==2) {
						blanco = blanco+1;
					} else {
						rojo = rojo+1;
					}
				}
				n = n-1;
			} else {
				System.out.println("Ingresa un color correcto");
			}
		}
		System.out.println("El total de focos verdes es: "+verde);
		System.out.println("El total de focos blancos es: "+blanco);
		System.out.println("EL total de focos rojos es:"+rojo);
	}


}

