package biblioteca;

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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class VentanaLibros extends JFrame {

	private JPanel contentPane;
	private JTextField txtIsbn;
	private JTextField txtEditorial;
	private JTextField txtPrecio;
	private JSpinner txtPaginas;
	private JTextField txtPreciocd;
	private JTextField txtTitulo;
	private JButton btnInsertar;
	private JButton btnMostrar;
	private ArrayList <Libro> listaLibros;
	private JScrollPane scrollPane;
	private JTextPane txtListado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLibros frame = new VentanaLibros();
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
	public VentanaLibros() {
		
		listaLibros = new ArrayList<Libro>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][grow][grow][][grow]", "[][][][][][][grow][grow]"));
		
		JLabel lblISBN = new JLabel("ISBN:");
		lblISBN.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblISBN, "cell 0 0,alignx trailing");
		
		txtIsbn = new JTextField();
		txtIsbn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtIsbn, "cell 1 0,growx");
		txtIsbn.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblTitulo, "cell 2 0,alignx trailing");
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtTitulo, "cell 3 0 4 1,growx");
		txtTitulo.setColumns(10);
		
		JLabel lblEditorial = new JLabel("Editorial:");
		lblEditorial.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblEditorial, "cell 0 1,alignx trailing");
		
		txtEditorial = new JTextField();
		txtEditorial.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtEditorial, "cell 1 1 4 1,growx");
		txtEditorial.setColumns(10);
		
		JLabel lblPaginas = new JLabel("NumPags:");
		lblPaginas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblPaginas, "cell 5 1,alignx trailing");
		
		txtPaginas = new JSpinner();
		txtPaginas.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		txtPaginas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtPaginas, "cell 6 1,growx");
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblPrecio, "cell 0 2,alignx trailing");
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(txtPrecio, "cell 1 2,growx");
		txtPrecio.setColumns(10);
		
		JLabel lblCd = new JLabel("Precio CD:");
		lblCd.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblCd, "cell 5 2,alignx trailing");
		
		txtPreciocd = new JTextField();
		txtPreciocd.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtPreciocd, "cell 6 2,growx");
		txtPreciocd.setColumns(10);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 5 7 3,grow");
		
		txtListado = new JTextPane();
		txtListado.setEditable(false);
		txtListado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(txtListado);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insertar();
				
			}
		});
		btnInsertar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnInsertar, "cell 1 4 2 1,alignx right");
		
		btnMostrar = new JButton("Mostrar Libros");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostrar();
				
			}
		});
		btnMostrar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnMostrar, "cell 3 4 3 1");
		
		
		
		
	}

	protected void mostrar() {
		
		txtListado.setText(null);
		
		
		for (Libro l : listaLibros) {
			txtListado.setText(txtListado.getText() + l.toString());
		}
		
	}

	protected void insertar() {
		
		txtListado.setText(null);
		
		if(txtIsbn.getText()==null || txtIsbn.getText().equals("") || txtTitulo.getText()==null || txtTitulo.getText().equals("")
				|| txtEditorial.getText()==null || txtEditorial.getText().equals("") || txtPrecio.getText()==null || txtPrecio.getText().equals("")
				|| txtPreciocd.getText()==null || txtPreciocd.getText().equals("")) {
			
			JOptionPane.showMessageDialog(null, "Debes introducir todos los datos!", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		} else {
			
			Libro l = new Libro();
			l.setIsbn(txtIsbn.getText());
			l.setTitulo(txtTitulo.getText());
			l.setEditorial(txtEditorial.getText());
			l.setNum_pags(Integer.parseInt(txtPaginas.getValue().toString()));
			l.setPrecio(Double.parseDouble(txtPrecio.getText()));
			l.setPrecioCd(Double.parseDouble(txtPreciocd.getText()));
			
			listaLibros.add(l);
			
			
				txtListado.setText(l.toString());
			
			
		}
		
	}

}
