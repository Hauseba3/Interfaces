package ListaEje2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversionMonedasDesplegable extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtResultado;
	private JLabel lblTitulo;
	private JLabel lblMoneda;
	private JComboBox cbbMoneda;
	private JLabel lblCantidad;
	private JLabel lblCambio;
	private JComboBox cbbCambio;
	private JLabel lblResultado;
	
	double euro, dolar, yen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversionMonedasDesplegable frame = new ConversionMonedasDesplegable();
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
	public ConversionMonedasDesplegable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][][grow][][][][]", "[][][][][][][][][]"));
		
		lblTitulo = new JLabel("Converi\u00F3n de Monedas");
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(lblTitulo, "cell 0 0 9 1,alignx center");
		
		lblMoneda = new JLabel("De:");
		lblMoneda.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblMoneda, "cell 1 2,alignx right");
		
		cbbMoneda = new JComboBox();
		cbbMoneda.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una moneda", "D\u00F3lares", "Euros", "Yenes"}));
		cbbMoneda.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(cbbMoneda, "cell 2 2 4 1,growx");
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblCantidad, "cell 1 3");
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtCantidad, "cell 2 3 4 1,growx");
		txtCantidad.setColumns(10);
		
		lblCambio = new JLabel("A:");
		lblCambio.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblCambio, "cell 1 7,alignx trailing");
		
		cbbCambio = new JComboBox();
		cbbCambio.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una moneda", "D\u00F3lares", "Euros", "Yenes"}));
		cbbCambio.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(cbbCambio, "cell 2 7 4 1,growx");
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblResultado, "cell 3 8,alignx trailing");
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtResultado, "cell 4 8,growx");
		txtResultado.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnCalcular, "cell 3 5 2 1,alignx center");
		
		
	}
	
	

}
