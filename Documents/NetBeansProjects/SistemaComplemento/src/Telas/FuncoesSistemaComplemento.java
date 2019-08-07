package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class FuncoesSistemaComplemento extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FuncoesSistemaComplemento() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFunesDoSistema = new JLabel("FUN\u00C7\u00D5ES DO SISTEMA COMPLEMENTO");
		lblFunesDoSistema.setBackground(Color.WHITE);
		lblFunesDoSistema.setForeground(new Color(0, 153, 153));
		lblFunesDoSistema.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		lblFunesDoSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblFunesDoSistema.setBounds(263, 44, 500, 82);
		contentPane.add(lblFunesDoSistema);
		
		JButton button = new JButton("");
		button.setToolTipText("PR\u00D3XIMO");
		button.setIcon(new ImageIcon(FuncoesSistemaComplemento.class.getResource("/Telas/oie_879169n7I4VQQ.png")));
		button.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button.setBackground(new Color(204, 255, 255));
		button.setBounds(870, 600, 88, 33);
		button.setBorder(null);
		contentPane.add(button);
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				ViasDoSistemaComplemento func = new ViasDoSistemaComplemento();
				func.setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(FuncoesSistemaComplemento.class.getResource("/Telas/oie_n0iN0PaNeyz5.png")));
		lblNewLabel.setBounds(0, 0, 994, 711);
		contentPane.add(lblNewLabel);
		
		JButton button_1 = new JButton("");
		lblNewLabel.add(button_1);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				DescricaoSistemaComplemento func = new DescricaoSistemaComplemento();
				func.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon(FuncoesSistemaComplemento.class.getResource("/Telas/oie_1335110ksB9nw1.png")));
		button_1.setToolTipText("VOLTAR");
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_1.setBorder(null);
		button_1.setBackground(new Color(204, 255, 255));
		button_1.setBounds(46, 600, 88, 33);
	}
}
