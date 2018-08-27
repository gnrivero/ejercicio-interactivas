package model;

/**
 * @author Claudio
 */
public class Generico extends Medicamento {

	public static float DESCUENTO = 0.05f;
	
    public Generico() {
    }

    @Override
    public float calcularPrecio() {
    	return precioBase / (1 + DESCUENTO);
    }
}