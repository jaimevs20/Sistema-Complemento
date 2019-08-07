package Telas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JEditorPane;

public class ViaDeLectina extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pnViaAlternativa;
	public ArrayList<JButton> botoesPrincipais = new ArrayList<>();
	public ArrayList<JButton> botoesAuxiliares = new ArrayList<>();

	Random rand = new Random();

	int x = rand.nextInt(24);
	int y = rand.nextInt(24);
	int z = rand.nextInt(24);

	int valorR;
	int valorRa;
	int valorRan;

	int valorRand;
	int valorRando;
	int valorRandom;

	static int acerto = 0;
	static int erro = 0;

	static String aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8;

	/**
	 * Create the frame.
	 */
	JButton btnAux1 = new JButton("");
	JButton btnAux3 = new JButton("");
	JButton btnAux2 = new JButton("");
	JButton btnAux4 = new JButton("");

	public ViaDeLectina() {
		setTitle("VIA DA LECTINA");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1293, 744);
		setExtendedState(MAXIMIZED_BOTH);
		pnViaAlternativa = new JPanel();
		pnViaAlternativa.setForeground(new Color(0, 0, 255));
		pnViaAlternativa.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnViaAlternativa);
		pnViaAlternativa.setAlignmentX(100);
		pnViaAlternativa.setLayout(null);

		JLabel lblViaAlternativa = new JLabel("VIA DA LECTINA");
		lblViaAlternativa.setForeground(Color.BLACK);
		lblViaAlternativa.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblViaAlternativa.setHorizontalAlignment(SwingConstants.CENTER);
		lblViaAlternativa.setBounds(521, 11, 386, 56);
		pnViaAlternativa.add(lblViaAlternativa);

		JTextPane txtCbb = new JTextPane();
		txtCbb.setBackground(new Color(204, 255, 255));
		txtCbb.setEditable(false);
		txtCbb.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		txtCbb.setText("MANOSE");
		txtCbb.setBounds(149, 138, 80, 32);
		pnViaAlternativa.add(txtCbb);

		JButton c3 = new JButton("MBL");
		c3.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c3.setBounds(154, 183, 71, 23);
		pnViaAlternativa.add(c3);
		adicionabtP(c3);

		JButton c3b = new JButton("C2");
		c3b.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c3b.setBounds(233, 315, 71, 23);
		pnViaAlternativa.add(c3b);
		adicionabtP(c3b);

		JButton c3a = new JButton("C4");
		c3a.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c3a.setBounds(88, 315, 71, 23);
		pnViaAlternativa.add(c3a);
		adicionabtP(c3a);

		JButton c5 = new JButton("C5");
		c5.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c5.setBounds(452, 556, 71, 23);
		pnViaAlternativa.add(c5);
		adicionabtP(c5);

		JButton Bb = new JButton("C4a");
		Bb.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		Bb.setBounds(55, 357, 71, 23);
		pnViaAlternativa.add(Bb);
		adicionabtP(Bb);

		JButton Ba = new JButton("C2b");
		Ba.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		Ba.setBounds(309, 373, 71, 23);
		pnViaAlternativa.add(Ba);
		adicionabtP(Ba);

		JButton c5b678 = new JButton("C5b678");
		c5b678.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c5b678.setBounds(987, 512, 85, 25);
		pnViaAlternativa.add(c5b678);
		adicionabtP(c5b678);

		JButton c3bB = new JButton("C2a");
		c3bB.setToolTipText("FATOR D");
		c3bB.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c3bB.setBounds(353, 315, 85, 23);
		pnViaAlternativa.add(c3bB);
		adicionabtP(c3bB);

		JButton c5B6 = new JButton("C5b6");
		c5B6.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c5B6.setBounds(733, 512, 71, 25);
		pnViaAlternativa.add(c5B6);
		adicionabtP(c5B6);

		JButton c5a = new JButton("C5a");
		c5a.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c5a.setBounds(452, 619, 71, 23);
		pnViaAlternativa.add(c5a);
		adicionabtP(c5a);

		JButton c5b = new JButton("C5b");
		c5b.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c5b.setBounds(603, 513, 71, 23);
		pnViaAlternativa.add(c5b);
		adicionabtP(c5b);

		JButton btnCb = new JButton("C5b6789");
		btnCb.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnCb.setBounds(1122, 556, 90, 47);
		pnViaAlternativa.add(btnCb);
		adicionabtP(btnCb);

		JButton c3bBbC3b = new JButton("C4b2b3b");
		c3bBbC3b.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c3bBbC3b.setBounds(428, 462, 100, 47);
		pnViaAlternativa.add(c3bBbC3b);
		adicionabtP(c3bBbC3b);

		JButton c3bBb = new JButton("C4b2b");
		c3bBb.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c3bBb.setBounds(219, 470, 99, 23);
		pnViaAlternativa.add(c3bBb);
		adicionabtP(c3bBb);

		JButton c5b67 = new JButton("C5b67");
		c5b67.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c5b67.setBounds(857, 512, 71, 23);
		pnViaAlternativa.add(c5b67);
		adicionabtP(c5b67);

		JButton c6 = new JButton("C6");
		c6.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c6.setBounds(603, 556, 71, 23);
		pnViaAlternativa.add(c6);
		adicionabtP(c6);

		JButton c3bNovo = new JButton("C3b");
		c3bNovo.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c3bNovo.setBounds(247, 576, 71, 23);
		pnViaAlternativa.add(c3bNovo);
		adicionabtP(c3bNovo);

		JButton c3Novo = new JButton("C3");
		c3Novo.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c3Novo.setBounds(218, 533, 71, 23);
		pnViaAlternativa.add(c3Novo);
		adicionabtP(c3Novo);

		JLabel c3Conv = new JLabel("C3\r\n convertase");
		c3Conv.setForeground(Color.RED);
		c3Conv.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		c3Conv.setBounds(219, 445, 85, 23);
		pnViaAlternativa.add(c3Conv);

		JLabel lblNewLabel = new JLabel("= MAC");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1209, 571, 58, 14);
		pnViaAlternativa.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(630, 533, 24, 23);
		pnViaAlternativa.add(lblNewLabel_1);

		JLabel label = new JLabel("+");
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label.setForeground(new Color(0, 0, 255));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(754, 533, 24, 23);
		pnViaAlternativa.add(label);

		JButton c7 = new JButton("C7");
		c7.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c7.setBounds(733, 556, 71, 23);
		pnViaAlternativa.add(c7);
		adicionabtP(c7);

		JLabel label_1 = new JLabel("+");
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_1.setForeground(new Color(0, 0, 255));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(878, 532, 24, 23);
		pnViaAlternativa.add(label_1);

		JButton c8 = new JButton("C8");
		c8.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c8.setBounds(857, 555, 71, 23);
		pnViaAlternativa.add(c8);
		adicionabtP(c8);

		JLabel label_2 = new JLabel("+");
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_2.setForeground(new Color(0, 0, 255));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(1020, 533, 24, 23);
		pnViaAlternativa.add(label_2);

		JButton c9 = new JButton("C9");
		c9.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		c9.setBounds(997, 556, 71, 23);
		pnViaAlternativa.add(c9);
		adicionabtP(c9);

		JLabel lblCConvertoseC5 = new JLabel("C5\r\n convertase");
		lblCConvertoseC5.setForeground(Color.RED);
		lblCConvertoseC5.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblCConvertoseC5.setBounds(439, 445, 89, 23);
		pnViaAlternativa.add(lblCConvertoseC5);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(ViaAlternativa.class.getResource("/Telas/oie_szHLnDzddk4C.png")));
		lblNewLabel_2.setBounds(164, 196, 65, 40);
		pnViaAlternativa.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(ViaAlternativa.class.getResource("/Telas/seta1.png")));
		lblNewLabel_3.setBounds(126, 272, 58, 50);
		pnViaAlternativa.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(ViaAlternativa.class.getResource("/Telas/seta2.png")));
		lblNewLabel_4.setBounds(185, 275, 80, 47);
		pnViaAlternativa.add(lblNewLabel_4);

		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(ViaAlternativa.class.getResource("/Telas/oie_szHLnDzddk4C.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(231, 538, 58, 40);
		pnViaAlternativa.add(label_5);

		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(ViaAlternativa.class.getResource("/Telas/oie_szHLnDzddk4C.png")));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(230, 494, 53, 40);
		pnViaAlternativa.add(label_6);

		JButton button = new JButton("C3a");
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		button.setBounds(138, 576, 71, 23);
		pnViaAlternativa.add(button);
		adicionabtP(button);

		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(ViaAlternativa.class.getResource("/Telas/seta1.png")));
		label_7.setBounds(170, 533, 58, 50);
		pnViaAlternativa.add(label_7);

		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(ViaAlternativa.class.getResource("/Telas/oie_szHLnDzddk4C.png")));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(459, 511, 64, 40);
		pnViaAlternativa.add(label_8);

		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(ViaAlternativa.class.getResource("/Telas/seta1.png")));
		label_9.setBounds(77, 315, 59, 56);
		pnViaAlternativa.add(label_9);

		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(ViaDeLectina.class.getResource("/Telas/oie_VbNQKzIqMCq4 (2).png")));
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(294, 485, 65, 108);
		pnViaAlternativa.add(label_13);

		JLabel label_14 = new JLabel("+");

		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setForeground(Color.BLUE);
		label_14.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		label_14.setBounds(299, 536, 34, 14);
		pnViaAlternativa.add(label_14);

		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(ViaDeLectina.class.getResource("/Telas/oie_L5nBaK43NjVk.png")));
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(293, 464, 132, 44);
		pnViaAlternativa.add(label_15);

		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon(ViaAlternativa.class.getResource("/Telas/oie_szHLnDzddk4C.png")));
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBounds(459, 575, 64, 40);
		pnViaAlternativa.add(label_16);

		JPanel panelAux = new JPanel();

		panelAux.setBackground(new Color(255, 0, 255));
		panelAux.setForeground(SystemColor.textHighlight);
		panelAux.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panelAux.setBounds(678, 138, 289, 249);
		pnViaAlternativa.add(panelAux);
		panelAux.setLayout(null);

		int x = rand.nextInt(15);
		int y = rand.nextInt(15);

		this.btnAux1.setBounds(22, 49, 100, 47);
		panelAux.add(btnAux1);
		adicionabtA(btnAux1);

		this.btnAux3.setBounds(41, 146, 100, 47);
		panelAux.add(btnAux3);
		adicionabtA(btnAux3);

		this.btnAux2.setBounds(165, 66, 100, 47);
		panelAux.add(btnAux2);
		adicionabtA(btnAux2);

		this.btnAux4.setBounds(165, 174, 100, 47);
		panelAux.add(btnAux4);
		adicionabtA(btnAux4);

		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon(ViaAlternativa.class.getResource("/Telas/oie_8542305RqONms8.png")));
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setBounds(521, 494, 85, 97);
		pnViaAlternativa.add(label_21);

		JButton btnNovoJogo = new JButton("Próximo");
		btnNovoJogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				ViaDeLectina func = new ViaDeLectina();
				func.setVisible(true);
			}

		});
		btnNovoJogo.setBounds(1066, 329, 89, 23);
		pnViaAlternativa.add(btnNovoJogo);

		JEditorPane dtrpnCliqueEm = new JEditorPane();
		dtrpnCliqueEm.setForeground(new Color(0, 0, 128));
		dtrpnCliqueEm.setBackground(SystemColor.inactiveCaption);
		dtrpnCliqueEm.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
		dtrpnCliqueEm.setEditable(false);
		dtrpnCliqueEm.setText(
				"- CLIQUE EM UM DOS BOT\u00D5ES DA CAIXA AO LADO PARA COMPLETAR O ESQUEMA E DEPOIS EM \"PR\u00D3XIMO\";\r\n\r\n- VOC\u00CA TEM 3 CHANCES, S\u00D3 VENCE SE OBTIVER 3 ACERTOS CONSECUTIVOS;\r\n\r\n- NO TOTAL DE 3 ERROS, VOC\u00CA PERDE!");
		dtrpnCliqueEm.setBounds(977, 158, 300, 122);
		pnViaAlternativa.add(dtrpnCliqueEm);

		JButton btnNewButton = new JButton("C4b");
		btnNewButton.setBounds(146, 374, 89, 23);
		pnViaAlternativa.add(btnNewButton);
		adicionabtP(btnNewButton);

		JLabel label_22 = new JLabel("+");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(new Color(0, 0, 204));
		label_22.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_22.setBounds(164, 158, 43, 33);
		pnViaAlternativa.add(label_22);

		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon(ViaClassica.class.getResource("/Telas/seta2.png")));
		label_19.setBounds(136, 333, 80, 47);
		pnViaAlternativa.add(label_19);

		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon(ViaClassica.class.getResource("/Telas/seta2.png")));
		label_23.setBounds(263, 333, 80, 47);
		pnViaAlternativa.add(label_23);

		JLabel label_24 = new JLabel("");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setBounds(213, 303, 65, 23);
		pnViaAlternativa.add(label_24);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ViaDeLectina.class.getResource("/Telas/oie_VbNQKzIqMCq4 (1).png")));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(172, 389, 53, 85);
		pnViaAlternativa.add(label_3);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(ViaDeLectina.class.getResource("/Telas/oie_VbNQKzIqMCq4.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(309, 391, 50, 83);
		pnViaAlternativa.add(label_4);

		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(ViaClassica.class.getResource("/Telas/oie_10181635c7moxKLt.png")));
		label_10.setBounds(294, 297, 71, 58);
		pnViaAlternativa.add(label_10);

		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(ViaClassica.class.getResource("/Telas/oie_10181635c7moxKLt.png")));
		label_12.setBounds(672, 498, 71, 58);
		pnViaAlternativa.add(label_12);

		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(ViaClassica.class.getResource("/Telas/oie_10181635c7moxKLt.png")));
		label_11.setBounds(799, 498, 71, 58);
		pnViaAlternativa.add(label_11);

		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(ViaClassica.class.getResource("/Telas/oie_10181635c7moxKLt.png")));
		label_17.setBounds(931, 494, 71, 58);
		pnViaAlternativa.add(label_17);

		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon(ViaClassica.class.getResource("/Telas/oie_10182455NUE7A08B.png")));
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setBounds(1064, 518, 65, 40);
		pnViaAlternativa.add(label_18);

		JTextPane txtpnMaspMasp = new JTextPane();
		txtpnMaspMasp.setText("MASP-1\r\nMASP-2");
		txtpnMaspMasp.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		txtpnMaspMasp.setEditable(false);
		txtpnMaspMasp.setBackground(new Color(255, 204, 204));
		txtpnMaspMasp.setBounds(154, 238, 80, 47);
		pnViaAlternativa.add(txtpnMaspMasp);

		JLabel lblBactria = new JLabel("");
		lblBactria.setIcon(new ImageIcon(ViaDeLectina.class.getResource("/Telas/oie_vV2w0JGje0ga.png")));
		lblBactria.setBounds(42, 36, 130, 70);
		pnViaAlternativa.add(lblBactria);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon(ViaDeLectina.class.getResource("/Telas/oie_10182455NUE7A08B.png")));
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setBounds(107, 73, 65, 97);
		pnViaAlternativa.add(label_20);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(ViaDeLectina.class.getResource("/Telas/oie_1301836GpLmuM7t.jpg")));
		lblNewLabel_6.setBounds(0, 0, 1358, 706);
		pnViaAlternativa.add(lblNewLabel_6);

		for (int i = 0; i < botoesPrincipais.size(); i++)
			lblNewLabel_6.add(botoesPrincipais.get(i));

		setRand(x, y, z);
		desabilita();

		for (int i = 0; i < botoesAuxiliares.size(); i++)
			panelAux.add(botoesAuxiliares.get(i));

		preencheText();
		/* while(getAcerto() <= 3) */
		jogo();
		/*
		 * if(getAcerto() == 3){ System.out.println("uhuul"); dispose(); } else
		 * if(getErro() == 3) { System.out.println("cuen cuen cuen"); }
		 */
	}

	public void jogo() {
		this.btnAux1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (int i = 0; i < botoesPrincipais.size(); i++) {
					if (botoesPrincipais.get(i).getBackground() == Color.red
							&& botoesPrincipais.get(i).getText() == "") {
						botoesPrincipais.get(i).setText(btnAux1.getText());
						btnAux1.setEnabled(false);
						if (getAux1() == btnAux1.getText()) {
							acerto++;
							setAcerto(acerto);
							if (getAcerto() == 3) {
								dispose(); 
								erro = 0;
								acerto = 0;
								setAcerto(erro);
								setErro(acerto);
								  new TelaGanhou().setVisible(true);
							} else if (getAcerto() < 3)
								JOptionPane.showMessageDialog(null,
										"Muito bem!" + "\n" + "Você já tem " + getAcerto() + " acerto(s)");
						} else {
							acerto = 0;
							setAcerto(acerto);
							erro++;
							setErro(erro);
							if (getErro() == 3) {
								dispose(); 
								erro = 0;
								acerto = 0;
								setAcerto(erro);
								setErro(acerto);
								  new TelaGameOver().setVisible(true); 
							} else if (getErro() < 3)
								JOptionPane.showMessageDialog(null, "Errou, o correto seria: " + getAux1() + "\n"
										+ "Você já tem " + getErro() + " erro(s)");
						}
						break;
					}
				}
			}

		});

		this.btnAux2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (int i = 0; i < botoesPrincipais.size(); i++) {
					if (botoesPrincipais.get(i).getBackground() == Color.red
							&& botoesPrincipais.get(i).getText() == "") {
						botoesPrincipais.get(i).setText(btnAux2.getText());
						btnAux2.setEnabled(false);
						if (getAux1() == btnAux2.getText()) {
							setAcerto(acerto);
							acerto++;
							if (getAcerto() == 3) {
								dispose(); 
								erro = 0;
								acerto = 0;
								setAcerto(erro);
								setErro(acerto);
								  new TelaGanhou().setVisible(true);
							} else if (getAcerto() < 3)
								JOptionPane.showMessageDialog(null,
										"Muito bem!" + "\n" + "Você já tem " + getAcerto() + " acerto(s)");
						} else {

							acerto = 0;
							setAcerto(acerto);
							erro++;
							setErro(erro);
							if (getErro() == 3) {
								dispose(); 
								erro = 0;
								acerto = 0;
								setAcerto(erro);
								setErro(acerto);
								  new TelaGameOver().setVisible(true); 
							} else if (getErro() < 3)
								JOptionPane.showMessageDialog(null, "Errou, o correto seria: " + getAux1() + "\n"
										+ "Você já tem " + getErro() + " erro(s)");
						}
						break;
					}
				}
			}
		});

		this.btnAux3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (int i = 0; i < botoesPrincipais.size(); i++) {
					if (botoesPrincipais.get(i).getBackground() == Color.red
							&& botoesPrincipais.get(i).getText() == "") {
						botoesPrincipais.get(i).setText(btnAux3.getText());
						btnAux3.setEnabled(false);
						if (getAux1() == btnAux3.getText()) {
							acerto++;
							setAcerto(acerto);
							if (getAcerto() == 3) {
								dispose(); 
								erro = 0;
								acerto = 0;
								setAcerto(erro);
								setErro(acerto);
								new TelaGanhou().setVisible(true);
							} else if (getAcerto() < 3)
								JOptionPane.showMessageDialog(null,
										"Muito bem!" + "\n" + "Você já tem " + getAcerto() + " acerto(s)");
						} else {

							acerto = 0;
							setAcerto(acerto);
							erro++;
							setErro(erro);

							if (getErro() == 3) {
								dispose(); 
								erro = 0;
								acerto = 0;
								setAcerto(erro);
								setErro(acerto);
								  new TelaGameOver().setVisible(true); 
							} else if (getErro() < 3)
								JOptionPane.showMessageDialog(null, "Errou, o correto seria: " + getAux1() + "\n"
										+ "Você já tem " + getErro() + " erro(s)");
						}
						break;
					}
				}
			}
		});

		this.btnAux4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				for (int i = 0; i < botoesPrincipais.size(); i++) {
					if (botoesPrincipais.get(i).getBackground() == Color.red
							&& botoesPrincipais.get(i).getText() == "") {
						botoesPrincipais.get(i).setText(btnAux4.getText());
						btnAux4.setEnabled(false);
						if (getAux1() == btnAux4.getText()) {
							acerto++;
							setAcerto(acerto);
							if (getAcerto() == 3) {
								dispose(); 
								erro = 0;
								acerto = 0;
								setAcerto(erro);
								setErro(acerto);
								 new TelaGanhou().setVisible(true);
							} else if (getAcerto() < 3)
								JOptionPane.showMessageDialog(null,
										"Muito bem!" + "\n" + "Você já tem " + getAcerto() + " acerto(s)");
						} else {
							acerto = 0;
							setAcerto(acerto);
							erro++;
							setErro(erro);
							if (getErro() == 3) {
								dispose(); 
								erro = 0;
								acerto = 0;
								setAcerto(erro);
								setErro(acerto);
								  new TelaGameOver().setVisible(true); 
							} else if (getErro() < 3)
								JOptionPane.showMessageDialog(null, "Errou, o correto seria: " + getAux1() + "\n"
										+ "Você já tem " + getErro() + " erro(s)");
						}
						break;
					}

				}

			}
		});
	}

	public int getAcerto() {
		return acerto;
	}

	public void setAcerto(int acerto) {
		this.acerto = acerto;
	}

	public int getErro() {
		return erro;
	}

	public void setErro(int erro) {
		this.erro = erro;
	}

	public void adicionabtP(JButton bt) {
		botoesPrincipais.add(bt);
	}

	public void adicionabtA(JButton bt) {
		botoesAuxiliares.add(bt);
	}

	public void setRand(int x, int y, int z) {
		this.valorR = x;
		this.valorRa = y;
		this.valorRan = z;

	}

	public String getAux1() {
		return aux1;
	}

	public void setAux1(String aux) {
		this.aux1 = aux;
	}

	public String getAux2() {
		return aux2;
	}

	public void setAux2(String aux) {
		this.aux2 = aux;
	}

	public String getAux3() {
		return aux3;
	}

	public void setAux3(String aux) {
		this.aux3 = aux;
	}

	public String getAux4() {
		return aux4;
	}

	public void setAux4(String aux) {
		this.aux4 = aux;
	}

	public String getAux5() {
		return aux5;
	}

	public void setAux5(String aux) {
		this.aux5 = aux;
	}

	public String getAux6() {
		return aux6;
	}

	public void setAux6(String aux) {
		this.aux6 = aux;
	}

	public String getAux7() {
		return aux7;
	}

	public void setAux7(String aux) {
		this.aux7 = aux;
	}

	public String getAux8() {
		return aux8;
	}

	public void setAux8(String aux) {
		this.aux8 = aux;
	}

	public void desabilita() {
		for (int i = 0; i < botoesPrincipais.size(); i++) {
			while (valorR == valorRa && valorRa == valorRan)
				setRand(valorR, valorRa, valorRan);

			if (valorR == i) {
				setAux1(botoesPrincipais.get(i).getText());
				botoesPrincipais.get(i).setText("");
				botoesPrincipais.get(i).setBackground(Color.red);

			} else if (valorRa == i) {
				setAux2(botoesPrincipais.get(i).getText());

			} else if (valorRan == i) {
				setAux3(botoesPrincipais.get(i).getText());
			} else if (valorRan - valorR == i) {
				setAux8(botoesPrincipais.get(i).getText());
			}
		}
		// }

	}

	public void preencheText() {
		int n;
		n = rand.nextInt(4);
		boolean flag1 = false, flag2 = false, flag3 = false;

		while (botoesAuxiliares.get(n).getText() != "") {
			n = rand.nextInt(4);

		}

		if (botoesAuxiliares.get(n).getText() == "") {
			botoesAuxiliares.get(n).setText(getAux1());
			setAux4(botoesAuxiliares.get(n).getText());
			flag1 = true;
		}
		while (botoesAuxiliares.get(n).getText() != "") {
			n = rand.nextInt(4);

		}
		if (flag1 == true) {
			botoesAuxiliares.get(n).setText(getAux2());
			setAux5(botoesAuxiliares.get(n).getText());
			flag2 = true;
		}

		while (botoesAuxiliares.get(n).getText() != "") {
			n = rand.nextInt(4);

		}
		if (flag2 == true) {
			botoesAuxiliares.get(n).setText(getAux3());
			setAux6(botoesAuxiliares.get(n).getText());
			flag3 = true;
		}

		while (botoesAuxiliares.get(n).getText() != "") {
			n = rand.nextInt(4);
		}
		if (flag3 == true) {
			botoesAuxiliares.get(n).setText(getAux8());
			setAux7(botoesAuxiliares.get(n).getText());
		}

	}
}
