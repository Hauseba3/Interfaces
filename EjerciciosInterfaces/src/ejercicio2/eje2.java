package ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eje2 extends JFrame {

	private JPanel contentPane;
	
	int contador=0, contador2=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eje2 frame = new eje2();
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
	public eje2() {
		setTitle("Ventana con mas interaccion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoton1 = new JLabel("Boton 1: ");
		lblBoton1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblBoton1.setBounds(60, 23, 129, 23);
		contentPane.add(lblBoton1);
		
		JLabel lblBoton2 = new JLabel("Boton 2: ");
		lblBoton2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblBoton2.setBounds(256, 23, 136, 23);
		contentPane.add(lblBoton2);
		
		JButton btnNewButton = new JButton("Boton 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contador++;
				
				lblBoton1.setText("Boton 1: " + contador + " veces");
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(60, 78, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Boton 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contador2++;
				
				lblBoton2.setText("Boton 2: " + contador2 + " veces");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(256, 78, 89, 23);
		contentPane.add(btnNewButton_1);
		
	}

}
