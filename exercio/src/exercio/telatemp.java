package exercio;

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

public class telatemp extends JFrame {

	private JPanel contentPane;
	private JTextField txtfarenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telatemp frame = new telatemp();
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
	public telatemp() {
		
		setTitle("calculartemp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblfare = new JLabel(" temperatura Farenheit");
		lblfare.setBounds(33, 31, 154, 14);
		contentPane.add(lblfare);
		
		txtfarenheit = new JTextField();
		txtfarenheit.setBounds(197, 28, 86, 20);
		contentPane.add(txtfarenheit);
		txtfarenheit.setColumns(10);
		
		JLabel lblCelsus = new JLabel("Temperatura Celsus");
		lblCelsus.setBounds(33, 105, 129, 14);
		contentPane.add(lblCelsus);
		
		JLabel lblresposta = new JLabel(" ");
		lblresposta.setBounds(220, 105, 103, 14);
		contentPane.add(lblresposta);
		
		JButton btnconverter = new JButton("converter");
		btnconverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				converter conv = new converter();
			
				double paraparametempfare = Double.parseDouble(txtfarenheit.getText());
			double cal = conv.conver(paraparametempfare );
			
			//String str = Double.toString(cal);
			//lblresposta.setText(str);
			
			 lblresposta.setText(String.format("%.2f", cal));
			return;
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Por favoe, colocar valor valido","Atençao", JOptionPane.ERROR_MESSAGE);
				}
				}
			
		});
		btnconverter.setBounds(146, 189, 89, 23);
		contentPane.add(btnconverter);
	}

}
