package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		// conversão implícita 
		double a = 1;
		System.out.println(a);
		
		// conversão explicita (CAST) 
		float b = (float) 1.1234567898887;
		System.out.println(b);
		
		int c = 340;
		byte d = (byte)c;
		System.out.println(d);
		
		double e = 1.999;
		int f = (int) e;
		System.out.println(f);
		
		
		
	}

}
