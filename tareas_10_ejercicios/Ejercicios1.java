package tareas_10_ejercicios;

import java.io.*;

public class Ejercicios1 {

	public static void main(String args[]) {
		double salario;
		int x;
		salario = 1500;
		for (x=1;x<=6;x++) {
			salario = salario+(salario*.10);
			System.out.println("El salario en el año "+x+" es: s/."+salario);
		}
		System.out.println("El salario en 6 años es: s/."+salario);
	}


}

