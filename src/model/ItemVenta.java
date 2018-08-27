package model;

/**
 * @author Claudio
 */
public class ItemVenta {

	private Medicamento medicamento;
    private int cantidad;
   
    public ItemVenta() {
    
    }

    public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
     * @return
     */
    public float calcularSubTotal() {
        // TODO implement here
        return 0.0f;
    }

}