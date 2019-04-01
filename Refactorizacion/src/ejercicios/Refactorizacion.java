package ejercicios;

public class Refactorizacion {
	private static final int IVA = 21;

	public double calcularPrecioConIVA(int unidades, double precioUnitario) {
		double precioSinIVA = unidades * precioUnitario;
		double precioConIVA = precioSinIVA * IVA / 100;
		return precioConIVA;
	}
}
