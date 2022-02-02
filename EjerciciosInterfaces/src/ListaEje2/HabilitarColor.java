package ListaEje2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

public class HabilitarColor extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup BGroupColores = new ButtonGroup();
	private Container lblColor;
	private JPanel panel;
	private JRadioButton nrbAzul;
	private JRadioButton nrbRojo;
	private JRadioButton nrbVerde;
	private JRadioButton nrbMagenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HabilitarColor frame = new HabilitarColor();
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
	public HabilitarColor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][grow]", "[][][][][][][][][][][grow][][][][][]"));
		
		lblColor = new JLabel("Selecciona un color");
		lblColor.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(lblColor, "cell 1 0 4 1");
		
		panel = new JPanel();
		contentPane.add(panel, "cell 3 2 6 12,grow");
		
		nrbAzul = new JRadioButton("Azul");
		BGroupColores.add(nrbAzul);
		nrbAzul.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbAzul, "cell 1 2");
		nrbAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setBackground(Color.blue);
				
			}
		});
		
		nrbRojo = new JRadioButton("Rojo");
		BGroupColores.add(nrbRojo);
		nrbRojo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbRojo, "cell 1 4");
		nrbRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setBackground(Color.red);
				
			}
		});
		
		nrbVerde = new JRadioButton("Verde");
		BGroupColores.add(nrbVerde);
		nrbVerde.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbVerde, "cell 1 6");
		nrbVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setBackground(Color.green);
				
			}
		});
		
		nrbMagenta = new JRadioButton("Magenta");
		BGroupColores.add(nrbMagenta);
		nrbMagenta.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(nrbMagenta, "cell 1 8");
		nrbMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setBackground(Color.magenta);
				
			}
		});
	}

}
