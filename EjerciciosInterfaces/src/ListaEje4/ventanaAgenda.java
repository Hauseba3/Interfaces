package ListaEje4;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class ventanaAgenda extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JLabel lblNombre;
	private JLabel lblTelefono;
	private JButton btnAñadir;
	private JButton btnEliminar;
	private JButton btnSalir;
	private ArrayList<Contacto> listaContactos;
	private JTable tablaListado;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaAgenda frame = new ventanaAgenda();
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
	public ventanaAgenda() {
		
		listaContactos = new ArrayList<Contacto>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[221.00][][grow]", "[grow][][][][][][][][]"));
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 0 1 8,grow");
		
		tablaListado = new JTable();
		scrollPane.setViewportView(tablaListado);
		tablaListado.setBackground(SystemColor.menu);
		tablaListado.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Tel\u00E9fono"
			}
		));
		tablaListado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNombre, "cell 1 0,alignx trailing");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtNombre, "cell 2 0,growx");
		txtNombre.setColumns(10);
		
		btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				añadir();
				mostrar();
				limpiar();
				
			}
		});
		
		lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblTelefono, "cell 1 1,alignx trailing");
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtTelefono, "cell 2 1,growx");
		txtTelefono.setColumns(10);
		btnAñadir.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnAñadir, "cell 2 6,alignx center");
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				eliminar();
				
			}
		});
		btnEliminar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnEliminar, "cell 2 7,alignx center");
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnSalir, "cell 2 8,alignx center");
	}

	protected void limpiar() {
		
		txtNombre.setText(null);
		txtTelefono.setText(null);
		
	}

	protected void mostrar() {
		
		DefaultTableModel modelo = (DefaultTableModel) tablaListado.getModel();
		modelo.setRowCount(0); //vacia el modelo
		
		for (Contacto contacto : listaContactos) {
				Object fila [] = {contacto.getNombre(), contacto.getTelefono()};
				modelo.addRow(fila);
		}
		
	}

	protected void eliminar() {
		
		int indice = tablaListado.getSelectedRow();
		
		DefaultTableModel modelo = (DefaultTableModel) tablaListado.getModel();
		modelo.removeRow(indice);
		listaContactos.remove(indice);
		
	}

	protected void añadir() {
		
		if(txtNombre.getText()==null || txtNombre.getText().equals("") || txtTelefono.getText()==null 
				|| txtTelefono.getText().equals("")) {
			
			JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos!", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
			
		} else {
			
			Contacto c = new Contacto();
			
			c.setNombre(txtNombre.getText());
			c.setTelefono(txtTelefono.getText());
			
			if(!listaContactos.contains(c)) {
				listaContactos.add(c);
			} else {
				JOptionPane.showMessageDialog(null, "Ya existe un contacto con ese telefono", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
			}

		}
		
	}

}
