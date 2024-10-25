package cccc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cccc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cccc frame = new cccc();
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
	public cccc() {
		setTitle("Pizzaria QuantoMaisBarataMelhor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(236, 236, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(234, 234, 234));
		panel.setBounds(10, 29, 158, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbx4Queijos = new JCheckBox("4 Queijos R$10");
		chckbx4Queijos.setBounds(6, 5, 146, 23);
		panel.add(chckbx4Queijos);
		
		JCheckBox chckbxVegetariana = new JCheckBox("Vegetariana R$10");
		chckbxVegetariana.setBounds(6, 31, 146, 23);
		panel.add(chckbxVegetariana);
		
		JCheckBox chckbxCalabresa = new JCheckBox("Calabresa R$10");
		chckbxCalabresa.setBounds(6, 57, 146, 23);
		panel.add(chckbxCalabresa);
		
		JCheckBox chckbxPeperone = new JCheckBox("Peperone R$10");
		chckbxPeperone.setBounds(6, 83, 146, 23);
		panel.add(chckbxPeperone);
		
		JCheckBox chckbxMilho = new JCheckBox("Milho R$10");
		chckbxMilho.setBounds(6, 109, 146, 23);
		panel.add(chckbxMilho);
		
		JCheckBox chckbxDaCasa = new JCheckBox("Da Casa R$10");
		chckbxDaCasa.setBounds(6, 135, 146, 23);
		panel.add(chckbxDaCasa);
		
		JCheckBox chckbxFranco = new JCheckBox("Franco R$10");
		chckbxFranco.setBounds(6, 161, 146, 23);
		panel.add(chckbxFranco);
		
		JCheckBox chckbxMargarita = new JCheckBox("Marguarita R$10");
		chckbxMargarita.setBounds(6, 187, 146, 23);
		panel.add(chckbxMargarita);
		
		JCheckBox chckbxPortuguesa = new JCheckBox("Portuguesa R$10");
		chckbxPortuguesa.setBounds(6, 213, 146, 23);
		panel.add(chckbxPortuguesa);
		
		JCheckBox chckbxEspanhola = new JCheckBox("Espanhola R$10");
		chckbxEspanhola.setBounds(6, 239, 146, 23);
		panel.add(chckbxEspanhola);
		
		JLabel lblSaboresPizza = new JLabel("Sabor Pizza:");
		lblSaboresPizza.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSaboresPizza.setBounds(41, 11, 95, 14);
		contentPane.add(lblSaboresPizza);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(234, 234, 234));
		panel_1.setBounds(191, 29, 243, 103);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAdicionais = new JLabel("Adicionais -Sem limites");
		lblAdicionais.setBounds(21, 5, 154, 16);
		lblAdicionais.setFont(new Font("Verdana", Font.BOLD, 12));
		panel_1.add(lblAdicionais);
		
		JCheckBox chckbxADMaionese = new JCheckBox("MaioneseR$4");
		chckbxADMaionese.setBounds(6, 28, 116, 23);
		panel_1.add(chckbxADMaionese);
		
		JCheckBox chckbxADketchup = new JCheckBox("KetchupR$5");
		chckbxADketchup.setBounds(137, 28, 100, 23);
		panel_1.add(chckbxADketchup);
		
		JCheckBox chckbxADMostarda = new JCheckBox("MostardaR$7");
		chckbxADMostarda.setBounds(6, 54, 116, 23);
		panel_1.add(chckbxADMostarda);
		
		JCheckBox chckbxADMolho = new JCheckBox("MolhoR$9");
		chckbxADMolho.setBounds(137, 54, 101, 23);
		panel_1.add(chckbxADMolho);
		
		JLabel lblBordas = new JLabel("Borda:");
		lblBordas.setFont(new Font("Verdana", Font.BOLD, 12));
		lblBordas.setBounds(261, 143, 70, 14);
		contentPane.add(lblBordas);
		
		JRadioButton rdbtnSemBordas = new JRadioButton("Sem borda R$ 0");
		rdbtnSemBordas.setBounds(174, 164, 129, 23);
		contentPane.add(rdbtnSemBordas);
		
		JRadioButton rdbtnComBordas = new JRadioButton("Com borda R$ 4");
		rdbtnComBordas.setBounds(305, 164, 141, 23);
		contentPane.add(rdbtnComBordas);
		
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnSemBordas);
		grupo.add(rdbtnComBordas);

		
		JLabel lblFormadeEntrega = new JLabel("Forma de Entrega");
		lblFormadeEntrega.setFont(new Font("Verdana", Font.BOLD, 12));
		lblFormadeEntrega.setBounds(230, 202, 157, 14);
		contentPane.add(lblFormadeEntrega);
		
		JComboBox comboBoxFE = new JComboBox();
		comboBoxFE.setModel(new DefaultComboBoxModel(new String[] {"Tele entrega", "Retirar no local"}));
		comboBoxFE.setBounds(217, 227, 134, 22);
		contentPane.add(comboBoxFE);
		
		
		
	

		
		JLabel lblResposta = new JLabel(" ");
		lblResposta.setBounds(305, 270, 100, 33);
		contentPane.add(lblResposta);
		
		
		JButton btnValorFinal = new JButton("Valor final");
		btnValorFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == btnValorFinal){
				
					JOptionPane.showMessageDialog(null, comboBoxFE.getSelectedItem());
					}
 
				int q =0;
				 
				double ValorPizz;
					if (chckbx4Queijos.isSelected()){
						  q++;
						}
						
					
					if (chckbxVegetariana.isSelected()){
						  q++;
						}
						
					if (chckbxCalabresa.isSelected()){
						  q++;
						}
						
					if (chckbxPeperone.isSelected()){
						  q++;
						}
						
					if (chckbxMilho.isSelected()){
						  q++;
						}
						
					if (chckbxDaCasa.isSelected()){
						  q++;
						}
						
					if (chckbxFranco.isSelected()){
						  q++;
						}
						
					if (chckbxMargarita.isSelected()){
						  q++;
						}
						
					if (chckbxPortuguesa.isSelected()){
						  q++;
						}
						
					if (chckbxEspanhola.isSelected()){
						 q++;
						}
					if(q> 3) {
						JOptionPane.showMessageDialog(null,"Tem mais de 3 sabores selecionados","Resposta NAO",JOptionPane.ERROR_MESSAGE);
					}else{
						 ValorPizz = 10 * q;
						 double adicionaisValor= 0;
						 if (rdbtnComBordas.isSelected()){
							 ValorPizz += 4;
							
					
					
					if (chckbxADMaionese.isSelected()){
						ValorPizz += 4;
						}
					
					
					if (chckbxADMostarda.isSelected()){
						ValorPizz += 7;
						}
					
					if (chckbxADketchup.isSelected()){
						ValorPizz += 5;
						}
					
					if (chckbxADMolho.isSelected()){
						 ValorPizz += 9;
						}
					double valorfinalComborda = ValorPizz;
					 JOptionPane.showMessageDialog(null, "Valor total do pedido: " + valorfinalComborda);
						 } else if (rdbtnSemBordas.isSelected()){
							
					if (chckbxADMaionese.isSelected()){
						 ValorPizz += 4;
						}
					
					
					if (chckbxADMostarda.isSelected()){
						 ValorPizz += 7;
						}
					
					if (chckbxADketchup.isSelected()){
						 ValorPizz += 5;
						}
					
					if (chckbxADMolho.isSelected()){
						 ValorPizz += 9;
						}
					
					  double valorfinal =  ValorPizz ;
					  JOptionPane.showMessageDialog(null, "Valor total do pedido: " + valorfinal);
						 }
						
						
					}
			}
		});
		btnValorFinal.setBounds(178, 260, 103, 52);
		contentPane.add(btnValorFinal);
		
		
	}
}
