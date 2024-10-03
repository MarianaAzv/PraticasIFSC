package exercicio4e5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RestauranteTela extends JFrame {

	private JPanel contentPane;
	private JTextField txtQPrato;

	/**
	 * Launch the application.
	 */
	
	public static double calculo (double Kgprato) {
		double kgtotal;
		double precokg = 9.95;
		
		return kgtotal = precokg * Kgprato;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestauranteTela frame = new RestauranteTela();
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
	public RestauranteTela() {
		setTitle("CalcularQuilos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQPrato = new JLabel("Quilo do prato:");
		lblQPrato.setBounds(45, 38, 102, 14);
		contentPane.add(lblQPrato);
		
		txtQPrato = new JTextField();
		txtQPrato.setBounds(167, 35, 86, 20);
		contentPane.add(txtQPrato);
		txtQPrato.setColumns(10);
		
		JLabel lblPQ = new JLabel("Preco do quilo:");
		lblPQ.setBounds(50, 91, 80, 14);
		contentPane.add(lblPQ);
		
		JLabel lblpreQ = new JLabel("9.95");
		lblpreQ.setBounds(153, 91, 46, 14);
		contentPane.add(lblpreQ);
		
		JLabel lblValorPagar = new JLabel("Valor total:");
		lblValorPagar.setBounds(66, 151, 81, 14);
		contentPane.add(lblValorPagar);
		
		JLabel lblrespostaTotal = new JLabel(" ");
		lblrespostaTotal.setBounds(177, 151, 86, 14);
		contentPane.add(lblrespostaTotal);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Valorqpr = Double.parseDouble(txtQPrato.getText());
				
			double calc = calculo (Valorqpr);
			lblrespostaTotal.setText(String.format("%.2f",calc));
			
			}
		});
		btncalcular.setBounds(131, 211, 89, 23);
		contentPane.add(btncalcular);
	}

}
