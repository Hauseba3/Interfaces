package ListaEje2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CiudadCombobox extends JFrame {

	private JPanel contentPane;
	private JTextField txtSeleccionado;
	private JLabel lblCiudad;
	private JComboBox cbbCiudad;
	private JLabel lblSeleccionado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CiudadCombobox frame = new CiudadCombobox();
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
	public CiudadCombobox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][][][grow]", "[][][][][][][][]"));
		
		lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Times New Roman", Font.BOLD, 16));
		contentPane.add(lblCiudad, "cell 3 1,alignx right");
		
		cbbCiudad = new JComboBox();
		cbbCiudad.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una ciudad", "La Rambla", "Montilla", "Fernan Nu\u00F1ez", "Aguilar", "Lucena", "Montalban", "Santaella", "Montemayor", "San Sebastian", "Puente Genil", "La Montiela"}));
		cbbCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(cbbCiudad, "cell 4 1 7 1,growx");
		
		lblSeleccionado = new JLabel("Has seleccionado:");
		lblSeleccionado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblSeleccionado, "cell 2 5 2 1");
		
		txtSeleccionado = new JTextField();
		txtSeleccionado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtSeleccionado.setEditable(false);
		contentPane.add(txtSeleccionado, "cell 4 5 7 1,growx");
		txtSeleccionado.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cbbCiudad.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(null, "Debe seleccionar una ciudad");
				} else {
					String resultado = (String) cbbCiudad.getSelectedItem();
					txtSeleccionado.setText(resultado);
				}
			}
			
		});
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnAceptar, "cell 6 7");
	}

}
