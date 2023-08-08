package fundamentos.Exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	public static void main(String[] args) {
		
	Scanner num = new Scanner(System.in);
	
	System.out.println("   EQUAÇÃO DO SEGUNDO GRAU ");
	
	System.out.println("Iforme o valor de a: ");
	int a = num.nextInt();
	
	System.out.println("Iforme o valor de b: ");
	int b =  num.nextInt();;
	
	System.out.println("Iforme o valor de c: ");
	int c =  num.nextInt();;
	
	double delta = (b * b)- 4 * (a * c);
	
	System.out.println("O valor de delta da equação é " + delta);
	num.close();
		}
}
