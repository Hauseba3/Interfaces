package ListaEje3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class IntroducirPersonas2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtApellidos;
	private JSpinner txtDia;
	private JTextField txtNombre;
	private JSpinner txtMes;
	private JSpinner txtAño;
	private JTextArea txtPersona;
	private JLabel lblPersona;
	private JLabel lblFecha3;
	private JLabel lblFecha2;
	private JLabel lblFecha;
	private JLabel lblApellidos;
	private JLabel lblNombre;
	private JLabel lblDNI;
	private JLabel lblTitulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroducirPersonas2 frame = new IntroducirPersonas2();
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
	public IntroducirPersonas2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][grow][][][][][][][][][grow][][grow][][][grow][grow]", "[][][][][][][grow]"));
		
		lblTitulo = new JLabel("Introducir Personas");
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(lblTitulo, "cell 0 0 12 1");
		
		lblDNI = new JLabel("DNI:");
		lblDNI.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblDNI, "cell 0 1,alignx trailing");
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtDni, "cell 3 1 6 1,growx");
		txtDni.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNombre, "cell 11 1,alignx right");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtNombre, "cell 12 1 11 1,growx");
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblApellidos, "cell 0 2,alignx trailing");
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtApellidos, "cell 3 2 20 1,growx");
		txtApellidos.setColumns(10);
		
		lblFecha = new JLabel("Fecha Nacimiento:");
		lblFecha.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblFecha, "cell 0 3,alignx trailing");
		
		txtDia = new JSpinner();
		txtDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		txtDia.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtDia, "cell 3 3 3 1,growx");
		
		lblFecha2 = new JLabel("/");
		lblFecha2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblFecha2, "cell 6 3,alignx trailing");
		
		txtMes = new JSpinner();
		txtMes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		txtMes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtMes, "cell 8 3,growx");
		
		lblFecha3 = new JLabel("/");
		lblFecha3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblFecha3, "cell 9 3,alignx trailing");
		
		txtAño = new JSpinner();
		txtAño.setModel(new SpinnerNumberModel(0, null, 2022, 1));
		txtAño.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtAño, "cell 11 3 2 1,growx");
		
		lblPersona = new JLabel("Persona:");
		lblPersona.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblPersona, "cell 0 5,alignx right,aligny top");
		
		txtPersona = new JTextArea();
		txtPersona.setFont(new Font("Monospaced", Font.PLAIN, 14));
		contentPane.add(txtPersona, "cell 1 5 22 2,grow");
		
		JButton btnIntroducir = new JButton("Introducir");
		btnIntroducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDni.getText().equals("") || txtNombre.getText().equals("") || txtApellidos.getText().equals("") || 
					txtDia.getValue().equals("") || txtMes.getValue().equals("") || txtAño.getValue().equals("")) {
					
					
					JOptionPane.showMessageDialog(null, "Debes introducir todos los datos!", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
					
				} else {
					
					Persona p = new Persona();
					p.setNombre(txtNombre.getText());
					p.setApellidos(txtApellidos.getText());
					p.setFechaNac(Integer.parseInt(txtDia.getValue().toString()), Integer.parseInt(txtMes.getValue().toString()), Integer.parseInt(txtAño.getValue().toString()));
					p.setDni(txtDni.getText());
					
					txtPersona.setText("DNI: " + p.getDni() + "\n" + "Nombre: " + p.getNombre() + "\n" + "Apellidos: " + p.getApellidos() + "\n" + "Fecha Na: " + p.getFechaNac());
					
				}
				
			}
		});
		btnIntroducir.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnIntroducir, "cell 8 4");
		
		
	}

}
