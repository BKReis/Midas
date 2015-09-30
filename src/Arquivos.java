// READ ME
// Essa classe ainda não foi testada. Ela deverá comunicar classe da classe que pede o cadastro, pra que sejam armazenados no
// arquivo as informações do usuário, conforme especificado em documento no Dropbox. Ainda devem ser criadas os metodos
// de conferencia de usuario e senha para acesso de um usuario já cadastrado, além de verificações necessárias para
// evitar erros de inserção do usuário.


import java.io.*;

public class Arquivos  {

	
	private File arquivo = null;
	private FileWriter escritor = null;
	private FileReader leitor = null;
	
	public Arquivos (String nome_arquivo) throws IOException {
		// Construtor que cria o arquivo e instancia o leitor e o escritor.
		
		arquivo = new File("home/MIDAS/%s"+nome_arquivo); // Caminho do arquivo é fixo?
		arquivo.createNewFile(); // Só cria se o arquivo ainda não existir 
		
		escritor = new FileWriter(arquivo);// Cria o objeto de escrita
		leitor = new FileReader(arquivo);// Cria o objeto de leitura
		
	}

	public void gravarInfo(String info) throws IOException{
		
		 escritor.write(info);
		 escritor.close();
	}
	
	public char[] lerInfo() throws IOException{
		
		char[] dados = null; // cria string de buffer
		while (leitor.read(dados) != '\n'); // le dados do arquivo ate uma quebra de linha
		
		leitor.close(); 
		return dados;
		
	}
}

