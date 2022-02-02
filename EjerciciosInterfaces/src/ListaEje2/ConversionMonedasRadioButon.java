package ListaEje2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class ConversionMonedasRadioButon extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtResultado;
	private JLabel lblTitulo;
	private JLabel lblMoneda;
	private JRadioButton nrbDolares;
	private JRadioButton nrbEuros;
	private JRadioButton nrbYenes;
	private JLabel lblCantidad;
	private JLabel lblTransformar;
	private JRadioButton nrbDolares2;
	private JRadioButton nrbEuros2;
	private JRadioButton nrbYenes2;
	private JLabel lblResultado;
	private final ButtonGroup BGInicio = new ButtonGroup();
	private final ButtonGroup BGFinal = new ButtonGroup();
	
	double dolar=0, euro=0, yen=0, cantidad=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversionMonedasRadioButon frame = new ConversionMonedasRadioButon();
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
	public ConversionMonedasRadioButon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][][][grow][][][grow][][][][]", "[][][][][][][][][][]"));
		
		lblTitulo = new JLabel("Conversi\u00F3n de Monedas");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(lblTitulo, "cell 0 0 18 1,alignx center");
		
		lblMoneda = new JLabel("De:");
		lblMoneda.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblMoneda, "cell 1 2,alignx right");
		
		nrbDolares = new JRadioButton("D\u00F3lares");
		BGInicio.add(nrbDolares);
		nrbDolares.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbDolares, "cell 2 2");
		
		nrbEuros = new JRadioButton("Euros");
		BGInicio.add(nrbEuros);
		nrbEuros.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbEuros, "flowx,cell 5 2");
		
		nrbYenes = new JRadioButton("Yenes");
		BGInicio.add(nrbYenes);
		nrbYenes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbYenes, "cell 7 2");
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblCantidad, "cell 1 3,alignx trailing");
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtCantidad, "cell 2 3 11 1,growx");
		txtCantidad.setColumns(10);
		

		lblTransformar = new JLabel("A:");
		lblTransformar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblTransformar, "cell 1 7,alignx right");
		
		nrbDolares2 = new JRadioButton("D\u00F3lares");
		BGFinal.add(nrbDolares2);
		nrbDolares2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbDolares2, "cell 2 7");
		
		nrbEuros2 = new JRadioButton("Euros");
		BGFinal.add(nrbEuros2);
		nrbEuros2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbEuros2, "flowx,cell 5 7");
		
		nrbYenes2 = new JRadioButton("Yenes");
		BGFinal.add(nrbYenes2);
		nrbYenes2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbYenes2, "cell 7 7");
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblResultado, "cell 2 9,alignx trailing");
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtResultado, "cell 3 9 9 1,growx");
		txtResultado.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nrbDolares.isSelected()) {
					
					if(nrbEuros2.isSelected()) {
						
						cantidad = Double.parseDouble(txtCantidad.getText());
						euro = cantidad/1.1134;
						String resultado = String.valueOf(euro);
						
						txtResultado.setText(resultado);
						
					} else if(nrbYenes2.isSelected()) {
						
						cantidad = Double.parseDouble(txtCantidad.getText());
						yen = cantidad*115.64;
						String resultado = String.valueOf(yen);
						
						txtResultado.setText(resultado);
						
					} else if (nrbDolares2.isSelected()) {
						JOptionPane.showMessageDialog(null, "Debes elegir dos monedas diferentes!");
					}
	
				}
				
				if(nrbEuros.isSelected()) {
					
					if(nrbDolares2.isSelected()) {
						
						cantidad = Double.parseDouble(txtCantidad.getText());
						dolar = cantidad*1.1134;
						String resultado = String.valueOf(dolar);
						
						txtResultado.setText(resultado);
						
					} else if(nrbYenes2.isSelected()) {
						
						cantidad = Double.parseDouble(txtCantidad.getText());
						yen = cantidad*128.75;
						String resultado = String.valueOf(yen);
						
						txtResultado.setText(resultado);
						
					} else if (nrbEuros2.isSelected()) {
						JOptionPane.showMessageDialog(null, "Debes elegir dos monedas diferentes!");
					}
	
				}
				
				if(nrbYenes.isSelected()) {
					
					if(nrbEuros2.isSelected()) {
						
						cantidad = Double.parseDouble(txtCantidad.getText());
						euro = cantidad*0.00777;
						String resultado = String.valueOf(euro);
						
						txtResultado.setText(resultado);
						
					} else if(nrbDolares2.isSelected()) {
						
						cantidad = Double.parseDouble(txtCantidad.getText());
						dolar = cantidad*0.008645;
						String resultado = String.valueOf(dolar);
						
						txtResultado.setText(resultado);
						
					} else if (nrbYenes2.isSelected()) {
						JOptionPane.showMessageDialog(null, "Debes elegir dos monedas diferentes!");
					}
	
				}
				
				
			}
		});
		btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnCalcular, "cell 5 5,alignx center");
		
	}

}
