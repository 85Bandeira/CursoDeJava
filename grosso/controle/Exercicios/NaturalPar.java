package controle.Exercicios;

import java.util.Scanner;

public class NaturalPar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
			System.out.println("Informe um número: ");
			int num = entrada.nextInt();
			if (num >= 0 && num <= 10) {
				System.out.printf("O número " + num + " está entre 0 e 10 ");
				if (num % 2 == 0) {
					System.out.print(" é par");
				}else {
					System.out.println(" é ímpar");
				}
			}else {
				System.out.println("Tente outra vez!");
			}
		
		entrada.close();		
	}

}
