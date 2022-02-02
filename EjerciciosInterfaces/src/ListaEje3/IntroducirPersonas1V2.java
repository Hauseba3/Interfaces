package ListaEje3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class IntroducirPersonas1V2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtApellidos;
	private JTextField txtDia;
	private JTextField txtNombre;
	private JTextField txtMes;
	private JTextField txtAño;
	private JTextArea txtPersona;
	private JLabel lblPersona;
	private JLabel lblFecha3;
	private JLabel lblFecha2;
	private JLabel lblFecha;
	private JLabel lblApellidos;
	private JLabel lblNombre;
	private JLabel lblDNI;
	private JLabel lblTitulo;
	
	
	private ArrayList <Persona> listaPersonas;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroducirPersonas1V2 frame = new IntroducirPersonas1V2();
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
	public IntroducirPersonas1V2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][grow][][][][][][][][][grow][][grow][][][grow][grow]", "[][][][][][][grow]"));
		
		listaPersonas = new ArrayList <Persona> ();
		
		
		lblTitulo = new JLabel("Introducir Personas");
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(lblTitulo, "cell 0 0 11 1");
		
		lblDNI = new JLabel("DNI:");
		lblDNI.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblDNI, "cell 0 1,alignx trailing");
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtDni, "cell 3 1 5 1,growx");
		txtDni.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNombre, "cell 10 1,alignx right");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtNombre, "cell 11 1 11 1,growx");
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblApellidos, "cell 0 2,alignx trailing");
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtApellidos, "cell 3 2 19 1,growx");
		txtApellidos.setColumns(10);
		
		lblFecha = new JLabel("Fecha Nacimiento:");
		lblFecha.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblFecha, "cell 0 3,alignx trailing");
		
		txtDia = new JTextField();
		txtDia.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtDia, "cell 3 3,growx");
		txtDia.setColumns(10);
		
		lblFecha2 = new JLabel("/");
		lblFecha2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblFecha2, "cell 4 3,alignx trailing");
		
		txtMes = new JTextField();
		txtMes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtMes, "cell 7 3,growx");
		txtMes.setColumns(10);
		
		lblFecha3 = new JLabel("/");
		lblFecha3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblFecha3, "cell 8 3,alignx trailing");
		
		txtAño = new JTextField();
		txtAño.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtAño, "cell 10 3 2 1,growx");
		txtAño.setColumns(10);
		
		lblPersona = new JLabel("Persona:");
		lblPersona.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblPersona, "cell 0 5,alignx right,aligny top");
		
		txtPersona = new JTextArea();
		txtPersona.setFont(new Font("Monospaced", Font.PLAIN, 14));
		contentPane.add(txtPersona, "cell 1 5 21 2,grow");
		
		JButton btnIntroducir = new JButton("Introducir");
		btnIntroducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDni.getText().equals("") || txtNombre.getText().equals("") || txtApellidos.getText().equals("") || 
					txtDia.getText().equals("") || txtMes.getText().equals("") || txtAño.getText().equals("")) {
					
					
					JOptionPane.showMessageDialog(null, "Debes introducir todos los datos!", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
					
				} else {
					
					Persona per = new Persona();
					per.setNombre(txtNombre.getText());
					per.setApellidos(txtApellidos.getText());
					per.setFechaNac(Integer.parseInt(txtDia.getText()), Integer.parseInt(txtMes.getText()), Integer.parseInt(txtAño.getText()));
					per.setDni(txtDni.getText());
					
					listaPersonas.add(per);
					
					for (Persona p : listaPersonas) {
						txtPersona.setText(txtPersona.getText() + "DNI: " + p.getDni() + "\n" + "Nombre: " + p.getNombre() + 
								"\n" + "Apellidos: " + p.getApellidos() + "\n" + "Fecha Na: " + p.getFechaNac() + "\n");
					}

				}
				
			}
		});
		btnIntroducir.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnIntroducir, "cell 7 4");
		
		getRootPane().setDefaultButton(btnIntroducir);
		
		
	}

}
