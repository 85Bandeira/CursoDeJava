package fundamentos.Exercicios;

import java.util.Scanner;

public class ExercicioCParaF {
	
	public static void main(String[] args) {
		
	System.out.println("       CONVERSÃO CELSIUS/FARENHEIT  ");
		
		final int far = 32;
		final double cal = 9.0/5.0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a temperatura em Celsius: ");
		double tempC = entrada.nextDouble();
		double farenheit = (tempC * cal) + far;
		
		System.out.println("A temperatura de " + tempC 
			  + "C  é de: " + farenheit +"F");
		entrada.close();	
	}

}
