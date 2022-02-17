package ListaEje4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class VentanaCines extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup grupo = new ButtonGroup();
	private JLabel lblTitulo;
	private JLabel lblMensaje;
	private JLabel lblPelicula;
	private JComboBox cbbPeliculas;
	private JTextPane txtListado;
	private JLabel lblPrecio;
	private JLabel lblEntradas;
	private JSpinner spinner;
	private Container lblSesion;
	private JRadioButton nrbNormal;
	private JRadioButton nrbMatinal;
	private JRadioButton nrbGolfa;
	private JButton btnComprar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCines frame = new VentanaCines();
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
	public VentanaCines() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][50.00][77.00][][-41.00][][][32.00][112.00][][grow][][][grow][]", "[][][][][][32.00][29.00][73.00][grow]"));
		
		lblTitulo = new JLabel("Cines \u00C1baco");
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblTitulo, "cell 0 0 15 1");
		
		lblMensaje = new JLabel("Mensaje:");
		lblMensaje.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblMensaje, "cell 5 1");
		
		lblPelicula = new JLabel("Pelicula:");
		lblPelicula.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblPelicula, "cell 0 3,alignx trailing");
		
		cbbPeliculas = new JComboBox();
		cbbPeliculas.setModel(new DefaultComboBoxModel(new String[] {"Selecione una pelicula", "El se\u00F1or de los anillos", "Star Wars", "Avatar", "Batman", "Spiderman: Homecoming", "Venom"}));
		cbbPeliculas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(cbbPeliculas, "cell 1 3 3 1,growx");
		
		txtListado = new JTextPane();
		txtListado.setEditable(false);
		txtListado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtListado, "cell 5 2 8 6,grow");
		
		lblPrecio = new JLabel("Precio: 7\u20AC");
		lblPrecio.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblPrecio, "cell 0 5");
		
		lblEntradas = new JLabel("Numero:");
		lblEntradas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblEntradas, "cell 1 5,alignx right");
		
		spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		contentPane.add(spinner, "cell 2 5");
		
		lblSesion = new JLabel("Sesion:");
		lblSesion.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblSesion, "cell 0 7");
		
		nrbNormal = new JRadioButton("Normal");
		nrbNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblPrecio.setText("Precio: 7€");
				
			}
		});
		nrbNormal.setSelected(true);
		grupo.add(nrbNormal);
		nrbNormal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbNormal, "cell 1 7");
		
		nrbMatinal = new JRadioButton("Matinal");
		nrbMatinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblPrecio.setText("Precio: 5€");
				
			}
		});
		grupo.add(nrbMatinal);
		nrbMatinal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbMatinal, "cell 2 7");
		
		nrbGolfa = new JRadioButton("Golfa");
		nrbGolfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblPrecio.setText("Precio: 4.5€");
				
			}
		});
		grupo.add(nrbGolfa);
		nrbGolfa.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbGolfa, "cell 3 7");
		
		btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				añadir();
				precio();
				
			}
		});
		btnComprar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnComprar, "cell 2 8");
	}

	protected double precio() {
		
		double precio=0;
		double coste=(Integer)spinner.getValue();
		if(nrbNormal.isSelected()) {
			precio=7*coste;
		} else if (nrbMatinal.isSelected()) {
			precio = 5*coste;
		} else if (nrbGolfa.isSelected()) {
			precio = 4.5*coste;
		}
		return precio;
		
	}

	protected void añadir() {
		
		if(cbbPeliculas.getSelectedIndex()==0) {
			JOptionPane.showMessageDialog(null, "Debes seleccionar una pelicula", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		} else {
			txtListado.setText("Pelicula: " + cbbPeliculas.getSelectedItem().toString() + "\n" + "Precio: " + precio() + "€");
		}
		
	}

}
