package ListaEje2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AceptarCondiciones extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup bgCondiciones = new ButtonGroup();
	private JRadioButton nrbNoaceptar;
	private JRadioButton nrbAceptar;
	private JTextPane txtpnHolaMeLlamo;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AceptarCondiciones frame = new AceptarCondiciones();
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
	public AceptarCondiciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow][][][]", "[][][][grow][][][][][]"));
		
		JLabel lblTitulo = new JLabel("Aceptar las condiciones del servicio");
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblTitulo, "cell 0 0 7 1");
		
		JLabel lblAcuerdo = new JLabel("Acuerdo de licencia");
		lblAcuerdo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblAcuerdo, "cell 0 1");
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 2 7 4,grow");
		
		txtpnHolaMeLlamo = new JTextPane();
		txtpnHolaMeLlamo.setEditable(false);
		txtpnHolaMeLlamo.setText("hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose hola me llamo jose ");
		scrollPane.setViewportView(txtpnHolaMeLlamo);
		
		
		nrbAceptar = new JRadioButton("Aceptar Condiciones del Servicio");
		bgCondiciones.add(nrbAceptar);
		nrbAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbAceptar, "cell 0 6");
		
		nrbNoaceptar = new JRadioButton("No aceptar");
		bgCondiciones.add(nrbNoaceptar);
		nrbNoaceptar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbNoaceptar, "cell 0 7");
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nrbAceptar.isSelected()) {
					JOptionPane.showMessageDialog(null, "Pasa por caja...");
				} else if(nrbNoaceptar.isSelected()) {
					JOptionPane.showMessageDialog(null, "¿Estas seguro?");
				} else {
					JOptionPane.showMessageDialog(null, "Debe elegir alguna opcion", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnSiguiente.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnSiguiente, "cell 2 8 2 1");
	}

}
