package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class Tela01 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel TelaInicial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01 frame = new Tela01();
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
	public Tela01() {

		setAlwaysOnTop(true);
		setAutoRequestFocus(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 423);
		TelaInicial = new JPanel();
		TelaInicial.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(TelaInicial);
		TelaInicial.setLayout(null);

		JButton btStart = new JButton("INICIAR");
		btStart.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				DescricaoSistemaComplemento desc = new DescricaoSistemaComplemento();
				desc.setVisible(true);
			}
		});

		btStart.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		btStart.setBounds(240, 313, 106, 32);
		TelaInicial.add(btStart);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela01.class.getResource("/Telas/oie_4pFns33EUfvz.png")));
		lblNewLabel.setBounds(10, 11, 574, 373);
		TelaInicial.add(lblNewLabel);
		 

	}
}
