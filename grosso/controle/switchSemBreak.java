package controle;

public class switchSemBreak {

	public static void main(String[] args) {

		String faixa = "amarela";
		
		switch (faixa.toLowerCase()){
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o tekki shodan");
		case "roxa":
			System.out.println("sei o heian Godan");
		case "verde":
			System.out.println("sei o heian Yodan");
		case "laranja":
			System.out.println("sei o heian Sandan");
		case "vermelha":
			System.out.println("sei o heian Nidan");
		case "amarela":
			System.out.println("sei o heian Shodan");
			break;
			default:
				System.out.println("Nao sei nada");
		}
		System.out.println("Fim!");
		
		int idade = 0;
			
		switch (idade) {
		case 3:
			System.out.println("sabe programar");
		case 2:
			System.out.println("sabe falar");
		case 1:
			System.out.println("sabe andar");
		case 0:
			System.out.println("sabe respirar");
		}
		
	}

}
