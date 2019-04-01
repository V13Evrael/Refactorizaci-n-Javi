package ejercicios;

public class Refactorizacion {
	public double calcularPrecio(int unidades, double precioUnitario) {
		double precioSinIVA = unidades * precioUnitario;
		double precioConIVA = precioSinIVA * 21 / 100;
		return precioConIVA;
	}
}
