package fundamentos.Exercicios;

import java.util.Scanner;

public class areaTriangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Informe a altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		 System.out.println("A área do triângulo de base " + base 
				 + " e altura " + altura + " é igual a " + area);
		 entrada.close();
	}

}
