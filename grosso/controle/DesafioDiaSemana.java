package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		System.out.println("DESAFIO DIA DA SEMANA");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o dia da semana: ");
		 String dia = entrada.next();
		 /*como é apenas uma palavra o next é o 
		 suficiente, caso fossem multiplas palavras seria o nextLine
		 */
		 
		 if ("domingo".equalsIgnoreCase(dia)) {
			 System.out.println("DIA 1");
			 //IgnoreCase para ignorar letras maiúsculas
			 
		 }else if ("segunda".equalsIgnoreCase(dia)){
			 System.out.println("DIA 2");
			 
		 }else if ("terça".equalsIgnoreCase(dia)
				 ||"terca".equalsIgnoreCase(dia)){
			 System.out.println("DIA 3");
			 
		 }else if ("quarta".equalsIgnoreCase(dia)){
			 System.out.println("DIA 4");
			 
		 }else if ("quinta".equalsIgnoreCase(dia)){
			 System.out.println("DIA 5");
			 
		 }else if ("sexta".equalsIgnoreCase(dia)){
			 System.out.println("DIA6");
			 
		 }else if ("sábado".equalsIgnoreCase(dia)
				 ||"sabado".equalsIgnoreCase(dia)) {
			 System.out.println("DIA 7");
			 
		 } else {
			 System.out.println("Dia inválido!");
		 }
		 System.out.println("FIM!");
		entrada.close();
	}

}
