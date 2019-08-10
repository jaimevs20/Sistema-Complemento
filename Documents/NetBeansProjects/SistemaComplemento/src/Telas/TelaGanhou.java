package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class TelaGanhou extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel amarelo = new JLabel("");
	JLabel azul = new JLabel("");
	JLabel vermelho = new JLabel("");
	JLabel verde = new JLabel("");
	
	JLabel amarelo2 = new JLabel("");
	JLabel azul2 = new JLabel("");
	JLabel vermelho2 = new JLabel("");
	JLabel verde2 = new JLabel("");
	
	public TelaGanhou(){
		editarJanela();
		new Movimento().start();
	}
	
	public void editarJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 574, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaGanhou.class.getResource("/Telas/oie_nCbLyVk0tOVM.png")));
		lblNewLabel.setBounds(0, 0, 558, 651);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("INÍCIO");
		lblNewLabel.add(btnNewButton);
		
		azul2.setIcon(new ImageIcon(TelaGanhou.class.getResource("/Telas/BalaoAzul.png")));
		lblNewLabel.add(azul2);
		azul2.setBounds(139, 431, 100, 284);
		
		
		vermelho2.setIcon(new ImageIcon(TelaGanhou.class.getResource("/Telas/BalaoVermelho.png")));
		lblNewLabel.add(vermelho2);
		vermelho2.setBounds(445, 553, 100, 284);
		
		
		verde2.setIcon(new ImageIcon(TelaGanhou.class.getResource("/Telas/BalaoVerde.png")));
		lblNewLabel.add(verde2);
		verde2.setBounds(300, 396, 100, 284);
		
		amarelo2.setBounds(34, 540, 100, 284);
		lblNewLabel.add(amarelo2);
		amarelo2.setIcon(new ImageIcon(TelaGanhou.class.getResource("/Telas/BalaoAmarelo.png")));
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				ViasDoSistemaComplemento func = new ViasDoSistemaComplemento();
				func.setVisible(true);
			}
		});
		btnNewButton.setBounds(215, 592, 100, 23);
		contentPane.add(azul);
		
		
		azul.setIcon(new ImageIcon(TelaGanhou.class.getResource("/Telas/BalaoAzul.png")));
		azul.setBounds(387, 213, 100, 284);
		lblNewLabel.add(verde);
		
		
		verde.setIcon(new ImageIcon(TelaGanhou.class.getResource("/Telas/BalaoVerde.png")));
		verde.setBounds(10, 146, 100, 284);
		lblNewLabel.add(amarelo);
		
		amarelo.setBounds(222, 612, 100, 284);
		amarelo.setIcon(new ImageIcon(TelaGanhou.class.getResource("/Telas/BalaoAmarelo.png")));
		lblNewLabel.add(vermelho);
		
		
		vermelho.setIcon(new ImageIcon(TelaGanhou.class.getResource("/Telas/BalaoVermelho.png")));
		vermelho.setBounds(199, 98, 100, 284);
		
		
	}
	
	public class Movimento extends Thread{
		public void run(){
			while(true){
				try{
					sleep(15);
				}catch(Exception erro){
				}
				amarelo.setBounds(222,amarelo.getY()-2,100, 284);
				azul.setBounds(387,azul.getY()-2,100, 284);
				vermelho.setBounds(199,vermelho.getY()-1,100, 284);
				verde.setBounds(10,verde.getY()-1,100, 284);
				
				amarelo2.setBounds(34,amarelo2.getY()-2,100, 284);
				azul2.setBounds(139,azul2.getY()-2,100, 284);
				vermelho2.setBounds(445,vermelho2.getY()-2,100, 284);
				verde2.setBounds(300,verde2.getY()-2,100, 284);
			}
		}
		
	}

}
