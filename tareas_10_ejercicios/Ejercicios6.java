package tareas_10_ejercicios;


import java.io.*;

public class Ejercicios6 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int alumnos;
		int edad;
		int n;
		int salones;
		int suma;
		int total;
		int x;
		System.out.println("Ingresa el total de salones");
		salones = Integer.parseInt(bufEntrada.readLine());
		while (salones>0) {
			System.out.println("Ingresa el numero de alumnos");
			n = Integer.parseInt(bufEntrada.readLine());
			suma = 0;
			for (x=1;x<=n;x++) {
				System.out.println("Ingresa la edad "+x);
				edad = Integer.parseInt(bufEntrada.readLine());
				suma = suma+edad;
			}
			System.out.println("El promedio del salon "+salones+" es: "+suma/n+" años");
			alumnos = +n;
			total = +suma;
			salones = salones-1;
		}
		System.out.println("El promedio de toda la escuela es: "+total/alumnos+" años");
	}


}

