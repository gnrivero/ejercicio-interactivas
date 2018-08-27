package gui;

import java.awt.Container;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import controller.Farmacia;
import observer.Observer;
import view.MedicamentoView;

public class CargaVentaFront extends JFrame implements Observer{

	private static final long serialVersionUID = 4970643735955275065L;
	
	private JComboBox<MedicamentoView> cmbMedicamentos;
	
	private static CargaVentaFront instance;
	
	public static CargaVentaFront getInstance(){
		if(instance==null)
			instance = new CargaVentaFront();
		
		return instance;
	}
	
	private CargaVentaFront(){		
		configure();
		events();		
		Farmacia.getInstance().addObserver(this);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void configure(){		
		Container cont = this.getContentPane();
		cont.setLayout(null);		
		cmbMedicamentos = new JComboBox<MedicamentoView>();			
		cmbMedicamentos.setBounds(20, 20, 200, 30);
		
		List<MedicamentoView> views = Farmacia.getInstance().loadMedicamentos();
		views.forEach(v -> cmbMedicamentos.addItem(v));
		
		cont.add(cmbMedicamentos);		
	}
	
	public void events(){
		
	}
	
	@Override
	public void update(String dato) {
		
		MedicamentoView med = Farmacia.getInstance().buscarMedicamentoView(dato);
		
		cmbMedicamentos.addItem(med);	
	}

}
