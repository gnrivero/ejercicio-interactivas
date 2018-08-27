package controller;

import java.util.ArrayList;
import java.util.List;

import model.Laboratorio;
import model.Medicamento;
import model.Venta;
import observer.Observable;
import view.MedicamentoView;

public class Farmacia extends Observable {
	
	private static Farmacia instance;
	
    private List<Medicamento> medicamentos;
    private List<Venta> ventas;
   
    public static Farmacia getInstance(){
    	if(instance == null)
    		instance = new Farmacia();
    	
    	return instance;
    }
    
    private Farmacia() {
    	medicamentos = new ArrayList<Medicamento>();
    	ventas = new ArrayList<Venta>();
    }
    
    public void agregarLaboratorio(String codigo, String nombre, String descripcion, float precioBase) {
        Medicamento laboratorio = new Laboratorio();
        laboratorio.setCodigo(codigo);
    	laboratorio.setNombre(nombre);
    	laboratorio.setDescripcion(descripcion);
    	laboratorio.setPrecioBase(precioBase);
    	
    	medicamentos.add(laboratorio);
    	
    	this.updateObserver(laboratorio.getCodigo());
    }
    
    public List<MedicamentoView> loadMedicamentos(){
    	
    	List<MedicamentoView> views = new ArrayList<MedicamentoView>();
    	
    	for (Medicamento med : medicamentos){
    		views.add(med.toView());
    	}    	
    	
    	return views;
    }
    
    public void agregarGenerico(String codigo, String nombre, String descripcion, float precioBase) {
        // TODO implement here        
    }
 
    public void agregarComponente(String codigo, String droga, float cantidad) {
    	Medicamento medicamento = buscarMedicamento(codigo);
    	medicamento.agregarComponente(droga, cantidad);
    }
    
    public int nuevaVenta(String codigo, int cantidad) {
        // TODO implement here
        return 0;
    }

    public void agregarItemVenta(String codigo, int cantidad, int venta) {
        // TODO implement here
    }
     
    public float cerrarVenta(int venta) {
        // TODO implement here
        return 0.0f;
    }

    private Venta buscarVenta(int venta) {
        // TODO implement here
        return null;
    }

    private Medicamento buscarMedicamento(String codigo) {

    	for (Medicamento medicamento : medicamentos){
    		if (medicamento.soy(codigo)){
    			return medicamento;
    		}
    	}
    	
        return null;
    }
    
    public MedicamentoView buscarMedicamentoView(String codigo){
    	return buscarMedicamento(codigo).toView();
    }
    
}