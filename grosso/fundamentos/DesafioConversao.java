package fundamentos;

import java.util.Scanner;
public class DesafioConversao {
	public static void main(String[] args) {
		//Locale.setDefault(new Locale("pt", "BR"));
		
		Scanner sal = new Scanner(System.in);
		System.out.println("Informe o primeiro salário: ");
		String sal1 = sal.nextLine().replace(",",".");; 
		
		System.out.println("Informe o segundo salário: ");
		String sal2 = sal.nextLine().replace(",",".");;
		
		System.out.println("Informe o terceiro salário: ");
		String sal3 = sal.nextLine().replace(",",".");;
		
		double sa1 = Double.parseDouble(sal1);
		double sa2 = Double.parseDouble(sal2);
		double sa3 = Double.parseDouble(sal3);
				
		double soma = sa1 + sa2 + sa3;
		System.out.println("A média é: " + soma/3);
		sal.close();
	}

}
