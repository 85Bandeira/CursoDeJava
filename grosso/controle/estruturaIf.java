package controle;

import java.util.Scanner;

public class estruturaIf {
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) { 
			System.out.println("Aprovado!");
			System.out.println();
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação!");
		}
			boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;
			
		if(criterioReprovacaoAtingido) {
			System.out.println("Reprovado!");
		}
		entrada.close();
		
		// um bloco de código pode ser salva dentro de uma variável
	}

}
