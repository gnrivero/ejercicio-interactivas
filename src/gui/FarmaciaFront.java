package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FarmaciaFront extends JFrame {

	private static final long serialVersionUID = 2858099459794050656L;
	
	private JButton btnCargarVenta;
	private JButton btnAgregarMedicamentos;
	
	public FarmaciaFront() {
		configure();
		events();

		this.setVisible(true);
		this.setSize(800, 600);
	}
	
	public void configure(){
		
		Container cont = this.getContentPane();		
		cont.setLayout(null);
		
		btnCargarVenta = new JButton("Cargar Nueva Venta");		
		btnCargarVenta.setBounds(20, 20, 150, 30);
		cont.add(btnCargarVenta);
		
		btnAgregarMedicamentos = new JButton("AgregarMedicamentos");
		btnAgregarMedicamentos.setBounds(180, 20, 150, 30);
		cont.add(btnAgregarMedicamentos);		
	}
	
	public void events(){
		
		btnCargarVenta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CargaVentaFront.getInstance().setVisible(true);;
			}
		});
		
		btnAgregarMedicamentos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CargaMedicamentoFront.getInstance().setVisible(true);
			}
		});
		
	}

}