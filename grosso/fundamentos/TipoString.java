package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		String s = "Boa tarde";
		System.out.println(s.concat("!!!")); // adiciona !!!
		System.out.println(s + "!!!");	// mesma função do .concat
		System.out.println(s.startsWith("Boa")); // inicia com V/F
		System.out.println(s.toLowerCase().startsWith("boa")); // torna tudo minusculo e inicia com ()
		System.out.println(s.toUpperCase().endsWith("TARDE")); // torna tudo maiúsculo e inicia com ()
		System.out.println(s.length()); // tamanho da string
		System.out.println(s.toLowerCase().equals("boa tarde")); //torna tudo minúsculo e compara
		System.out.println(s.equalsIgnoreCase("boa tarde")); // ignora e compara
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String umaFrase = "nome: " + nome + "\nsobrenome: " + sobrenome 
		           + "\nidade: " + idade + "\nsalario: " + salario + "\n\n";
		
		System.out.println(umaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha  R$ %.2f. de salário", nome, sobrenome, idade, salario);
		
	}

}
