package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eje1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eje1 frame = new eje1();
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
	public eje1() {
		setTitle("Ventana con interaccion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(24, 35, 174, 23);
		contentPane.add(lblResultado);
		
		JButton btnNum2 = new JButton("Boton 2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblResultado.setText("Has pulsado: Boton 2");
				
			}
		});
		btnNum2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNum2.setBounds(307, 35, 89, 23);
		contentPane.add(btnNum2);
		
		JButton btnNum1 = new JButton("Boton 1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblResultado.setText("Has pulsado: Boton 1");
				
			}
		});
		btnNum1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNum1.setBounds(208, 35, 89, 23);
		contentPane.add(btnNum1);
	}

}
