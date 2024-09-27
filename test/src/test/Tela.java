package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	
	
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setTitle("primeiratela");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel LblSaude = new JLabel("Ola mundo");
		LblSaude.setBounds(177, 65, 75, 37);
		LblSaude.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(LblSaude);
		
		JButton lblfecharbotao = new JButton("fechar");
		lblfecharbotao.setBounds(163, 222, 103, 23);
		lblfecharbotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	setVisible(false);
			
			}
		});
		getContentPane().add(lblfecharbotao);
		
		JButton btntexte1 = new JButton("Texte1");
		btntexte1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bom dia amigos do I5 do IFSC Gaspar");
			}
		});
		btntexte1.setBounds(38, 163, 84, 23);
		getContentPane().add(btntexte1);
		
		JButton btnTexte2 = new JButton("Texte2");
		btnTexte2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta =JOptionPane.showConfirmDialog(null, "Voce esta gostando de programar","Confirmação", JOptionPane.YES_NO_OPTION);
				System.out.println(resposta);
				if(resposta== 0) {
					JOptionPane.showMessageDialog(null,"Que bom que esta gostando de programaçao,eu tambem","Resposta SIM",JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Que pena","Resposta NAO",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnTexte2.setBounds(163, 163, 89, 23);
		getContentPane().add(btnTexte2);
		
		JButton btnTeste3 = new JButton("Teste3");
		btnTeste3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String nome=JOptionPane.showInputDialog(null,"Qual seu nome?","Entrada nome",JOptionPane.QUESTION_MESSAGE);
			
			JOptionPane.showMessageDialog(null,"O nome digitado: "+ nome);
			}
			
		});
		btnTeste3.setBounds(294, 163, 89, 23);
		getContentPane().add(btnTeste3);

	}
}
