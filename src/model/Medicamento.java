package model;

import java.util.List;

import view.MedicamentoView;

public abstract class Medicamento {
	
    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected float precioBase;
    protected List<Componente> composicion;

    public String getCodigo() {
		return codigo;
	}
    
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public float getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}


	public List<Componente> getComposicion() {
		return composicion;
	}


	public void setComposicion(List<Componente> composicion) {
		this.composicion = composicion;
	}


	public abstract float calcularPrecio();


    public void agregarComponente(String droga, float cantidad) {
        Componente comp = new Componente();
        comp.setDroga(droga);
        comp.setCantidad(cantidad);
        
    	this.composicion.add(comp);
    }

    public boolean soy(String codigo) {
        return this.codigo.compareTo(codigo) == 0;
    }
    
    public MedicamentoView toView(){
    	return new MedicamentoView(this.codigo, this.nombre);
    }

}