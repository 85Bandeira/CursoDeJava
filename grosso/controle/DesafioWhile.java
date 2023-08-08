package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		
		Scanner entra = new Scanner(System.in);
		
		int quantidade = 0;
		double nota = 0;
		double total = 0;
		 
		while(nota != -1) {
		System.out.println("Informe a nota do aluno: ");
		nota = entra.nextDouble();
		
		if (nota <= 10 && nota >= 0) {
			total += nota;
			quantidade ++;
		}else  if (nota != -1) {
			System.out.println("Infome uma nota válida.");
		  }
		}
		
		double media = total/quantidade ;
		System.out.println("A média é : " + media);
		
		entra.close();
		
		/*
		Scanner entrada = new Scanner(System.in);
		int quantidade = 0;
		double nota = 0;
		double total = 0;
		//estrutura para repetição do laço
		while(nota != -1) {
			System.out.printf("Informe a nota ou -1 para sair: ");
			nota = entrada.nextDouble();
			
			
			// condiçaõ para validar a nota
			if (nota <= 10 && nota >=0 ) {
				total += nota;
				quantidade ++;
		   }else if (nota != -1) {
			   System.out.println("Informe uma nota válida.");
		   }
			
		}
		//calcular a média
		double media = total / quantidade;
		System.out.println("A média = " + media);
		
		System.out.println("\nPrograma finalizado!");
		
		entrada.close();
		*/
	}

}
