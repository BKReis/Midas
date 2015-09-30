import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

import javax.swing.*;

// O codigo está bem seco, mas já podemos iniciar o modelo de como o usuario irá se cadastrar para o MIDAS //

public class Usuario extends JFrame {


	private JTextField nome; 
	private JTextField sobrenome;
	private JTextField email;
	private JPasswordField senha;
	private JButton enviar;	
	private JRadioButton sexo_masc;
	private JRadioButton sexo_fem;
	private ButtonGroup radioGroup;
	private JComboBox box_profissao;
	
	private static final String[] profissao = 
		{ "Estudante", "Professor", "Encanador", "Programador", "Adicionar Ultimo"};
	// MUDAR PROFISSOES!!!
	
	public Usuario(){

		super("Cadastro de Usuario"); // utiliza construtor da super classe JFrame
		setLayout(new FlowLayout()); // Configura o layout do frame (ainda não descobri como melhorar) 

		nome = new JTextField("Primeiro Nome",10);
		nome.setToolTipText("Insira aqui seu primeiro nome"); // Dicas que aparecem ao passar o mouse pelo campo
		add(nome);
		
		sobrenome = new JTextField("Ultimo Nome",10);
		sobrenome.setToolTipText("Insira aqui seu ultimo nome");
		add(sobrenome);
		
		email = new JTextField("Email",20);
		email.setToolTipText("Insira aqui seu email");
		add(email);
		
		sexo_masc = new JRadioButton("Masculino",false); // cria botoes para ambos os sexos
		sexo_fem = new JRadioButton("Feminino",false); // devemos adicionar mais sexos?
		add(sexo_masc);
		add(sexo_fem);
		
		radioGroup = new ButtonGroup(); // cria relacionamento entre botoes, ou seja, quando um esta clicado
		radioGroup.add(sexo_masc); // o outro estara desclicado
		radioGroup.add(sexo_fem);
		
		box_profissao = new JComboBox(profissao); // String que pertence ao box
		box_profissao.setMaximumRowCount(5); // Numero máximo de itens
		add(box_profissao);
		
		senha = new JPasswordField("Hidden Text",10);
		senha.setToolTipText("A senha deve ter tamanho 6 e conter characteres e numeros"); // refazer com o pessoal de segurança
		add(senha);
		
		enviar = new JButton("Enviar");
		add(enviar);

		ButtonHandler handler = new ButtonHandler(); // cria o manipulador de eventos
		
		enviar.addActionListener(handler); // cria uma escuta para o botao enviar
	}
	
	public class ButtonHandler implements ActionListener{ // classe interna que indica a ação de manipulação
		
		public void actionPerformed(ActionEvent event){
		
			if(event.getSource() == enviar){
				JOptionPane.showMessageDialog(null, "Cadastro Enviado com sucesso", "Confirmação de Cadastro", JOptionPane.OK_OPTION);
			}
		}
		
	}
}
