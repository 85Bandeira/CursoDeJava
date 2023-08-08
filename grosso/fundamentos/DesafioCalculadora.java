package fundamentos;

import java.util.Scanner; 

public class DesafioCalculadora {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe o primeiro número: ");
	double n1 = entrada.nextDouble();
	
	System.out.print("Informe o segundo número: ");
	double n2 = entrada.nextDouble();
	
	System.out.print("Informe o tipo de operação: ");
	String op= entrada.next();
	
	double resultado = "+".equals(op) ? n1 + n2 : 0;
	resultado = "-".equals(op) ? n1 - n2 : resultado;
	resultado = "*".equals(op) ? n1 * n2 : resultado;
	resultado = "/".equals(op) ? n1 / n2 : resultado;
	resultado = "%".equals(op) ? n1 % n2 : resultado;
	
	
	System.out.printf("%.2f %.2s %f = %.2f", n1, op, n2, resultado);
	entrada.close();
	
	
	
	
	
}
}
