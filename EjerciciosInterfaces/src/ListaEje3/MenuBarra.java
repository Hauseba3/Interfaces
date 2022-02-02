package ListaEje3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MenuBarra extends JFrame {
	private JMenuItem MenuHola;
	private JMenu MenuHablar;
	private JMenuBar menuBar;
	private JMenuItem MenuAdios;
	private JMenuItem MenuSalir;
	private JMenu MenuColores;
	private JMenuItem MenuRojo;
	private JMenuItem MenuAzul;
	private JMenuItem MenuVerde;
	private JMenuItem MenuReiniciar;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuBarra frame = new MenuBarra();
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
	public MenuBarra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		MenuHablar = new JMenu("Hablar");
		MenuHablar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		menuBar.add(MenuHablar);
		
		MenuHola = new JMenuItem("Decir Hola");
		MenuHola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Hola!");
				
			}
		});
		MenuHola.setHorizontalAlignment(SwingConstants.LEFT);
		MenuHola.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		MenuHablar.add(MenuHola);
		
		MenuAdios = new JMenuItem("Decir Adios");
		MenuAdios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Adios!");
				
			}
		});
		MenuAdios.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		MenuHablar.add(MenuAdios);
		
		JSeparator separator = new JSeparator();
		MenuHablar.add(separator);
		
		MenuSalir = new JMenuItem("Salir");
		MenuSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		MenuSalir.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		MenuHablar.add(MenuSalir);
		
		MenuColores = new JMenu("Colores");
		MenuColores.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		menuBar.add(MenuColores);
		
		MenuRojo = new JMenuItem("Rojo");
		MenuRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setBackground(Color.red);
				
			}
		});
		MenuRojo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		MenuColores.add(MenuRojo);
		
		MenuAzul = new JMenuItem("Azul");
		MenuAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setBackground(Color.BLUE);
				
			}
		});
		MenuAzul.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		MenuColores.add(MenuAzul);
		
		MenuVerde = new JMenuItem("Verde");
		MenuVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setBackground(Color.GREEN);
				
			}
		});
		MenuVerde.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		MenuColores.add(MenuVerde);
		
		JSeparator separator_1 = new JSeparator();
		MenuColores.add(separator_1);
		
		MenuReiniciar = new JMenuItem("Reiniciar Color");
		MenuReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setBackground(null);
				
			}
		});
		MenuReiniciar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		MenuColores.add(MenuReiniciar);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][grow]", "[][][][grow]"));
		
		panel = new JPanel();
		getContentPane().add(panel, "cell 0 0 7 4,grow");
		
		
	}

}
