package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.PageAttributes;
import java.awt.Panel;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class CadastroClienteBoundary {
	
	
	public CadastroClienteBoundary() {
		// TODO Auto-generated constructor stub
	JFrame janela = new JFrame("Cadastro de Cliente");
	JPanel panel = new JPanel(new BorderLayout());
	
		
	panel.add(Norte(), BorderLayout.NORTH);
	panel.add(Centro(),BorderLayout.CENTER);
	panel.add(Sul(),BorderLayout.SOUTH);
	//panel.add(Esquerdo(), BorderLayout.WEST);
	
	
	
	janela.setContentPane(panel);
	
	
	
	janela.setVisible(true);
	janela.setSize(1000, 600);
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
	public JComponent Norte (){
		JPanel panelNorte = new JPanel(new BorderLayout());
		panelNorte.setBackground(Color.WHITE);
		JLabel txtTitulo = new JLabel("Identifica��o - Fa�a seu cadastro");
		txtTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JLabel txtLogin = new JLabel("J� tem cadastro? Fa�a o login");
		
		panelNorte.add(txtLogin,BorderLayout.EAST);
		panelNorte.add(txtTitulo,BorderLayout.CENTER);
		
		
		return panelNorte;
	
	}
	public JComponent Centro(){
		JPanel panelCentro = new JPanel(new GridLayout(14,1,10,10));
		
		panelCentro.setBackground(Color.WHITE);
		
		
		JLabel txtNome = new JLabel("*Nome Completo: ");
		panelCentro.add(txtNome);
		JTextField nome = new JTextField(30);
		panelCentro.add(nome);
		
		JLabel txtCPF = new JLabel("*CPF: ");
		panelCentro.add(txtCPF);
		JTextField cpf = new JTextField(10);
		panelCentro.add(cpf);
		
		JLabel txtRG = new JLabel("*RG: ");
		panelCentro.add(txtRG);
		JTextField RG = new JTextField(10);
		panelCentro.add(RG);
		
		JLabel lblCEP = new JLabel("*CEP: ");
		panelCentro.add(lblCEP);
		JTextField CEP = new JTextField(10);
		panelCentro.add(CEP);
		
		
		
		JLabel lblLogradouro = new JLabel("*Logradouro: ");
		panelCentro.add(lblLogradouro);
		JTextField logradouro = new JTextField(30);
		panelCentro.add(logradouro);
		
		JLabel lblNumero = new JLabel("*N�mero: ");
		panelCentro.add(lblNumero);
		JTextField Numero = new JTextField(30);
		panelCentro.add(Numero);
	
		JLabel lblComplemento = new JLabel("*Complemento: ");
		panelCentro.add(lblComplemento);
		JTextField Complemento = new JTextField(30);
		panelCentro.add(Complemento);
		

		JLabel lblBairro = new JLabel("*Bairro: ");
		panelCentro.add(lblBairro);
		JTextField Bairro = new JTextField(30);
		panelCentro.add(Bairro);
		
		JLabel lblUF = new JLabel("*UF");
		panelCentro.add(lblUF);
		JComboBox cbUF = new JComboBox();
		Vector UF = new Vector();
		
		UF.add("");
		UF.add("SP");
		UF.add("RJ");
		UF.add("MG");
		UF.add("BA");
		UF.add("MT");
		
		for (int i=0;i<UF.size();i++){
			cbUF.addItem(UF.get(i));
		}
		
		
		panelCentro.add(cbUF);

		
		JLabel lblCidade = new JLabel("*Cidade: ");
		panelCentro.add(lblCidade);
		JTextField Cidade = new JTextField(30);
		panelCentro.add(Cidade);

		
		
		
		JLabel lblSexo = new JLabel("*Sexo");
		panelCentro.add(lblSexo);
		JComboBox cbSexo = new JComboBox();
		Vector Sexo = new Vector();
		Sexo.add("");
		Sexo.add("Masculino");
		Sexo.add("Feminino");
		Sexo.add("N�o informado");
		for (int i=0;i<Sexo.size();i++){
			cbSexo.addItem(Sexo.get(i));
			
		}
		
		
		
		
		panelCentro.add(cbSexo);
		
		JLabel lblEmail = new JLabel("*Email: ");
		panelCentro.add(lblEmail);
		JTextField Email = new JTextField(30);
		panelCentro.add(Email);
		
		
		JLabel lblTelefone = new JLabel("*Telefone: ");
		panelCentro.add(lblTelefone);
		JTextField Telefone = new JTextField(10);
		panelCentro.add(Telefone);
		
		JLabel lblCelular = new JLabel("*Celular: ");
		panelCentro.add(lblCelular);
		JTextField Celular = new JTextField(10);
		panelCentro.add(Celular);
		
	
		
		

		
		
		return panelCentro;
	}
	
	public JComponent Esquerdo(){
		
		JPanel panelEsquerdo = new JPanel(new FlowLayout());
		panelEsquerdo.setBackground(Color.WHITE);
		JLabel myAcc = new JLabel("Minha Conta");
		
		panelEsquerdo.add(myAcc);
		
		
		
		
		return panelEsquerdo; 
	}
	
	public JComponent Sul (){
		JPanel PanelSul = new JPanel();
		PanelSul.setBackground(Color.WHITE);
		PanelSul.setLayout(new BorderLayout());
		
		JButton btnCadastrar = new JButton("Concluir Cadastro");
		PanelSul.add(btnCadastrar, BorderLayout.EAST);
		btnCadastrar.setBackground(Color.GREEN);
		btnCadastrar.setForeground(Color.WHITE);
		
		
		
		return PanelSul;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new CadastroClienteBoundary();
	}
	

}
