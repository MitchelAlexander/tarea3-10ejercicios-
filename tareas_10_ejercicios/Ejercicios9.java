package tareas_10_ejercicios;

import java.io.*;

public class Ejercicios9 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double descuento;
		double horas_trabajadas;
		double i;
		double n;
		String nombre_del_trabajador;
		double sueldo_por_hora;
		double sueldo_semanal;
		System.out.print("Ingresa el valor de n:");
		n = Double.parseDouble(bufEntrada.readLine());
		for (i=1;i<=n;i++) {
			System.out.println("PROCESO "+i);
			System.out.print("Ingresa el nombre del trabajador:");
			nombre_del_trabajador = bufEntrada.readLine();
			System.out.print("Ingresa el valor de horas trabajadas:");
			horas_trabajadas = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de sueldo por hora:");
			sueldo_por_hora = Double.parseDouble(bufEntrada.readLine());
			sueldo_semanal = horas_trabajadas*sueldo_por_hora;
			descuento = 0;
			if (sueldo_semanal>0 && sueldo_semanal<=150) {
				descuento = sueldo_semanal*0.05;
			}
			if (sueldo_semanal>150 && sueldo_semanal<=300) {
				descuento = sueldo_semanal*0.07;
			}
			if (sueldo_semanal>300 && sueldo_semanal<=450) {
				descuento = sueldo_semanal*0.09;
			}
			sueldo_semanal = sueldo_semanal-descuento;
			System.out.println("Nombre del trabajador: "+nombre_del_trabajador);
			System.out.println("Valor de descuento: "+descuento);
			System.out.println("Valor de sueldo semanal: "+sueldo_semanal);
			System.out.println("");
		}
	}


}

