package model;

/**
 * @author Claudio
 */
public class Componente {
	
    private String droga;
    private float cantidad ;

    public Componente() {
    	
    }

	public String getDroga() {
		return droga;
	}

	public void setDroga(String droga) {
		this.droga = droga;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}


}