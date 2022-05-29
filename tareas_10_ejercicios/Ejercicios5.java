package tareas_10_ejercicios;


import java.io.*;

public class Ejercicios5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cantidad_01_enero;
		double cantidad_02_febrero;
		double cantidad_03_marzo;
		double cantidad_04_abril;
		double cantidad_05_mayo;
		double cantidad_06_junio;
		double cantidad_07_julio;
		double cantidad_08_agosto;
		double cantidad_09_septiembre;
		double cantidad_10_octubre;
		double cantidad_11_noviembre;
		double cantidad_12_diciembre;
		double i;
		double intereses;
		double inversion_final;
		double n;
		double total;
		total = 0;
		System.out.print("Ingresa el valor de n:");
		n = Double.parseDouble(bufEntrada.readLine());
		for (i=1;i<=n;i++) {
			System.out.println("PROCESO "+i);
			System.out.print("Ingresa el valor de cantidad 01 enero:");
			cantidad_01_enero = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 02 febrero:");
			cantidad_02_febrero = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 03 marzo:");
			cantidad_03_marzo = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 04 abril:");
			cantidad_04_abril = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 05 mayo:");
			cantidad_05_mayo = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 06 junio:");
			cantidad_06_junio = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 07 julio:");
			cantidad_07_julio = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 08 agosto:");
			cantidad_08_agosto = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 09 septiembre:");
			cantidad_09_septiembre = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 10 octubre:");
			cantidad_10_octubre = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 11 noviembre:");
			cantidad_11_noviembre = Double.parseDouble(bufEntrada.readLine());
			System.out.print("Ingresa el valor de cantidad 12 diciembre:");
			cantidad_12_diciembre = Double.parseDouble(bufEntrada.readLine());
			intereses = total*0.1;
			total = total+intereses+cantidad_01_enero+cantidad_02_febrero+cantidad_03_marzo+cantidad_04_abril+cantidad_05_mayo+cantidad_06_junio+cantidad_07_julio+cantidad_08_agosto+cantidad_09_septiembre+cantidad_10_octubre+cantidad_11_noviembre+cantidad_12_diciembre;
			inversion_final = total;
			System.out.println("Valor de intereses: "+intereses);
			System.out.println("Valor de inversion final: "+inversion_final);
			System.out.println("");
		}
		System.out.println("Valor de total: "+total);
	}


}

