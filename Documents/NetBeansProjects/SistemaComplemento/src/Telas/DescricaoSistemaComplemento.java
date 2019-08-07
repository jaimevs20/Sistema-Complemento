package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class DescricaoSistemaComplemento extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public DescricaoSistemaComplemento() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JTextPane txtpnACapacidade = new JTextPane();
		txtpnACapacidade.setForeground(new Color(0, 51, 102));
		txtpnACapacidade.setText("- A CAPACIDADE DO SISTEMA COMPLEMENTO DE ELIMINAR DETERMINADAS BACT\u00C9RIAS FOI O QUE LEVOU \u00C0 SUA DESCOBERTA;\r\n\r\n- O SISTEMA COMPLEMENTO \u00C9 FORMADO POR UMA FAM\u00CDLIA DE PROTE\u00CDNAS, CUJOS FRAGMENTOS DERIVADOS DE PROTE\u00D3LISE FACILITAM A ELIMINA\u00C7\u00C3O DE MICRORGANISMOS; \r\n\r\n- S\u00C3O V\u00C1RIAS PROTE\u00CDNAS ATIVADORAS E REGULADORAS ENCONTRADAS LIGADAS \u00C0 MEMBRANA CELULAR OU LIVRES NA CIRCULA\u00C7\u00C3O;\r\n\r\n- DESEMPENHA SEU PAPEL NAS IMUNIDADES INATA E ADQUIRIDA.");
		txtpnACapacidade.setEditable(false);
		txtpnACapacidade.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		txtpnACapacidade.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnACapacidade.setBounds(162, 156, 719, 375);
		panel.add(txtpnACapacidade);
		
		JButton button = new JButton("");
		button.setToolTipText("PR\u00D3XIMO");
		button.setIcon(new ImageIcon(DescricaoSistemaComplemento.class.getResource("/Telas/oie_879169n7I4VQQ.png")));
		button.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button.setBackground(new Color(204, 255, 255));
		button.setBounds(787, 565, 88, 33);
		button.setBorder(null);
		panel.add(button);
		
		JLabel label = new JLabel("INTRODU\u00C7\u00C3O");
		label.setForeground(new Color(0, 128, 128));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		label.setBounds(394, 61, 273, 53);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DescricaoSistemaComplemento.class.getResource("/Telas/oie_86206FPyLJ3na.png")));
		lblNewLabel.setBounds(0, 0, 1034, 711);
		panel.add(lblNewLabel);
		
		JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Tela01 func = new Tela01();
				func.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon(DescricaoSistemaComplemento.class.getResource("/Telas/oie_1335110ksB9nw1.png")));
		button_1.setToolTipText("VOLTAR");
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_1.setBorder(null);
		button_1.setBackground(new Color(204, 255, 255));
		button_1.setBounds(47, 570, 88, 33);
		lblNewLabel.add(button_1);
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				FuncoesSistemaComplemento func = new FuncoesSistemaComplemento();
				func.setVisible(true);
			}
		});
	}

}
