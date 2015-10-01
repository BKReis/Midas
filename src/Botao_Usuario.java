import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Botao_Usuario extends JFrame{
	private JButton possui_cadastro; //botao que seleciona se a pessoa possui cadastro
	private JButton nao_possui_cadastro;
	private JTextField selecione;
	
	public Botao_Usuario(){
		super("Opções de usuario");
		setLayout(new FlowLayout()); //configura o layout de frame
		this.setLocation(400,300); //Posicionar o layout no lugar desejado da tela
		
		selecione = new JTextField("\t    Selecione uma das opções:",30);
		add(selecione);
		selecione.setEditable(false);
		
		possui_cadastro = new JButton("Já Possuo cadastro");
		add(possui_cadastro);
		
		nao_possui_cadastro = new JButton("Requisitar cadastro");
		add(nao_possui_cadastro);
		
		//	Manipulador de evento de botao
		ButtonHandler handler = new ButtonHandler();
		nao_possui_cadastro.addActionListener(handler);
		possui_cadastro.addActionListener(handler);
		
		JOptionPane.showMessageDialog(null,"Bem-vindo ao MIDAS!");
	}
	
//	Classe interna para tratamento de evento de botao
	private class ButtonHandler implements ActionListener{
//		trata evento de botao
		public void actionPerformed(ActionEvent event){
			
			if(event.getSource() == possui_cadastro ){
				Botao_Usuario.this.dispose();				
				Login_Usuario textFieldFrame = new Login_Usuario();
				textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				textFieldFrame.setSize(350,100);
				textFieldFrame.setVisible(true);
			}	
			if(event.getSource() == nao_possui_cadastro ){
				Botao_Usuario.this.dispose();

				Usuario frame = new Usuario(); // cria um frame para Usuario
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // fechar o programa ao fechar a janela
				frame.setSize(300,300); // tamanho da janela
				frame.setVisible(true); // ÃƒÂ© visivel
			}
		}
	}
}
