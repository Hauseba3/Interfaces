package ListaEje2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalcularPromedio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtResultado;
	private JLabel lblTitulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcularPromedio frame = new CalcularPromedio();
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
	public CalcularPromedio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[60.00,grow][90.00,grow][][][grow][grow][52.00][85.00,grow][grow]", "[][grow][][][][][][][][]"));
		
		lblTitulo = new JLabel("CALCULAR PROMEDIO");
		lblTitulo.setOpaque(true);
		lblTitulo.setBackground(Color.BLACK);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitulo, "cell 0 0 9 4,grow");
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNombre, "cell 0 4,alignx left");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 1 4 8 1,growx");
		txtNombre.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota1:");
		lblNota1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNota1, "cell 0 5,alignx left");
		
		txtNota1 = new JTextField();
		txtNota1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtNota1, "cell 1 5,growx");
		txtNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota2:");
		lblNota2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNota2, "cell 3 5,alignx trailing");
		
		txtNota2 = new JTextField();
		txtNota2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtNota2, "cell 5 5,growx");
		txtNota2.setColumns(10);
		
		JLabel lblNota3 = new JLabel("Nota3:");
		lblNota3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNota3, "cell 6 5,alignx trailing");
		
		txtNota3 = new JTextField();
		txtNota3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtNota3, "cell 7 5 2 1,growx");
		txtNota3.setColumns(10);
		
		txtPromedio = new JTextField();
		txtPromedio.setEditable(false);
		txtPromedio.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(txtPromedio, "cell 0 8 9 1,growx");
		txtPromedio.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(txtResultado, "cell 0 9 9 1,growx");
		txtResultado.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double promedio=0;
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				double nota3 = Double.parseDouble(txtNota3.getText());
				
				promedio = (nota1+nota2+nota3)/3;
				
				String media = String.valueOf(promedio);
				txtPromedio.setText("Promedio: " + media);
				
				if(promedio > 5) {
					txtResultado.setText("Resultado: Ha aprobado la asignatura");
				} else {
					txtResultado.setText("Resultado: Toca recuperar");
				}
			}
		});
		btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(btnCalcular, "cell 6 7 2 1,alignx center");
		
		
	}

}
