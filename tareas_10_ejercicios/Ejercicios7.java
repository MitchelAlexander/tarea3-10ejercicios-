package tareas_10_ejercicios;


import java.io.*;

public class Ejercicios7 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double billetes_de_100;
		double billetes_de_1000;
		double billetes_de_20;
		double billetes_de_200;
		double billetes_de_50;
		double billetes_de_500;
		double monedas_de_1;
		double monedas_de_10;
		double monedas_de_2;
		double monedas_de_20;
		double monedas_de_5;
		double total;
		System.out.print("Ingresa el valor de billetes de 100:");
		billetes_de_100 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de billetes de 1000:");
		billetes_de_1000 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de billetes de 20:");
		billetes_de_20 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de billetes de 200:");
		billetes_de_200 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de billetes de 50:");
		billetes_de_50 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de billetes de 500:");
		billetes_de_500 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de monedas de 1:");
		monedas_de_1 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de monedas de 10:");
		monedas_de_10 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de monedas de 2:");
		monedas_de_2 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de monedas de 20:");
		monedas_de_20 = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de monedas de 5:");
		monedas_de_5 = Double.parseDouble(bufEntrada.readLine());
		total = billetes_de_1000*1000+billetes_de_500*500+billetes_de_200*200+billetes_de_100*100+billetes_de_50*50+billetes_de_20*20+monedas_de_20*20+monedas_de_10*10+monedas_de_5*5+monedas_de_2*2+monedas_de_1;
		System.out.println("Valor de total: "+total);
	}


}

