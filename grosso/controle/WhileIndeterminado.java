package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String valor ="";
		while(!valor.equalsIgnoreCase("sair")) {
			
		System.out.printf("Digite o comando: ");
		valor = entrada.nextLine();
		
		}
		System.out.println("Programa finalizado!");
		entrada.close();

	}

}
