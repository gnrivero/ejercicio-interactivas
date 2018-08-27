package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import controller.Farmacia;
import observer.Observer;

public class CargaMedicamentoFront extends JFrame implements Observer{
	
	private static final long serialVersionUID = 7631068008766374336L;
	
	private static CargaMedicamentoFront instance;
	
	private JTextArea txtCodigo;
	private JTextArea txtNombre;
	private JTextArea txtDescripcion;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblDescripcion;
	private JButton btnAgregar;
	
	private CargaMedicamentoFront(){
		
		configure();
		events();

		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	public static CargaMedicamentoFront getInstance(){
		if (instance == null)
			instance = new CargaMedicamentoFront();
		
		return instance;
	}
	
	public void configure(){
		Container cont = this.getContentPane();
		cont.setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblNombre = new JLabel("Nombre");
		lblDescripcion = new JLabel("Descripcion");
		
		lblCodigo.setBounds(20, 20, 100, 30);
		lblNombre.setBounds(20, 60, 100, 30);
		lblDescripcion.setBounds(20, 100, 100, 30);
		
		txtCodigo = new JTextArea();
		txtNombre = new JTextArea();
		txtDescripcion = new JTextArea();
		
		txtCodigo.setBounds(130, 20, 100,30);
		txtNombre.setBounds(130, 60, 100,30);
		txtDescripcion.setBounds(130, 100, 100,30);

		btnAgregar = new JButton("Agregar");
		
		btnAgregar .setBounds(60, 140, 100, 30);
		
		cont.add(lblCodigo);
		cont.add(lblNombre);
		cont.add(lblDescripcion);
		
		cont.add(txtCodigo);
		cont.add(txtNombre);
		cont.add(txtDescripcion);
		
		cont.add(btnAgregar);		
	}
	
	public void events(){
		
		btnAgregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String codigo = txtCodigo.getText();
				String nombre = txtNombre.getText(); 
				String descripcion = txtDescripcion.getText();
				float precioBase = 450.00f; //TODO: deshardcodear el precio				
				
				Farmacia.getInstance().agregarLaboratorio(codigo, nombre, descripcion, precioBase);				
			}
		});
		
	}

	
	@Override
	public void update(String dato) {
		
	}

}
