package ListaEje4;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class VentanaProfesores extends JFrame {

	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtSalario;
	private final ButtonGroup grupo = new ButtonGroup();
	private Container lblDni;
	private JLabel lblNombre;
	private JPanel panel;
	private JRadioButton nrbFijo;
	private JRadioButton nrbTemporal;
	private JLabel lblSalario;
	private JButton btnAñadir;
	private JButton btnLimpiar;
	private JButton btnBuscar;
	private JButton btnSalir;
	private ArrayList<Profesor> listaProfesores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaProfesores frame = new VentanaProfesores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaProfesores() {
		
		listaProfesores = new ArrayList<Profesor>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][]", "[][][][][][][][]"));
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblDni, "cell 0 0,alignx trailing");
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtDni, "cell 1 0 4 1,growx");
		txtDni.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNombre, "cell 0 1,alignx trailing");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtNombre, "cell 1 1 4 1,growx");
		txtNombre.setColumns(10);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limpiar();
				
			}
		});
		
		btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				añadir();
				
			}
		});
		btnAñadir.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnAñadir, "cell 8 1,alignx center");
		btnLimpiar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnLimpiar, "cell 8 2,alignx center");
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buscar();
				
			}
		});
		btnBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnBuscar, "cell 8 4,alignx center");
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnSalir, "cell 8 5,alignx center");
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tipo de contrato", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel, "cell 1 6,grow");
		panel.setLayout(new MigLayout("", "[]", "[][]"));
		
		nrbFijo = new JRadioButton("Fijo");
		nrbFijo.setSelected(true);
		nrbFijo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		grupo.add(nrbFijo);
		panel.add(nrbFijo, "cell 0 0");
		
		nrbTemporal = new JRadioButton("Temporal");
		nrbTemporal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		grupo.add(nrbTemporal);
		panel.add(nrbTemporal, "cell 0 1");
		
		lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblSalario, "cell 0 2,alignx trailing");
		
		txtSalario = new JTextField();
		txtSalario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtSalario, "cell 1 2 4 1,growx");
		txtSalario.setColumns(10);
		
		
	}

	protected void buscar() {
		
		if(txtDni.getText()==null || txtDni.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Debes rellenar el DNI", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		} else {
			
			/* OTRA FORMA DE HACERLO
			Profesor p = new Profesor();
			p.setDni(txtDni.getText());
			
			int indice=listaProfesores.indexOf(p);
			if (indice>0) {
				p=listaProfesores.get(indice);
			}*/
			
			
			String dni = txtDni.getText();
			for (Profesor profesor : listaProfesores) {
				String dniprofesor = profesor.getDni();
				
				if(dni.equals(dniprofesor)) {
					txtNombre.setText(profesor.getNombre());
					txtSalario.setText(String.valueOf(profesor.getSalario()));
					
					if(profesor.isFijo()) {
						nrbFijo.setSelected(true);;
					} else {
						nrbTemporal.setSelected(true);;;
					}
				}
			}
			
			
		}
		
	}

	protected void limpiar() {
		
		txtDni.setText(null);
		txtNombre.setText(null);
		txtSalario.setText(null);
		grupo.clearSelection();
		
		
	}

	protected void añadir() {
		
		if(txtDni.getText()==null || txtDni.getText().equals("") || txtNombre.getText()==null || txtNombre.getText().equals("") || 
				txtSalario.getText()==null || txtSalario.getText().equals("")) {
			
			JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
			
		} else {
			
			Profesor p = new Profesor();
			
			p.setDni(txtDni.getText());
			p.setNombre(txtNombre.getText());
			p.setSalario(Double.parseDouble(txtSalario.getText()));
			
			if(nrbFijo.isSelected()) {
				p.setFijo(true);
			} else {
				p.setFijo(false);
			}
			
			if(!listaProfesores.contains(p)) {
				listaProfesores.add(p);
			} else {
				JOptionPane.showMessageDialog(null, "Ya existe un profesor con ese DNI", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		
	}

}
