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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaLibrosV2JTable extends JFrame {

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
	private JTable tablaListado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLibrosV2JTable frame = new VentanaLibrosV2JTable();
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
	public VentanaLibrosV2JTable() {
		
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
		
		tablaListado = new JTable();
		tablaListado.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ISBN", "Titulo", "Editorial", "NumPags", "Precio", "PrecioCD"
			}
		));
		tablaListado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(tablaListado);
		
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
		
		DefaultTableModel modelo = (DefaultTableModel) tablaListado.getModel();
		modelo.setRowCount(0);
		for (Libro l : listaLibros) {
			Object fila [] = {
					l.getIsbn(), l.getTitulo(), l.getEditorial(), l.getNum_pags(), l.getPrecio(), l.getPrecioCd()
			};
			modelo.addRow(fila);	
		}
	}

	protected void insertar() {
		
		
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
			
			DefaultTableModel modelo = (DefaultTableModel) tablaListado.getModel();
			modelo.setRowCount(0); //vacia el modelo
				Object fila [] = {l.getIsbn(), l.getTitulo(), l.getEditorial(), l.getNum_pags(), l.getPrecio(), l.getPrecioCd()};
				modelo.addRow(fila);
			
			txtIsbn.setText(null);
			txtTitulo.setText(null);
			txtEditorial.setText(null);
			txtPaginas.setValue(0);
			txtPrecio.setText(null);
			txtPreciocd.setText(null);

		}
		
	}

}
