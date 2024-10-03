package calclarTela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calcularTela extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtBase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcularTela frame = new calcularTela();
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
	public calcularTela() {
		setTitle("CalcularRetangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAltura = new JLabel("Informe a altura:");
		lblAltura.setBounds(28, 43, 126, 14);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(144, 37, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblBase = new JLabel("Informe a base:");
		lblBase.setBounds(28, 90, 106, 14);
		contentPane.add(lblBase);
		
		txtBase = new JTextField();
		txtBase.setBounds(144, 87, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(38, 141, 46, 14);
		contentPane.add(lblArea);
		
		JLabel lblrespostaArea = new JLabel(" ");
		lblrespostaArea.setBounds(94, 141, 60, 14);
		contentPane.add(lblrespostaArea);
		
		JLabel lblPerímetro = new JLabel("Perímetro:");
		lblPerímetro.setBounds(224, 141, 66, 14);
		contentPane.add(lblPerímetro);
		
		JLabel lblrespostaPerímetro = new JLabel(" ");
		lblrespostaPerímetro.setBounds(300, 141, 75, 14);
		contentPane.add(lblrespostaPerímetro);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Retangulo calc = new Retangulo();
		
				
			double base = Double.parseDouble(txtBase.getText());
			double area = Double.parseDouble(txtAltura.getText());
			
			double calper = calc.calculoPerime(base,area);
			double calarea = calc.calcularea(base,area);
			
			
			lblrespostaPerímetro.setText(String.format("%.2f", calper));
			
			lblrespostaArea.setText(String.format("%.2f",calarea));
			}
		});
		btnCalcular.setBounds(129, 209, 89, 23);
		contentPane.add(btnCalcular);
	}
}
