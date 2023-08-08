package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
		double a = Math.pow(6 * (3 + 2), 2) ;
		double y = a / (3 * 2);
		
		double c = (1 - 5) * (2 - 7) / 2;
		double z = Math.pow(c, 2);
		
		double g = y - z;
		double j =  Math.pow(g, 3);
		double f =  Math.pow(10, 3);
		double k =  j / f;
				
		
		System.out.println(k);
	}
}
