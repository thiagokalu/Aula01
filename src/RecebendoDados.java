import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		String nome; 
		System.out.println("Este Programa lê dados");
		System.out.println("por favor, digite seu nome");
		leitor.next();
		nome = leitor.next();
		System.out.println("Que legal ter você aqui," + nome);
		leitor.close();
	}
		
}
