package exercio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaNome extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNome frame = new TelaNome();
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
	public TelaNome() {
		setTitle("Nome Completo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(38, 36, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(126, 33, 183, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(38, 93, 85, 14);
		contentPane.add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(133, 90, 189, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome completo:");
		lblNewLabel.setBounds(38, 189, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblresposta = new JLabel(" ");
		lblresposta.setBounds(202, 189, 160, 14);
		contentPane.add(lblresposta);
		
		JButton btnAgrupar = new JButton("Agrupar");
		btnAgrupar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mensagem =  txtNome.getText()  + " " + txtSobrenome.getText();
				
				lblresposta.setText(mensagem);
				
			}
		});
		btnAgrupar.setBounds(155, 227, 89, 23);
		contentPane.add(btnAgrupar);
	}

}
