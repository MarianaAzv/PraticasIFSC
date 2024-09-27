package test;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class validarida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JLabel lblresposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					validarida frame = new validarida();
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
	public validarida() {
		setTitle("Validador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Traditional Arabic", Font.PLAIN, 17));
		lblNome.setBounds(100, 68, 63, 17);
		contentPane.add(lblNome);
		
		JLabel lblidade = new JLabel("Idade:");
		lblidade.setFont(new Font("Traditional Arabic", Font.PLAIN, 16));
		lblidade.setBounds(100, 132, 46, 17);
		contentPane.add(lblidade);
		
		txtNome = new JTextField();
		txtNome.setBounds(189, 68, 100, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(190, 132, 63, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblresposta = new JLabel(" ");
		lblresposta.setBounds(66, 237, 358, 14);
		contentPane.add(lblresposta);
		
		
		JButton btnValidar = new JButton("validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	mostrarResultado();
				
				String nome = txtNome.getText();
				String idadeSt = txtIdade.getText();
				
				if(nome.isEmpty()) {
					lblresposta.setText("Por favor, insira um nome");
					return;
				}
				
				try {
				int idade = Integer.parseInt(idadeSt);
				
				if(idade < 0) {
					lblresposta.setText("Por favor, insira uma idade positiva");
					return;
				} 
				
				String mensagem = "Nome: "+ nome + " Idade: " + idade;
				
							
				if(idade < 18) {
				mensagem += " (Menor de idade)"; 	
				}else {
					mensagem += " (Maior de idade)";
				}
				
				
				lblresposta.setText(mensagem);
				
				}catch(NumberFormatException ex) {
					
					lblresposta.setText("Por favor, insira uma idade valida!");
				}
				
			}
		});
		btnValidar.setBounds(164, 208, 89, 23);
		contentPane.add(btnValidar);
		
		
	}
//	private void mostrarResultado() {
//		String nome = txtNome.getText();
	//	String idadeSt = txtIdade.getText();
		
	//	lblresposta.setText(nome);
	//}
}
