package fundamentos.Exercicios;

import java.util.Scanner;

public class ExercicioIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o peso:");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite a altura:");
		double altura = scanner.nextDouble();
		
		double IMC =  peso / (altura * altura) ;
		
		// formatação do numero decimal com printf
		System.out.println("O IMC do paciente é " + IMC);
		
		scanner.close();
	}
}
