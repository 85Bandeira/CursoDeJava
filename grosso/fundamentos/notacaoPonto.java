package fundamentos;

public class notacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X","Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		String y = "bom dia X"
					.replace("X", "Gui")
					.toUpperCase()
					.concat("!!!");
		System.out.println(y);
	}
}
