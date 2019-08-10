package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaGameOver extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public TelaGameOver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 700, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaGameOver.class.getResource("/Telas/oie_guBO6I1pcKNN.png")));
		lblNewLabel.setBounds(0, 0, 700, 438);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("INÍCIO");
		btnNewButton.setBackground(Color.GREEN);
		lblNewLabel.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				ViasDoSistemaComplemento func = new ViasDoSistemaComplemento();
				func.setVisible(true);
			}
		});
		btnNewButton.setBounds(322, 346, 100, 23);
	}

}
