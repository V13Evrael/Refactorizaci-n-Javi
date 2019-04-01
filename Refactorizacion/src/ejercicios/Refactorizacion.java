package ejercicios;

public class Refactorizacion {
	public double calcularPrecio(int unidades, double precioUnitario) {
		double precioSinIVA = unidades * precioUnitario;
		return precioSinIVA;
	}
}
