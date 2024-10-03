package exercicio4e5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGasolina extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorX;
	private JTextField txtPagar;

	/**
	 * Launch the application.
	 */
	
	
	public static double calculo(double valolitro, double quantdinhe) {
		
		double litro = (quantdinhe/valolitro);
		return litro;
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGasolina frame = new TelaGasolina();
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
	public TelaGasolina() {
		setTitle("CalculoGasolina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValorX = new JLabel("Valor da gasolina");
		lblValorX.setBounds(37, 29, 100, 14);
		contentPane.add(lblValorX);
		
		txtValorX = new JTextField();
		txtValorX.setBounds(168, 26, 86, 20);
		contentPane.add(txtValorX);
		txtValorX.setColumns(10);
		
		JLabel lblPagar = new JLabel("Valor Pagar:");
		lblPagar.setBounds(47, 72, 90, 14);
		contentPane.add(lblPagar);
		
		txtPagar = new JTextField();
		txtPagar.setBounds(168, 72, 86, 20);
		contentPane.add(txtPagar);
		txtPagar.setColumns(10);
		
				
		JLabel lblQuantlitro = new JLabel("Quantidade do litro:");
		lblQuantlitro.setBounds(47, 136, 127, 14);
		contentPane.add(lblQuantlitro);
		
		JLabel lblresposta = new JLabel(" ");
		lblresposta.setBounds(184, 136, 46, 14);
		contentPane.add(lblresposta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				double valorX = Double.parseDouble(txtValorX.getText());
				double valorfinal = Double.parseDouble(txtPagar.getText());
				
				double litro =calculo(valorX,valorfinal);
				lblresposta.setText(String.format("%.2f",litro));
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Por favoe, colocar valor valido","Atençao", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnCalcular.setBounds(123, 213, 89, 23);
		contentPane.add(btnCalcular);
	}

}
