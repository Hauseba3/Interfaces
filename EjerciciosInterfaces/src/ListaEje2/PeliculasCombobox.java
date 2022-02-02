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
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PeliculasCombobox extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JComboBox cbbPeliculas;
	private JLabel lblPelicula;
	private JLabel lblTitulo;
	private JButton btnAñadir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PeliculasCombobox frame = new PeliculasCombobox();
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
	public PeliculasCombobox() {
		setForeground(Color.LIGHT_GRAY);
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][grow][][][][][][][grow]", "[][][][][][]"));
		
		
		lblTitulo = new JLabel("Escribe el titulo de una pelicula");
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblTitulo, "cell 0 1 4 1");
		
		lblPelicula = new JLabel("Peliculas");
		lblPelicula.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblPelicula, "cell 8 1");
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtTitulo, "cell 0 3 5 1,growx");
		txtTitulo.setColumns(10);
		
		cbbPeliculas = new JComboBox();
		cbbPeliculas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(cbbPeliculas, "cell 6 3 6 1,growx");
		
		btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtTitulo.getText()!=null && !txtTitulo.getText().trim().equals("")) {
					cbbPeliculas.addItem(txtTitulo.getText());
					txtTitulo.setText(null);
				} else  {
					JOptionPane.showMessageDialog(null, "Debes escribir el titulo de una pelicula");
				}
				
			}
		});
		btnAñadir.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnAñadir, "cell 2 5");
		getRootPane().setDefaultButton(btnAñadir);
	}

}
