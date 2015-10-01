import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

// O codigo estÃ¡ bem seco, mas jÃ¡ podemos iniciar o modelo de como o usuario irÃ¡ se cadastrar para o MIDAS //

public class Usuario extends JFrame {

	private JTextField nome,sobrenome,email,cpf;
	private JTextField campoSenha; 
	private JPasswordField senha,confirmacaoSenha;
	private JButton enviar;	
	private JRadioButton sexo_masc;
	private JRadioButton sexo_fem;
	private ButtonGroup radioGroup;
	private JComboBox box_profissao;
	private String senhaUsuario,senhaValidacao;
	
	private static final String[] profissao = 
		{ "Estudante", "Professor", "Encanador", "Programador", "Adicionar Ultimo"};
	// MUDAR PROFISSOES!!!
	
	public Usuario(){

		super("Cadastro de Usuario"); // utiliza construtor da super classe JFrame
		setLayout(new FlowLayout()); // Configura o layout do frame (ainda nÃ£o descobri como melhorar)
		this.setLocation(530,240); //Posicionar o layout no lugar desejado da tela

		nome = new JTextField("Primeiro Nome",10);
		nome.setToolTipText("Insira aqui seu primeiro nome"); // Dicas que aparecem ao passar o mouse pelo campo
		add(nome);
		
		sobrenome = new JTextField("Ultimo Nome",10);
		sobrenome.setToolTipText("Insira aqui seu ultimo nome");
		add(sobrenome);
		
		email = new JTextField("Email",10);
		email.setToolTipText("Insira aqui seu email");
		add(email);
		
		cpf = new JTextField("CPF",10);
		cpf.setToolTipText("Insira aqui seu CPF"); // Dicas que aparecem ao passar o mouse pelo campo
		add(cpf);
		
		sexo_masc = new JRadioButton("Masculino",false); // cria botoes para ambos os sexos
		sexo_fem = new JRadioButton("Feminino",false); // devemos adicionar mais sexos?
		add(sexo_masc);
		add(sexo_fem);
		
		radioGroup = new ButtonGroup(); // cria relacionamento entre botoes, ou seja, quando um esta clicado
		radioGroup.add(sexo_masc); // o outro estara desclicado
		radioGroup.add(sexo_fem);
		
		campoSenha = new JTextField("                 Senha:",12);
		add(campoSenha);
		campoSenha.setEditable(false);
		senha = new JPasswordField("Hidden Text",10);
		senha.setToolTipText("A senha deve ter tamanho 6 e conter characteres e numeros"); // refazer com o pessoal de seguranÃ§a
		add(senha);
		senhaUsuario = senha.getText();
		
		
		campoSenha = new JTextField(" Confirmação de Senha:",12);
		add(campoSenha);
		campoSenha.setEditable(false);
		confirmacaoSenha = new JPasswordField("Hidden Text",10);
		confirmacaoSenha.setToolTipText("Repita a sua senha"); 
		add(confirmacaoSenha);
		senhaValidacao = confirmacaoSenha.getText();
		
		
		box_profissao = new JComboBox(profissao); // String que pertence ao box
		box_profissao.setMaximumRowCount(5); // Numero mÃ¡ximo de itens
		add(box_profissao);
		
		enviar = new JButton("Enviar");
		add(enviar);

		ButtonHandler handler = new ButtonHandler(); // cria o manipulador de eventos
		enviar.addActionListener(handler); // cria uma escuta para o botao enviar
		
//		Manipulador de evento de mouse
		ManipuladorMouse handler_mouse = new ManipuladorMouse();
	
		nome.addMouseListener(handler_mouse);
		sobrenome.addMouseListener(handler_mouse);
		email.addMouseListener(handler_mouse);
		cpf.addMouseListener(handler_mouse);
		senha.addMouseListener(handler_mouse);
		confirmacaoSenha.addMouseListener(handler_mouse);
	}
	
	public class ButtonHandler implements ActionListener{ // classe interna que indica a aÃ§Ã£o de manipulaÃ§Ã£o
		
		public void actionPerformed(ActionEvent event){
		
			if(event.getSource() == enviar){
				Usuario.this.dispose();
				JOptionPane.showMessageDialog(null, "Cadastro Enviado com sucesso", "ConfirmaÃ§Ã£o de Cadastro", JOptionPane.OK_OPTION);
			}
		}
	}
	
//	Classe interna para tratamento de mouse
	private class ManipuladorMouse implements MouseListener{  
        public void mousePressed(MouseEvent event){ 
        	
//        	Apagar o que tem escrito nos campos   	
            if(event.getSource() == nome)    
            	nome.setText("");
            else if(event.getSource() == sobrenome)
            	sobrenome.setText(""); 
            else if(event.getSource() == email)
            	email.setText("");
            else if(event.getSource() == senha)
            	senha.setText("");
            else if(event.getSource() == cpf)
            	cpf.setText("");
            else if(event.getSource() == confirmacaoSenha)
            	confirmacaoSenha.setText("");
           
        }   
         public void mouseEntered(MouseEvent event){
         }
         public void mouseExited(MouseEvent event){  
         }  
         public void mouseClicked(MouseEvent event){  
         }  
         public void mouseReleased(MouseEvent event){  
         }  
    }  
}
