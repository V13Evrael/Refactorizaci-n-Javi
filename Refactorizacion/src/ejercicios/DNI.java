package ejercicios;

public class DNI {
	private static final String MENSAJE_FINAL = "La letra del DNI es ";
	private static final String LISTA_LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

	public static void main(String[] args) {
		int n = 12345678;
		
		mostrarDNIConLetra(n);
	}

	private static void mostrarDNIConLetra(int dni) {
		char letra = calculaLetraDNI(dni);
		System.out.println(MENSAJE_FINAL + letra);
	}

	private static char calculaLetraDNI(int dni) {
		char letra = LISTA_LETRAS.charAt(dni % 23);
		return letra;
	}
}
