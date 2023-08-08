package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final int pri = 32;
		final double cal = 5.0/9.0;
		double fahrenheit = 180;
		
		double celsius = (fahrenheit - pri) * cal;
		System.out.println(celsius + " °C");
	}

}
