package fundamentos.Exercicios;

import java.util.Scanner;

public class ExerciciosFParaC {

	public static void main(String[] args) {
		
		System.out.println("       CONVERSÃO FARENHEIT/CELSIUS   ");
		
		final int far = 32;
		final double cal = 5.0/9.0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a temperatura em Farenheit: ");
		double tempF = entrada.nextDouble();
		double celsius = (tempF - far) * cal;
		
		System.out.println("A temperatura de " + tempF 
			  + "F  é de: " + celsius +"C");
		entrada.close();		
	}
}
