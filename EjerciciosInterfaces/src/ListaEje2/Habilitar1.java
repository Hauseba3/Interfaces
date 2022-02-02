package ListaEje2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Habilitar1 extends JFrame {

	private JPanel contentPane;
	private JButton btnCentral;
	private JButton btnHabilita;
	private JButton btnDeshabilita;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Habilitar1 frame = new Habilitar1();
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
	public Habilitar1() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 99);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[-5.00][][][][][]", "[][]"));
		
		btnCentral = new JButton("Central");
		btnCentral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCentral.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnCentral, "cell 3 0 1 2,alignx center,aligny center");
		
		btnHabilita = new JButton("Habilita Central");
		btnHabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnDeshabilita.setEnabled(false);
				btnCentral.setEnabled(false);
			}
		});
		btnHabilita.setEnabled(false);
		btnHabilita.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnHabilita, "cell 5 0 1 2,alignx right,aligny center");
		
		btnDeshabilita = new JButton("Deshabilita Central");
		btnDeshabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnHabilita.setEnabled(true);
			}
		});
		btnDeshabilita.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnDeshabilita, "cell 1 0 1 2,alignx left,aligny center");
		
		
	}

}
