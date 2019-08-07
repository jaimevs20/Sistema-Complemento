package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ControladorViaAlternativa;
import controle.ControladorViaClassica;
import controle.ControladorViaDeLectina;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class ViasDoSistemaComplemento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	
	public ViasDoSistemaComplemento() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ViasDoSistemaComplemento.class.getResource("/Telas/oie_121561433Ri9D5I.png")));
		lblNewLabel.setBounds(10, 11, 1000, 700);
		contentPane.add(lblNewLabel);
		
		JLabel lblViaClassica = new JLabel("");
		lblViaClassica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				new ControladorViaClassica();
			}
		});
		lblViaClassica.setBounds(103, 275, 227, 202);
		lblNewLabel.add(lblViaClassica);
		
		JLabel lblViaDaLectina = new JLabel("");
		lblViaDaLectina.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new ControladorViaDeLectina();
			}
		});
		
		lblViaDaLectina.setBounds(396, 278, 218, 193);
		lblNewLabel.add(lblViaDaLectina);
		
		JLabel lblViaAlternativa = new JLabel("");
		lblViaAlternativa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new ControladorViaAlternativa();
			}
		});
		lblViaAlternativa.setBounds(669, 273, 253, 202);
		lblNewLabel.add(lblViaAlternativa);
		
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				FuncoesSistemaComplemento func = new FuncoesSistemaComplemento();
				func.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(ViasDoSistemaComplemento.class.getResource("/Telas/oie_1335110ksB9nw1.png")));
		button.setToolTipText("VOLTAR");
		button.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button.setBorder(null);
		button.setBackground(new Color(204, 255, 255));
		button.setBounds(47, 570, 88, 33);
		lblNewLabel.add(button);
		
		
	}
}
