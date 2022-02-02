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
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContraseña;
	
	String usuario=null, contraseña=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUsuarios frame = new LoginUsuarios();
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
	public LoginUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][]"));
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblUsuario, "cell 1 1,alignx right");
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtUsuario, "cell 3 1,growx");
		txtUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblContraseña, "cell 1 3,alignx right");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuario = txtUsuario.getText();
				contraseña = new String (txtContraseña.getPassword());
				
				if(usuario.equals("Jose") && contraseña.equals("Pitufo10")) {
					JOptionPane.showMessageDialog(null, "Inicio de sesion con exito!");
					txtUsuario.setText(null);
					txtContraseña.setText(null);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
					txtUsuario.setText(null);
					txtContraseña.setText(null);
				}
			}
		});
		
		txtContraseña = new JPasswordField();
		txtContraseña.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(txtContraseña, "cell 3 3,growx");
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnAceptar, "cell 3 6,alignx right");
	}

}
