package ListaEje2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HabilitarCheck extends JFrame {

	private JPanel contentPane;
	private JCheckBox ncbCocina;
	private JCheckBox ncbJuegos;
	private JCheckBox ncbTecnologia;
	private JTextPane Panel;
	private JCheckBox ncbDeportes;
	private JLabel lblSeleccionar;
	private JLabel lblHobbies;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HabilitarCheck frame = new HabilitarCheck();
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
	public HabilitarCheck() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][grow]", "[][][][][][][][][grow][][][][]"));
		
		lblHobbies = new JLabel("Hobbies:");
		lblHobbies.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblHobbies, "cell 0 0");
		
		lblSeleccionar = new JLabel("Has seleccionado:");
		lblSeleccionar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblSeleccionar, "cell 5 0");
		
		ncbDeportes = new JCheckBox("Deportes");
		ncbDeportes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(ncbDeportes, "cell 1 1");
		
		Panel = new JTextPane();
		Panel.setEditable(false);
		Panel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(Panel, "cell 3 1 5 7,grow");
		
		ncbTecnologia = new JCheckBox("Tecnolog\u00EDa");
		ncbTecnologia.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(ncbTecnologia, "cell 1 3");
		
		ncbJuegos = new JCheckBox("Juegos");
		ncbJuegos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(ncbJuegos, "cell 1 5");
		
		ncbCocina = new JCheckBox("Cocina");
		ncbCocina.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(ncbCocina, "cell 1 7");
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Panel.setText(null);
				
				if(ncbDeportes.isSelected()) {
					Panel.setText(Panel.getText() + "\n" + ncbDeportes.getText());
				}
				
				if(ncbTecnologia.isSelected()) {
					Panel.setText(Panel.getText() + "\n" + ncbTecnologia.getText());
				}
				
				if(ncbJuegos.isSelected()) {
					Panel.setText(Panel.getText() + "\n" + ncbJuegos.getText());
				}
				
				if(ncbCocina.isSelected()) {
					Panel.setText(Panel.getText() + "\n" + ncbCocina.getText());
				}
				
			}
		});
		btnComprobar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnComprobar, "cell 5 10");
	}

}
