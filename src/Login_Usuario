import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login_Usuario extends JFrame {
	
	private JTextField campoLogin;
	private JPasswordField campoSenha;
	private JButton fazerLogin; 
	private String senha, login;
	
	public Login_Usuario(){
		
		super("Login");
		setLayout(new FlowLayout());
		this.setLocation(400,300); //Posicionar o layout no lugar desejado da tela
		
		//Constroi o campoLogin com 10 colunas
		campoLogin = new JTextField("Insira aqui o seu login",13);   
		add(campoLogin); //Adiciona campoLogin1 ao JFrame
		campoLogin.setToolTipText("Insira o seu login");
		
		campoSenha = new JPasswordField("senha",10);
		add(campoSenha);
		campoSenha.setToolTipText("Insira a sua senha");
		
		fazerLogin = new JButton("Fazer Login");
		add(fazerLogin);
		
		//	Manipulador de evento de mouse
		ManipuladorMouse handler_mouse = new ManipuladorMouse(); 
		campoSenha.addMouseListener(handler_mouse);
		campoLogin.addMouseListener(handler_mouse);
		
		// Manipulador de evento de botao
		ButtonHandler handler_botao = new ButtonHandler();
		fazerLogin.addActionListener(handler_botao);
		
	}	
	
//	Classe interna para tratamento de mouse
	private class ManipuladorMouse implements MouseListener{  
        public void mousePressed(MouseEvent event){  
//        	Apagar o que tem escrito nos campos
        	
            if(event.getSource() == campoLogin)    
            	campoLogin.setText("");
            else if(event.getSource() == campoSenha){
            	campoSenha.setText("");
            	
            }
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
	
//	Classe interna para tratamento de evento de botao
	private class ButtonHandler implements ActionListener{
//		trata evento de botao
		public void actionPerformed(ActionEvent event){
			
			if(event.getSource() == fazerLogin ){
				Login_Usuario.this.dispose();
				login = campoLogin.getText();
				senha = campoSenha.getText();
			}
		}
	}
}
