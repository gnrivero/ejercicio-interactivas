package model;

import java.util.Date;
import java.util.List;

public class Venta {

    private static int numerador;
    private int numero;
    private Date fecha;
    private List<ItemVenta> items;
    
    public Venta() {
    
    }
    
    public void agregarItem(Medicamento medicamento, int cantidad) {
        // TODO implement here
    }

    public float cerrarVenta() {
        // TODO implement here
        return 0.0f;
    }
    
}