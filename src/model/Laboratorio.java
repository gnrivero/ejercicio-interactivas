package model;

public class Laboratorio extends Medicamento {

	public static float RECARGO = 0.02f;
	
    public Laboratorio() {
    	
    }

    @Override
    public float calcularPrecio() {
    	return precioBase * (1 + RECARGO);
    }	 

}