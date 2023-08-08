package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontoAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445_44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		
		boolean estaDeferias = false; // true
		
		// tipo caractere
		 
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365 + " Dias de empresa.");
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontoAcumulados / vendasAcumuladas);
		
		System.out.println(id + " : ganha -> " + salario);	
		System.out.println("Férias? " + estaDeferias);	
		System.out.println("Status: " + status);
	}
}
