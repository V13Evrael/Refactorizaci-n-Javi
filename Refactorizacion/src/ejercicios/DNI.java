package ejercicios;

public class DNI {
	public static void main(String[] args) {
		String l = "TRWAGMYFPDXBNJZSQVHLCKE";
		int n = 12345678;
		char letra = l.charAt(n % 23);
		System.out.println("La letra del DNI es " + letra);
	}
}
